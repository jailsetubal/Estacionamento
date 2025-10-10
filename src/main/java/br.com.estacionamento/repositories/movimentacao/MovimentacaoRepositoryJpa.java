package br.com.estacionamento.repositories.movimentacao;


import br.com.estacionamento.interfaces.MovimentacaoRepository;
import br.com.estacionamento.models.MovimentacaoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovimentacaoRepositoryJpa implements MovimentacaoRepository {

    private final MovimentacaoModelRepositoryJpa movimentacaoModelRepositoryJpa;

    @Autowired
    public MovimentacaoRepositoryJpa(MovimentacaoModelRepositoryJpa movimentacaoModelRepositoryJpa) {
        this.movimentacaoModelRepositoryJpa= movimentacaoModelRepositoryJpa;
    }

    @Override
    public List<MovimentacaoModels> buscarTodos() {
        return this.movimentacaoModelRepositoryJpa.findAll();
    }

    @Override
    public MovimentacaoModels buscarPorId(int id) {
        return this.movimentacaoModelRepositoryJpa.findById(id).get();
    }

    @Override
    public void adicionar(MovimentacaoModels movimentacaoModels) {
        this.movimentacaoModelRepositoryJpa.save(movimentacaoModels);
    }

    @Override
    public void remover(int id) {
        this.movimentacaoModelRepositoryJpa.deleteById(id);
    }

    @Override
    public void atualizar(int id, MovimentacaoModels movimentacaoModels) {
        MovimentacaoModels movimentacaoInDB = this.movimentacaoModelRepositoryJpa.findById(id).get();

        movimentacaoInDB.setEntrada(movimentacaoModels.getEntrada());
        movimentacaoInDB.setSaida(movimentacaoModels.getSaida());
        movimentacaoInDB.setValorCalculado(movimentacaoModels.getValorCalculado());
    }
}
