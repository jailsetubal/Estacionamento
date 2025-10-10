package br.com.estacionamento.interfaces;

import br.com.estacionamento.models.MovimentacaoModels;

import java.util.List;

public interface MovimentacaoRepository {
    public List<MovimentacaoModels> buscarTodos();
    public MovimentacaoModels buscarPorId(int id);
    public void adicionar(MovimentacaoModels movimentacaoModels);
    public void remover(int id);
    public void atualizar(int id, MovimentacaoModels movimentacaoModels);
}
