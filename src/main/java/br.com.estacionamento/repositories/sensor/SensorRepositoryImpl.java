package br.com.estacionamento.repositories.sensor;

import br.com.estacionamento.models.SensorModels;

import java.util.ArrayList;
import java.util.List;

public class SensorRepositoryImpl {
    private List<SensorModels> sensorList = new ArrayList<>();

    public List<SensorModels> buscarTodos(){
        return sensorList;
    }

    public SensorModels buscarPorId(int id){
        return sensorList
                .stream()
                .filter(sensor -> sensor.getId() == id)
                .findFirst().get();
    }

    public void adicionar(SensorModels sensor){
        this.sensorList.add(sensor);
    }

    public void remover(int id){
       this.sensorList.removeIf(s -> s.getId() == id);
    }

    public void atualizar(int id, SensorModels sensor){
        SensorModels sensorInMemory = buscarPorId(id);

        sensorInMemory.setDataInstalacao(sensor.getDataInstalacao());
    }
}
