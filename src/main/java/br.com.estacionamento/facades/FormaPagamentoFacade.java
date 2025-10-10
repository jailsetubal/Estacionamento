package br.com.estacionamento.facades;

import br.com.estacionamento.applications.FormaPagamentoApplication;
import br.com.estacionamento.entities.FormaPagamento;
import br.com.estacionamento.models.FormaPagamentoModels;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FormaPagamentoFacade {
    private final FormaPagamentoApplication formaPagamentoApplication;

    public FormaPagamentoFacade(FormaPagamentoApplication formaPagamentoApplication) {
        this.formaPagamentoApplication = formaPagamentoApplication;
    }

    public List<FormaPagamentoModels> buscarTodos() throws IOException {
        return this.formaPagamentoApplication.buscarTodos();
    }

    public FormaPagamentoModels buscarPorId(int id) throws IOException {
        return this.formaPagamentoApplication.buscarPorId(id);
    }

    public void adicionar(FormaPagamentoModels formaPagamentoModels) throws IOException {
        this.formaPagamentoApplication.adicionar(formaPagamentoModels);
    }

    public void remover(int id) throws IOException {
        this.formaPagamentoApplication.remover(id);
    }

    public void atualizar(int id, FormaPagamentoModels formaPagamentoModels) throws IOException {
        this.formaPagamentoApplication.atualizar(formaPagamentoModels, formaPagamentoModels.getId());
    }
}
