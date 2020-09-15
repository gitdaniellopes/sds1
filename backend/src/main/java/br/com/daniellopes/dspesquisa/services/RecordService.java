package br.com.daniellopes.dspesquisa.services;

import br.com.daniellopes.dspesquisa.dto.RecordDTO;
import br.com.daniellopes.dspesquisa.dto.RecordInsertDTO;
import br.com.daniellopes.dspesquisa.entities.Game;
import br.com.daniellopes.dspesquisa.entities.Record;
import br.com.daniellopes.dspesquisa.repositories.GameRepository;
import br.com.daniellopes.dspesquisa.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional
    public RecordDTO insert(RecordInsertDTO dto) {
        Record record = new Record();
        record.setName(dto.getName());
        record.setAge(dto.getAge());
        record.setMoment(Instant.now());

        Game game = gameRepository.getOne(dto.getGameId());
        record.setGame(game);

        Record recordSave = recordRepository.save(record);
        return new RecordDTO(recordSave);
    }

    @Transactional(readOnly = true)
    public Page<RecordDTO> findByMoment(Instant minDate, Instant maxDate,
                                        PageRequest pageRequest) {

        return recordRepository.findByMoment(minDate, maxDate, pageRequest)
                .map(RecordDTO::new);
    }
}
