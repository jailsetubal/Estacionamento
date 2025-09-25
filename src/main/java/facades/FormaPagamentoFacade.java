package facades;

import applications.FormaPagamentoApplication;
import entities.FormaPagamento;

import java.io.IOException;
import java.util.List;

public class FormaPagamentoFacade {
    private final FormaPagamentoApplication formaPagamentoApplication;

    public FormaPagamentoFacade(FormaPagamentoApplication formaPagamentoApplication) {
        this.formaPagamentoApplication = formaPagamentoApplication;
    }

    public List<FormaPagamento> buscarTodos() throws IOException {
        return this.formaPagamentoApplication.buscarTodos();
    }

    public FormaPagamento buscarPorId(FormaPagamento formaPagamento) throws IOException {
        return this.formaPagamentoApplication.buscarPorId(formaPagamento);
    }

    public void adicionar(FormaPagamento formaPagamento) throws IOException {
        this.formaPagamentoApplication.adicionar(formaPagamento);
    }

    public void remover(FormaPagamento formaPagamento) throws IOException {
        this.formaPagamentoApplication.remover(formaPagamento);
    }

    public void atualizar(int id, FormaPagamento formaPagamento) throws IOException {
        this.formaPagamentoApplication.atualizar(formaPagamento, formaPagamento.getId());
    }
}
