package br.com.estacionamento.repositories.movimentacao;

import br.com.estacionamento.models.MovimentacaoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoModelRepositoryJpa extends JpaRepository<MovimentacaoModels, Integer> {
}
