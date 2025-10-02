package br.com.estacionamento.repositories.formaPagamento;


import br.com.estacionamento.interfaces.FormaPagamentoRepository;
import br.com.estacionamento.models.FormaPagamentoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FormaPagamentoRepositoryJpa implements FormaPagamentoRepository {

    private final FormaPagamentoModelRepositoryJpa formaPagamentoModelRepositoryJpa;

    @Autowired
    public FormaPagamentoRepositoryJpa(FormaPagamentoModelRepositoryJpa formaPagamentoModelRepositoryJpa) {
        this.formaPagamentoModelRepositoryJpa = formaPagamentoModelRepositoryJpa;
    }

    @Override
    public List<FormaPagamentoModels> buscarTodos() {
        return this.formaPagamentoModelRepositoryJpa.findAll();
    }

    @Override
    public FormaPagamentoModels buscarPorId(int id) {
        return this.formaPagamentoModelRepositoryJpa.findById(id).get();
    }

    @Override
    public void adicionar(FormaPagamentoModels formaPagamentoModels) {
        this.formaPagamentoModelRepositoryJpa.save(formaPagamentoModels);
    }

    @Override
    public void remover(int id) {
        this.formaPagamentoModelRepositoryJpa.deleteById(id);
    }

    @Override
    public void atualizar(int id, FormaPagamentoModels formaPagamentoModels) {
        //
    }
}
