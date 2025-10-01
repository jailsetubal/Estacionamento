package br.com.estacionamento.interfaces;

import br.com.estacionamento.models.AssinaturaModels;

import java.util.List;

public interface AssinaturaRepository {
    public List<AssinaturaModels> buscarTodos();
    public AssinaturaModels buscarPorId(int id);
    public void adicionar(AssinaturaModels assinaturaModels);
    public void remover(int id);
    public void atualizar(int id, AssinaturaModels assinaturaModels);
}