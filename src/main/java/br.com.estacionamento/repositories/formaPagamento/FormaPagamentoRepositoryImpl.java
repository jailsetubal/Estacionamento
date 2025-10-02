package br.com.estacionamento.repositories.formaPagamento;

import br.com.estacionamento.entities.FormaPagamento;

import java.util.ArrayList;
import java.util.List;

public class FormaPagamentoRepositoryImpl {
    private List<FormaPagamento> fPagamento = new ArrayList<>();

    public List<FormaPagamento> buscarTodos(){
        return fPagamento;
    }

    public FormaPagamento buscarPorId(int id) {
        return fPagamento
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .get();
    }

    public void adicionar(FormaPagamento formaPagamento){
        this.fPagamento.add(formaPagamento);
    }

    public void remover(int id){
        this.fPagamento.removeIf(f -> f.getId() == id);
    }

    public void atualizar(int id, FormaPagamento formaPagamento){
        FormaPagamento pagamentoInMemoiry = buscarPorId(id);

        pagamentoInMemoiry.setTipo(formaPagamento.getTipo());
    }
}
