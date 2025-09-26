package applications;

import entities.FormaPagamento;
import entities.Pagamento;
import repositories.FormaPagamentoRepository;
import repositories.PagamentoRepository;

import java.io.IOException;
import java.util.List;

public class PagamentoApplication {
    private PagamentoRepository pagamentoRepository;

    public PagamentoApplication(PagamentoRepository pagamentoRepository){
        this.pagamentoRepository = pagamentoRepository;
    }

    public List<Pagamento> buscarTodos() throws IOException {
        return this.pagamentoRepository.buscarTodos();
    }

    public Pagamento buscarPorId(Pagamento pagamento) throws IOException{
        return this.pagamentoRepository.buscarPorID(pagamento.getId());
    }

    public void adicionar(Pagamento pagamento) throws IOException{
        this.pagamentoRepository.adicionar(pagamento);
    }

    public void remover(Pagamento pagamento) throws IOException{
        this.pagamentoRepository.remover(pagamento.getId());
    }

    public void atualizar(Pagamento pagamento, int id) throws IOException{
        this.pagamentoRepository.atualizar(pagamento.getId(), pagamento);
    }
}
