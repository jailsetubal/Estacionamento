package br.com.estacionamento.repositories.assinatura;

import br.com.estacionamento.models.AssinaturaModels;
import br.com.estacionamento.interfaces.AssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AssinaturaRepositoryJpa implements AssinaturaRepository {
    private final AssinaturaModelRepositoryJpa assinaturaModelRepositoryJpa;

    @Autowired
    public AssinaturaRepositoryJpa(AssinaturaModelRepositoryJpa assinaturaModelRepositoryJpa) {
        this.assinaturaModelRepositoryJpa = assinaturaModelRepositoryJpa;
    }

    @Override
    public List<AssinaturaModels> buscarTodos() {
        return this.assinaturaModelRepositoryJpa.findAll();
    }

    @Override
    public AssinaturaModels buscarPorId(int id) {
        return this.assinaturaModelRepositoryJpa.findById(id).get();
    }

    @Override
    public void adicionar(AssinaturaModels assinaturaModels) {
        this.assinaturaModelRepositoryJpa.save(assinaturaModels);
    }

    @Override
    public void remover(int id) {
        this.assinaturaModelRepositoryJpa.deleteById(id);
    }

    @Override
    public void atualizar(int id, AssinaturaModels assinaturaModels) {
        //
    }
}
