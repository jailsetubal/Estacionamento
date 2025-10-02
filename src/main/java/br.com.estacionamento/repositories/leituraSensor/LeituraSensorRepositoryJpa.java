package br.com.estacionamento.repositories.leituraSensor;

import br.com.estacionamento.interfaces.ClienteRepository;
import br.com.estacionamento.interfaces.LeituraSensorRepository;
import br.com.estacionamento.models.ClienteModels;
import br.com.estacionamento.models.LeituraSensorModels;
import br.com.estacionamento.repositories.cliente.ClienteModelRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LeituraSensorRepositoryJpa implements LeituraSensorRepository {

    private final LeituraSensorModelRepositoryJpa leituraSensorModelRepositoryJpa;

    @Autowired
    public LeituraSensorRepositoryJpa(LeituraSensorModelRepositoryJpa leituraSensorModelRepositoryJpa) {
        this.leituraSensorModelRepositoryJpa = leituraSensorModelRepositoryJpa;
    }

    @Override
    public List<LeituraSensorModels> buscarTodos() {
        return this.leituraSensorModelRepositoryJpa.findAll();
    }

    @Override
    public LeituraSensorModels buscarPorId(int id) {
        return this.leituraSensorModelRepositoryJpa.findById(id).get();
    }

    @Override
    public void adicionar(LeituraSensorModels leituraSensorModels) {
        this.leituraSensorModelRepositoryJpa.save(leituraSensorModels);
    }

    @Override
    public void remover(int id) {
        this.leituraSensorModelRepositoryJpa.deleteById(id);
    }

    @Override
    public void atualizar(int id, LeituraSensorModels leituraSensorModels) {
        //
    }
}
