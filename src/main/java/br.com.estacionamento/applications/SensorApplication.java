package br.com.estacionamento.applications;

import br.com.estacionamento.entities.Sensor;
import br.com.estacionamento.repositories.SensorRepository;

import java.io.IOException;
import java.util.List;

public class SensorApplication {
    private SensorRepository sensorRepository;

    public SensorApplication(SensorRepository sensorRepository){
        this.sensorRepository = sensorRepository;
    }

    public List<Sensor> buscarTodos() throws IOException {
        return this.sensorRepository.buscarTodos();
    }

    public Sensor buscarPorId(Sensor sensor) throws IOException{
        return this.sensorRepository.buscarPorId(sensor.getId());
    }

    public void adicionar(Sensor sensor) throws IOException{
        this.sensorRepository.adicionar(sensor);
    }

    public void remover(Sensor sensor) throws IOException{
        this.sensorRepository.remover(sensor.getId());
    }

    public void atualizar(Sensor sensor, int id) throws IOException{
        this.sensorRepository.atualizar(sensor.getId(), sensor);
    }
}
