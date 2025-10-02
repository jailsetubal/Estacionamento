package br.com.estacionamento.interfaces;

import br.com.estacionamento.models.SensorModels;

import java.util.List;

public interface SensorRepository {
    public List<SensorModels> buscarTodos();
    public SensorModels buscarPorId(int id);
    public void adicionar(SensorModels sensorModels);
    public void remover(int id);
    public void atualizar(int id, SensorModels sensorModels);
}
