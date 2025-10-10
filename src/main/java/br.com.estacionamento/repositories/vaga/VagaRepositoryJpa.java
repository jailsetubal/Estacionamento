package br.com.estacionamento.repositories.vaga;

import br.com.estacionamento.entities.Vaga;
import br.com.estacionamento.interfaces.VagaRepository;
import br.com.estacionamento.models.ClienteModels;
import br.com.estacionamento.models.VagaModels;
import br.com.estacionamento.repositories.cliente.ClienteModelRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VagaRepositoryJpa implements VagaRepository {
    private final VagaModelRepositoryJpa vagaModelRepositoryJpa;

    @Autowired
    public VagaRepositoryJpa(VagaModelRepositoryJpa vagaModelRepositoryJpa) {
        this.vagaModelRepositoryJpa = vagaModelRepositoryJpa;
    }

    @Override
    public List<VagaModels> buscarTodos() {
        return this.vagaModelRepositoryJpa.findAll();
    }

    @Override
    public VagaModels buscarPorId(int id) {
        return this.vagaModelRepositoryJpa.findById(id).get();
    }

    @Override
    public void adicionar(VagaModels vagaModels) {
        this.vagaModelRepositoryJpa.save(vagaModels);
    }

    @Override
    public void remover(int id) {
        this.vagaModelRepositoryJpa.deleteById(id);
    }

    @Override
    public void atualizar(int id, VagaModels vagaModels) {
        VagaModels vagaInDB = this.vagaModelRepositoryJpa.findById(id).get();

        vagaInDB.setNumeroVaga(vagaModels.getNumeroVaga());
        vagaInDB.setTipoVaga(vagaModels.getTipoVaga());
        vagaInDB.setAndar(vagaModels.getAndar());
        vagaInDB.setSetor(vagaModels.getSetor());
        vagaInDB.setTemSensor(vagaInDB.isOcupado());
    }
}
