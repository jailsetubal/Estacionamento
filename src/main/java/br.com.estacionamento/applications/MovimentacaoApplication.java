package br.com.estacionamento.applications;

import br.com.estacionamento.entities.Movimentacao;
import br.com.estacionamento.interfaces.MovimentacaoRepository;
import br.com.estacionamento.models.MovimentacaoModels;
import br.com.estacionamento.repositories.movimentacao.MovimentacaoRepositoryImpl;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class MovimentacaoApplication {
    private MovimentacaoRepository movimentacaoRepository;

    public MovimentacaoApplication(MovimentacaoRepository movimentacaoRepository){
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public List<MovimentacaoModels> buscarTodos() throws IOException {
        return this.movimentacaoRepository.buscarTodos();
    }

    public MovimentacaoModels buscarPorId(int id) throws IOException{
        return this.movimentacaoRepository.buscarPorId(id);
    }

    public void adicionar(MovimentacaoModels movimentacaoModels) throws IOException{
        this.movimentacaoRepository.adicionar(movimentacaoModels);
    }

    public void remover(int id) throws IOException{
        this.movimentacaoRepository.remover(id);
    }

    public void atualizar(MovimentacaoModels movimentacaoModels, int id) throws IOException{
        this.movimentacaoRepository.atualizar(id, movimentacaoModels);
    }
}
