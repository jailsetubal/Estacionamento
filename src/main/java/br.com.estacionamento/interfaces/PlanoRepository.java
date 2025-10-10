package br.com.estacionamento.interfaces;

import br.com.estacionamento.models.PlanoModels;

import java.util.List;

public interface PlanoRepository {
    public List<PlanoModels> buscarTodos();
    public PlanoModels buscarPorId(int id);
    public void adicionar(PlanoModels planoModels);
    public void remover(int id);
    public void atualizar(int id, PlanoModels planoModels);
}
