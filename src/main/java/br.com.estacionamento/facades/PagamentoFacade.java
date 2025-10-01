package br.com.estacionamento.facades;

import br.com.estacionamento.applications.PagamentoApplication;
import br.com.estacionamento.entities.Pagamento;

import java.io.IOException;
import java.util.List;

public class PagamentoFacade {
    private final PagamentoApplication pagamentoApplication;

    public PagamentoFacade(PagamentoApplication pagamentoApplication) {
        this.pagamentoApplication = pagamentoApplication;
    }

    public List<Pagamento> buscarTodos() throws IOException {
        return this.pagamentoApplication.buscarTodos();
    }

    public Pagamento buscarPorId(Pagamento pagamento) throws IOException {
        return this.pagamentoApplication.buscarPorId(pagamento);
    }

    public void adicionar(Pagamento pagamento) throws IOException {
        this.pagamentoApplication.adicionar(pagamento);
    }

    public void remover(Pagamento pagamento) throws IOException {
        this.pagamentoApplication.remover(pagamento);
    }

    public void atualizar(int id, Pagamento pagamento) throws IOException {
        this.pagamentoApplication.atualizar(pagamento, pagamento.getId());
    }
}
