package br.com.estacionamento.repositories.vaga;

import br.com.estacionamento.models.VagaModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaModelRepositoryJpa extends JpaRepository<VagaModels, Integer> {
}
