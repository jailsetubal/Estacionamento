package br.com.estacionamento.repositories.formaPagamento;

import br.com.estacionamento.models.FormaPagamentoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormaPagamentoModelRepositoryJpa extends JpaRepository<FormaPagamentoModels, Integer> {
}
