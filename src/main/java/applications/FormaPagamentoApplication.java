package applications;

import entities.Cliente;
import entities.FormaPagamento;
import repositories.ClienteRepository;
import repositories.FormaPagamentoRepository;

import java.io.IOException;
import java.util.List;

public class FormaPagamentoApplication {
    private FormaPagamentoRepository formaPagamentoRepository;

    public FormaPagamentoApplication(FormaPagamentoRepository formaPagamentoRepository){
        this.formaPagamentoRepository = formaPagamentoRepository;
    }

    public List<FormaPagamento> buscarTodos() throws IOException {
        return this.formaPagamentoRepository.buscarTodos();
    }

    public FormaPagamento buscarPorId(FormaPagamento formaPagamento) throws IOException{
        return this.formaPagamentoRepository.buscarPorId(formaPagamento.getId());
    }

    public void adicionar(FormaPagamento formaPagamento) throws IOException{
        this.formaPagamentoRepository.adicionar(formaPagamento);
    }

    public void remover(FormaPagamento formaPagamento) throws IOException{
        this.formaPagamentoRepository.remover(formaPagamento.getId());
    }

    public void atualizar(FormaPagamento formaPagamento, int id) throws IOException{
        this.formaPagamentoRepository.atualizar(formaPagamento.getId(), formaPagamento);
    }
}
