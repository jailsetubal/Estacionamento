package br.com.estacionamento.repositories.sensor;

import br.com.estacionamento.interfaces.SensorRepository;
import br.com.estacionamento.models.SensorModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SensorRepositoryJpa implements SensorRepository {
    private final SensorModelRepositoryJpa sensorModelRepositoryJpa;

    @Autowired
    public SensorRepositoryJpa(SensorModelRepositoryJpa sensorModelRepositoryJpa) {
        this.sensorModelRepositoryJpa = sensorModelRepositoryJpa;
    }

    @Override
    public List<SensorModels> buscarTodos() {
        return this.sensorModelRepositoryJpa.findAll();
    }

    @Override
    public SensorModels buscarPorId(int id) {
        return this.sensorModelRepositoryJpa.findById(id).get();
    }

    @Override
    public void adicionar(SensorModels sensorModels) {
        this.sensorModelRepositoryJpa.save(sensorModels);
    }

    @Override
    public void remover(int id) {
        this.sensorModelRepositoryJpa.deleteById(id);
    }

    @Override
    public void atualizar(int id, SensorModels sensorModels) {
        SensorModels sensorInDB = this.sensorModelRepositoryJpa.findById(id).get();

        sensorInDB.setDataInstalacao(sensorInDB.getDataInstalacao());
    }
}
