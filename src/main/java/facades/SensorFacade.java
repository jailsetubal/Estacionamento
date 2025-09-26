package facades;

import applications.SensorApplication;
import entities.Sensor;

import java.io.IOException;
import java.util.List;

public class SensorFacade {
    private final SensorApplication sensorApplication;

    public SensorFacade(SensorApplication sensorApplication) {
        this.sensorApplication = sensorApplication;
    }

    public List<Sensor> buscarTodos() throws IOException {
        return this.sensorApplication.buscarTodos();
    }

    public Sensor buscarPorId(Sensor sensor) throws IOException {
        return this.sensorApplication.buscarPorId(sensor);
    }

    public void adicionar(Sensor sensor) throws IOException {
        this.sensorApplication.adicionar(sensor);
    }

    public void remover(Sensor sensor) throws IOException {
        this.sensorApplication.remover(sensor);
    }

    public void atualizar(int id, Sensor sensor) throws IOException {
        this.sensorApplication.atualizar(sensor, sensor.getId());
    }
}
