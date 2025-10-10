package br.com.estacionamento.facades;

import br.com.estacionamento.applications.VagaApplication;
import br.com.estacionamento.entities.Vaga;
import br.com.estacionamento.models.VagaModels;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class VagaFacade {
    private final VagaApplication vagaApplication;

    public VagaFacade(VagaApplication vagaApplication) {
        this.vagaApplication = vagaApplication;
    }

    public List<VagaModels> buscarTodos() throws IOException {
        return this.vagaApplication.buscarTodos();
    }

    public VagaModels buscarPorId(int id) throws IOException {
        return this.vagaApplication.buscarPorId(id);
    }

    public void adicionar(VagaModels vagaModels) throws IOException {
        this.vagaApplication.adicionar(vagaModels);
    }

    public void remover(int id) throws IOException {
        this.vagaApplication.remover(id);
    }

    public void atualizar(int id, VagaModels vagaModels) throws IOException {
        this.vagaApplication.atualizar(vagaModels, id);
    }
}
