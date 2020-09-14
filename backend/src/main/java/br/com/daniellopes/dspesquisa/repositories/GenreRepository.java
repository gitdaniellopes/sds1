package br.com.daniellopes.dspesquisa.repositories;

import br.com.daniellopes.dspesquisa.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
