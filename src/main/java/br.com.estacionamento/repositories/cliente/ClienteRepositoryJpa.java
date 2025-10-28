package br.com.estacionamento.repositories.cliente;

import br.com.estacionamento.interfaces.ClienteRepository;
import br.com.estacionamento.models.ClienteModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepositoryJpa implements ClienteRepository {

    private final ClienteModelRepositoryJpa clienteModelRepositoryJpa;

    @Autowired
    public ClienteRepositoryJpa(ClienteModelRepositoryJpa clienteModelRepositoryJpa) {
        this.clienteModelRepositoryJpa = clienteModelRepositoryJpa;
    }

    @Override
    public List<ClienteModels> buscarTodos() {
        return this.clienteModelRepositoryJpa.findAll();
    }

    @Override
    public ClienteModels buscarPorId(int id) {
        return this.clienteModelRepositoryJpa.findById(id).get();
    }

    @Override
    public void adicionar(ClienteModels clienteModels) {
        this.clienteModelRepositoryJpa.save(clienteModels);
    }

    @Override
    public void remover(int id) {
        this.clienteModelRepositoryJpa.deleteById(id);
    }

    @Override
    public void atualizar(int id, ClienteModels clienteModels) {
        ClienteModels clienteInDB = this.clienteModelRepositoryJpa.findById(id).get();

        clienteInDB.setNome(clienteModels.getNome());
        clienteInDB.setEmail(clienteModels.getEmail());
        clienteInDB.setEndereco(clienteModels.getEndereco());
        clienteInDB.setTelefone(clienteModels.getTelefone());

        this.clienteModelRepositoryJpa.save(clienteInDB);
    }
}
