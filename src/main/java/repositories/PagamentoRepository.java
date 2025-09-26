package repositories;

import entities.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class PagamentoRepository {
    private List<Pagamento> pagamentos = new ArrayList<>();

    public List<Pagamento> buscarTodos(){
        return pagamentos;
    }

    public Pagamento buscarPorID(int id){
        return pagamentos
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst().get();
    }

    public void adicionar(Pagamento pagamento){
        this.pagamentos.add(pagamento);
    }

    public void remover(int id){
        this.pagamentos.removeIf(p -> p.getId() == id);
    }

    public void atualizar(int id, Pagamento pagamento){
        Pagamento pagamentoInMemory = buscarPorID(id);

        pagamentoInMemory.setDataPagamento(pagamento.getDataPagamento());
        pagamentoInMemory.setValor(pagamento.getValor());
        pagamentoInMemory.setDataPagamento(pagamento.getDataPagamento());
    }


}
