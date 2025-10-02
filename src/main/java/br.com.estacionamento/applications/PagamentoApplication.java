package br.com.estacionamento.applications;

import br.com.estacionamento.interfaces.PagamentoRepository;
import br.com.estacionamento.models.PagamentoModels;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service
public class PagamentoApplication {
    private PagamentoRepository pagamentoRepository;

    public PagamentoApplication(PagamentoRepository pagamentoRepository){
        this.pagamentoRepository = pagamentoRepository;
    }

    public List<PagamentoModels> buscarTodos() throws IOException {
        return this.pagamentoRepository.buscarTodos();
    }

    public PagamentoModels buscarPorId(int id) throws IOException{
        return this.pagamentoRepository.buscarPorId(id);
    }

    public void adicionar(PagamentoModels pagamento) throws IOException{
        this.pagamentoRepository.adicionar(pagamento);
    }

    public void remover(int id) throws IOException{
        this.pagamentoRepository.remover(id);
    }

    public void atualizar(PagamentoModels pagamento, int id) throws IOException{
        this.pagamentoRepository.atualizar(pagamento.getId(), pagamento);
    }
}
