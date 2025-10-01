package br.com.estacionamento.facades;

import br.com.estacionamento.applications.VagaApplication;
import br.com.estacionamento.entities.Vaga;

import java.io.IOException;
import java.util.List;

public class VagaFacade {
    private final VagaApplication vagaApplication;

    public VagaFacade(VagaApplication vagaApplication) {
        this.vagaApplication = vagaApplication;
    }

    public List<Vaga> buscarTodos() throws IOException {
        return this.vagaApplication.buscarTodos();
    }

    public Vaga buscarPorId(Vaga vaga) throws IOException {
        return this.vagaApplication.buscarPorId(vaga);
    }

    public void adicionar(Vaga vaga) throws IOException {
        this.vagaApplication.adicionar(vaga);
    }

    public void remover(Vaga vaga) throws IOException {
        this.vagaApplication.remover(vaga);
    }

    public void atualizar(int id, Vaga vaga) throws IOException {
        this.vagaApplication.atualizar(vaga, vaga.getId());
    }
}
