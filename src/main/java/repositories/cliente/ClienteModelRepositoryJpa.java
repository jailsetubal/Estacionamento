package repositories.cliente;

import models.ClienteModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteModelRepositoryJpa extends JpaRepository<ClienteModels , Integer> {
}
