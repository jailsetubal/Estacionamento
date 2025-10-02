package br.com.estacionamento.facades;

import br.com.estacionamento.applications.PagamentoApplication;
import br.com.estacionamento.entities.Pagamento;
import br.com.estacionamento.models.PagamentoModels;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class PagamentoFacade {
    private final PagamentoApplication pagamentoApplication;

    public PagamentoFacade(PagamentoApplication pagamentoApplication) {
        this.pagamentoApplication = pagamentoApplication;
    }

    public List<PagamentoModels> buscarTodos() throws IOException {
        return this.pagamentoApplication.buscarTodos();
    }

    public PagamentoModels buscarPorId(int id) throws IOException {
        return this.pagamentoApplication.buscarPorId(id);
    }

    public void adicionar(PagamentoModels pagamentoModels) throws IOException {
        this.pagamentoApplication.adicionar(pagamentoModels);
    }

    public void remover(int id) throws IOException {
        this.pagamentoApplication.remover(id);
    }

    public void atualizar(int id, PagamentoModels pagamentoModels) throws IOException {
        this.pagamentoApplication.atualizar(pagamentoModels, id);
    }
}
