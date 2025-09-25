package repositories;

import entities.Sensor;

import java.util.ArrayList;
import java.util.List;

public class SensorRepository {
    private List<Sensor> sensorList = new ArrayList<>();

    public List<Sensor> buscarTodos(){
        return sensorList;
    }

    public Sensor buscarPorId(int id){
        return sensorList
                .stream()
                .filter(sensor -> sensor.getId() == id)
                .findFirst().get();
    }

    public void adicionar(Sensor sensor){
        this.sensorList.add(sensor);
    }

    public void remover(int id){
       this.sensorList.removeIf(s -> s.getId() == id);
    }

    public void atualizar(int id, Sensor sensor){
        Sensor sensorInMemory = buscarPorId(id);

        sensorInMemory.setDataInstalacao(sensor.getDataInstalacao());
    }
}
