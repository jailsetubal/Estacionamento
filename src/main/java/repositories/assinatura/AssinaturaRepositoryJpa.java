package repositories.assinatura;

import models.AssinaturaModels;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.cliente.ClienteModelRepositoryJpa;

import java.util.List;

public class AssinaturaRepositoryJpa {
    private final ClienteModelRepositoryJpa estacionamentoModelRepositoryJpa;

    @Autowired
    public AssinaturaRepositoryJpa(ClienteModelRepositoryJpa estacionamentoModelRepositoryJpa) {
        this.estacionamentoModelRepositoryJpa = estacionamentoModelRepositoryJpa;
    }

    @Override
    public List<AssinaturaModels> buscarTodos() {
        return this.estacionamentoModelRepositoryJpa.findAll();
    }

    @Override
    public AssinaturaModels buscarPorId(int id) {
        return this.estacionamentoModelRepositoryJpa.findById(id).get();
    }

    @Override
    public void adicionar(AssinaturaModels assinaturaModels) {
        this.estacionamentoModelRepositoryJpa.save(assinaturaModels);
    }

    @Override
    public void remover(int id) {
        this.estacionamentoModelRepositoryJpa.deleteById(id);
    }

    @Override
    public void atualizar(int id, AssinaturaModels assinaturaModels) {
        //
    }
}
