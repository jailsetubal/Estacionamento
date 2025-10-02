package br.com.estacionamento.repositories.leituraSensor;

import br.com.estacionamento.models.LeituraSensorModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeituraSensorModelRepositoryJpa extends JpaRepository<LeituraSensorModels, Integer> {
}
