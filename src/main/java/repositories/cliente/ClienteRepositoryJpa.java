package repositories.cliente;

import interfaces.ClienteRepository;
import models.ClienteModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepositoryJpa implements ClienteRepository {

    private final ClienteModelRepositoryJpa estacionamentoModelRepositoryJpa;

    @Autowired
    public ClienteRepositoryJpa(ClienteModelRepositoryJpa estacionamentoModelRepositoryJpa) {
        this.estacionamentoModelRepositoryJpa = estacionamentoModelRepositoryJpa;
    }

    @Override
    public List<ClienteModels> buscarTodos() {
        return this.estacionamentoModelRepositoryJpa.findAll();
    }

    @Override
    public ClienteModels buscarPorId(int id) {
        return this.estacionamentoModelRepositoryJpa.findById(id).get();
    }

    @Override
    public void adicionar(ClienteModels clienteModels) {
        this.estacionamentoModelRepositoryJpa.save(clienteModels);
    }

    @Override
    public void remover(int id) {
        this.estacionamentoModelRepositoryJpa.deleteById(id);
    }

    @Override
    public void atualizar(int id, ClienteModels clienteModels) {
        //
    }
}
