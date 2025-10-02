package br.com.estacionamento.repositories.formaPagamento;

import br.com.estacionamento.entities.FormaPagamento;
import br.com.estacionamento.models.FormaPagamentoModels;

import java.util.ArrayList;
import java.util.List;

public class FormaPagamentoRepositoryImpl {
    private List<FormaPagamentoModels> fPagamento = new ArrayList<>();

    public List<FormaPagamentoModels> buscarTodos(){
        return fPagamento;
    }

    public FormaPagamentoModels buscarPorId(int id) {
        return fPagamento
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .get();
    }

    public void adicionar(FormaPagamentoModels formaPagamentoModels){
        this.fPagamento.add(formaPagamentoModels);
    }

    public void remover(int id){
        this.fPagamento.removeIf(f -> f.getId() == id);
    }

    public void atualizar(int id, FormaPagamentoModels formaPagamentoModels){
        FormaPagamentoModels pagamentoInMemoiry = buscarPorId(id);

        pagamentoInMemoiry.setTipo(formaPagamentoModels.getTipo());
    }
}
