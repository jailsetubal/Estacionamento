package br.com.estacionamento.applications;

import br.com.estacionamento.interfaces.SensorRepository;
import br.com.estacionamento.models.SensorModels;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class SensorApplication {
    private SensorRepository sensorRepository;

    public SensorApplication(SensorRepository sensorRepository){
        this.sensorRepository = sensorRepository;
    }

    public List<SensorModels> buscarTodos() throws IOException {
        return this.sensorRepository.buscarTodos();
    }

    public SensorModels buscarPorId(int id) throws IOException{
        return this.sensorRepository.buscarPorId(id);
    }

    public void adicionar(SensorModels sensorModels) throws IOException{
        this.sensorRepository.adicionar(sensorModels);
    }

    public void remover(int id) throws IOException{
        this.sensorRepository.remover(id);
    }

    public void atualizar(SensorModels sensorModels, int id) throws IOException{
        this.sensorRepository.atualizar(id, sensorModels);
    }
}
