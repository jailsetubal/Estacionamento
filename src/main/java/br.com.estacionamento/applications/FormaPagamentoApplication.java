package br.com.estacionamento.applications;

import br.com.estacionamento.entities.FormaPagamento;
import br.com.estacionamento.interfaces.FormaPagamentoRepository;
import br.com.estacionamento.models.FormaPagamentoModels;
import br.com.estacionamento.repositories.formaPagamento.FormaPagamentoRepositoryImpl;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FormaPagamentoApplication {
    private FormaPagamentoRepository formaPagamentoRepository;

    public FormaPagamentoApplication(FormaPagamentoRepository formaPagamentoRepository){
        this.formaPagamentoRepository = formaPagamentoRepository;
    }

    public List<FormaPagamentoModels> buscarTodos() throws IOException {
        return this.formaPagamentoRepository.buscarTodos();
    }

    public FormaPagamentoModels buscarPorId(int id) throws IOException{
        return this.formaPagamentoRepository.buscarPorId(id);
    }

    public void adicionar(FormaPagamentoModels formaPagamentoModels) throws IOException{
        this.formaPagamentoRepository.adicionar(formaPagamentoModels);
    }

    public void remover(int id) throws IOException{
        this.formaPagamentoRepository.remover(id);
    }

    public void atualizar(FormaPagamentoModels formaPagamentoModels, int id) throws IOException{
        this.formaPagamentoRepository.atualizar(id, formaPagamentoModels);
    }
}
