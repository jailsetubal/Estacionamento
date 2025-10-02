package br.com.estacionamento.interfaces;

import br.com.estacionamento.models.FormaPagamentoModels;

import java.util.List;

public interface FormaPagamentoRepository {
    public List<FormaPagamentoModels> buscarTodos();
    public FormaPagamentoModels buscarPorId(int id);
    public void adicionar(FormaPagamentoModels formaPagamentoModels);
    public void remover(int id);
    public void atualizar(int id, FormaPagamentoModels formaPagamentoModels);
}
