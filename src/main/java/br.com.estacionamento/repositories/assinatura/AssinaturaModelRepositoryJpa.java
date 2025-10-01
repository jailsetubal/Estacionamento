package br.com.estacionamento.repositories.assinatura;

import br.com.estacionamento.models.AssinaturaModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssinaturaModelRepositoryJpa extends JpaRepository<AssinaturaModels, Integer> {
}
