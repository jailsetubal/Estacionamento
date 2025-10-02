package br.com.estacionamento.repositories.plano;

import br.com.estacionamento.models.PlanoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanoModelRepositoryJpa extends JpaRepository<PlanoModels, Integer> {
}
