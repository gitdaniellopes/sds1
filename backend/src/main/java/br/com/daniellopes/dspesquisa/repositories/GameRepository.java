package br.com.daniellopes.dspesquisa.repositories;

import br.com.daniellopes.dspesquisa.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
