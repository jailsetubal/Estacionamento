package br.com.estacionamento.repositories.sensor;

import br.com.estacionamento.models.SensorModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorModelRepositoryJpa extends JpaRepository<SensorModels, Integer> {
}
