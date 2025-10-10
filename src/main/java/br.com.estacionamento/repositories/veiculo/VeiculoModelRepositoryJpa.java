package br.com.estacionamento.repositories.veiculo;

import br.com.estacionamento.models.VeiculoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoModelRepositoryJpa extends JpaRepository<VeiculoModels, Integer> {
}
