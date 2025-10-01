package br.com.estacionamento.repositories.cliente;

import br.com.estacionamento.models.ClienteModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteModelRepositoryJpa extends JpaRepository<ClienteModels , Integer> {
}
