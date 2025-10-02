package br.com.estacionamento.repositories.movimentacao;

import br.com.estacionamento.entities.Movimentacao;
import br.com.estacionamento.models.MovimentacaoModels;

import java.util.ArrayList;
import java.util.List;

public class MovimentacaoRepositoryImpl {
    private List<MovimentacaoModels> movimentacoes = new ArrayList<>();

    public List<MovimentacaoModels> buscarTodos(){
        return movimentacoes;
    }

    public MovimentacaoModels buscarPorId(int id) {
        return movimentacoes
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .get();
    }

    public void adicionar(MovimentacaoModels movimentacaoModels){
        this.movimentacoes.add(movimentacaoModels);
    }

    public void remover(int id){
        this.movimentacoes.removeIf(m -> m.getId() == id);
    }

    public void atualizar(int id, MovimentacaoModels movimentacaoModels){
        MovimentacaoModels movimentacaoInMemoiry = buscarPorId(id);

        movimentacaoInMemoiry.setEntrada(movimentacaoModels.getEntrada());
        movimentacaoInMemoiry.setSaida(movimentacaoModels.getSaida());
        movimentacaoInMemoiry.setValorCalculado(movimentacaoModels.getValorCalculado());

    }
}
