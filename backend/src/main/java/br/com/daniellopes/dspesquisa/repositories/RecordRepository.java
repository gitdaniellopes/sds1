package br.com.daniellopes.dspesquisa.repositories;

import br.com.daniellopes.dspesquisa.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
