package br.com.estacionamento.facades;

import br.com.estacionamento.applications.MovimentacaoApplication;
import br.com.estacionamento.entities.Movimentacao;
import br.com.estacionamento.models.MovimentacaoModels;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class MovimentacaoFacade {
    private final MovimentacaoApplication movimentacaoApplication;

    public MovimentacaoFacade(MovimentacaoApplication movimentacaoApplication) {
        this.movimentacaoApplication = movimentacaoApplication;
    }

    public List<MovimentacaoModels> buscarTodos() throws IOException {
        return this.movimentacaoApplication.buscarTodos();
    }

    public MovimentacaoModels buscarPorId(int id) throws IOException{
        return this.movimentacaoApplication.buscarPorId(id);
    }

    public void adicionar(MovimentacaoModels movimentacaoModels) throws IOException{
        this.movimentacaoApplication.adicionar(movimentacaoModels);
    }

    public void remover(int id) throws IOException{
        this.movimentacaoApplication.remover(id);
    }

    public void atualizar(int id, MovimentacaoModels movimentacaoModels) throws IOException{
        this.movimentacaoApplication.atualizar(movimentacaoModels, id);
    }
}
