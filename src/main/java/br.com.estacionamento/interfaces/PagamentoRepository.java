package br.com.estacionamento.interfaces;

import br.com.estacionamento.entities.Pagamento;
import br.com.estacionamento.models.MovimentacaoModels;
import br.com.estacionamento.models.PagamentoModels;

import java.util.List;

public interface PagamentoRepository {
    public List<PagamentoModels> buscarTodos();
    public PagamentoModels buscarPorId(int id);
    public void adicionar(PagamentoModels pagamentoModels);
    public void remover(int id);
    public void atualizar(int id, PagamentoModels pagamentoModels);
}
