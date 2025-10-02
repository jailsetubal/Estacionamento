package br.com.estacionamento.repositories.plano;

import br.com.estacionamento.interfaces.PlanoRepository;
import br.com.estacionamento.models.PlanoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlanoRepositoryJpa implements PlanoRepository {
    private final PlanoModelRepositoryJpa planoModelRepositoryJpa;

    @Autowired
    public PlanoRepositoryJpa(PlanoModelRepositoryJpa planoModelRepositoryJpa) {
        this.planoModelRepositoryJpa = planoModelRepositoryJpa;
    }

    @Override
    public List<PlanoModels> buscarTodos() {
        return this.planoModelRepositoryJpa.findAll();
    }

    @Override
    public PlanoModels buscarPorId(int id) {
        return this.planoModelRepositoryJpa.findById(id).get();
    }

    @Override
    public void adicionar(PlanoModels planoModels) {
        this.planoModelRepositoryJpa.save(planoModels);
    }

    @Override
    public void remover(int id) {
        this.planoModelRepositoryJpa.deleteById(id);
    }

    @Override
    public void atualizar(int id, PlanoModels planoModels) {
        //
    }
}
