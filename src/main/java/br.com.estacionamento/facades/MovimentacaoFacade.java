package br.com.estacionamento.facades;

import br.com.estacionamento.applications.MovimentacaoApplication;
import br.com.estacionamento.entities.Movimentacao;

import java.io.IOException;
import java.util.List;

public class MovimentacaoFacade {
    private final MovimentacaoApplication movimentacaoApplication;

    public MovimentacaoFacade(MovimentacaoApplication movimentacaoApplication) {
        this.movimentacaoApplication = movimentacaoApplication;
    }

    public List<Movimentacao> buscarTodos() throws IOException {
        return this.movimentacaoApplication.buscarTodos();
    }

    public Movimentacao buscarPorId(Movimentacao movimentacao) throws IOException{
        return this.movimentacaoApplication.buscarPorId(movimentacao);
    }

    public void adicionar(Movimentacao movimentacao) throws IOException{
        this.movimentacaoApplication.adicionar(movimentacao);
    }

    public void remover(Movimentacao movimentacao) throws IOException{
        this.movimentacaoApplication.remover(movimentacao);
    }

    public void atualizar(int id, Movimentacao movimentacao) throws IOException{
        this.movimentacaoApplication.atualizar(movimentacao, movimentacao.getId());
    }
}
