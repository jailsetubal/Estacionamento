package br.com.estacionamento.repositories.pagamento;

import br.com.estacionamento.entities.Pagamento;
import br.com.estacionamento.models.PagamentoModels;

import java.util.ArrayList;
import java.util.List;

public class PagamentoRepositoryImpl {
    private List<PagamentoModels> pagamentos = new ArrayList<>();

    public List<PagamentoModels> buscarTodos(){
        return pagamentos;
    }

    public PagamentoModels buscarPorID(int id){
        return pagamentos
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst().get();
    }

    public void adicionar(PagamentoModels pagamentoModels){
        this.pagamentos.add(pagamentoModels);
    }

    public void remover(int id){
        this.pagamentos.removeIf(p -> p.getId() == id);
    }

    public void atualizar(int id, PagamentoModels pagamento){
        PagamentoModels pagamentoInMemory = buscarPorID(id);

        pagamentoInMemory.setDataPagamento(pagamento.getDataPagamento());
        pagamentoInMemory.setValor(pagamento.getValor());
        pagamentoInMemory.setDataPagamento(pagamento.getDataPagamento());
    }


}
