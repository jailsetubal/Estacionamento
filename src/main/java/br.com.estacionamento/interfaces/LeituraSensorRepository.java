package br.com.estacionamento.interfaces;

import br.com.estacionamento.models.LeituraSensorModels;

import java.util.List;

public interface LeituraSensorRepository {
    public List<LeituraSensorModels> buscarTodos();
    public LeituraSensorModels buscarPorId(int id);
    public void adicionar(LeituraSensorModels leituraSensorModels);
    public void remover(int id);
    public void atualizar(int id, LeituraSensorModels leituraSensorModels);
}
