package br.com.estacionamento.repositories.pagamento;

import br.com.estacionamento.models.PagamentoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoModelRepositoryJpa extends JpaRepository<PagamentoModels, Integer> {
}
