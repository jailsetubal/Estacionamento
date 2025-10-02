package br.com.estacionamento.facades;

import br.com.estacionamento.applications.SensorApplication;
import br.com.estacionamento.entities.Sensor;
import br.com.estacionamento.models.SensorModels;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


@Component
public class SensorFacade {
    private final SensorApplication sensorApplication;

    public SensorFacade(SensorApplication sensorApplication) {
        this.sensorApplication = sensorApplication;
    }

    public List<SensorModels> buscarTodos() throws IOException {
        return this.sensorApplication.buscarTodos();
    }

    public SensorModels buscarPorId(int id) throws IOException {
        return this.sensorApplication.buscarPorId(id);
    }

    public void adicionar(SensorModels sensorModels) throws IOException {
        this.sensorApplication.adicionar(sensorModels);
    }

    public void remover(int id) throws IOException {
        this.sensorApplication.remover(id);
    }

    public void atualizar(int id, SensorModels sensorModels) throws IOException {
        this.sensorApplication.atualizar(sensorModels, id);
    }
}
