package br.com.estacionamento.repositories;

import br.com.estacionamento.entities.Movimentacao;

import java.util.ArrayList;
import java.util.List;

public class MovimentacaoRepository {
    private List<Movimentacao> movimentacoes = new ArrayList<>();

    public List<Movimentacao> buscarTodos(){
        return movimentacoes;
    }

    public Movimentacao buscarPorId(int id) {
        return movimentacoes
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .get();
    }

    public void adicionar(Movimentacao movimentacao){
        this.movimentacoes.add(movimentacao);
    }

    public void remover(int id){
        this.movimentacoes.removeIf(m -> m.getId() == id);
    }

    public void atualizar(int id, Movimentacao movimentacao){
        Movimentacao movimentacaoInMemoiry = buscarPorId(id);

        movimentacaoInMemoiry.setEntrada(movimentacao.getEntrada());
        movimentacaoInMemoiry.setSaida(movimentacao.getSaida());
        movimentacaoInMemoiry.setValorCalculado(movimentacao.getValorCalculado());

    }
}
