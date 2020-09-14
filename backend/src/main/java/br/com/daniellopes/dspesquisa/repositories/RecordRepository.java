package br.com.daniellopes.dspesquisa.repositories;

import br.com.daniellopes.dspesquisa.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
}
