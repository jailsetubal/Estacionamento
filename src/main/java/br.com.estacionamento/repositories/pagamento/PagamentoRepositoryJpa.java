package br.com.estacionamento.repositories.pagamento;


import br.com.estacionamento.entities.Pagamento;
import br.com.estacionamento.interfaces.PagamentoRepository;
import br.com.estacionamento.models.PagamentoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PagamentoRepositoryJpa implements PagamentoRepository {
    private final PagamentoModelRepositoryJpa pagamentoModelRepositoryJpa;

    @Autowired
    public PagamentoRepositoryJpa (PagamentoModelRepositoryJpa pagamentoModelRepositoryJpa) {
        this.pagamentoModelRepositoryJpa = pagamentoModelRepositoryJpa;
    }

    @Override
    public List <PagamentoModels> buscarTodos() {
        return this.pagamentoModelRepositoryJpa.findAll();
    }

    @Override
    public PagamentoModels buscarPorId(int id) {
        return this.pagamentoModelRepositoryJpa.findById(id).get();
    }

    @Override
    public void adicionar (PagamentoModels pagamentoModels) {
        this.pagamentoModelRepositoryJpa.save(pagamentoModels);
    }

    @Override
    public void remover(int id) {
        this.pagamentoModelRepositoryJpa.deleteById(id);
    }

    @Override
    public void atualizar(int id, PagamentoModels pagamento) {
        PagamentoModels pagamentoInDB = this.pagamentoModelRepositoryJpa.findById(id).get();

        pagamentoInDB.setDataPagamento(pagamento.getDataPagamento());
        pagamentoInDB.setValor(pagamento.getValor());
        pagamentoInDB.setDataPagamento(pagamento.getDataPagamento());
    }

}
