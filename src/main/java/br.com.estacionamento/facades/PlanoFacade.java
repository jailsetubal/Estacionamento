package br.com.estacionamento.facades;

import br.com.estacionamento.applications.PlanoApplication;
import br.com.estacionamento.entities.Plano;
import br.com.estacionamento.models.PlanoModels;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class PlanoFacade {
    private final PlanoApplication planoApplication;

    public PlanoFacade(PlanoApplication planoApplication) {
        this.planoApplication = planoApplication;
    }

    public List<PlanoModels> buscarTodos() throws IOException {
        return this.planoApplication.buscarTodos();
    }

    public PlanoModels buscarPorId(int id) throws IOException {
        return this.planoApplication.buscarPorId(id);
    }

    public void adicionar(PlanoModels planoModels) throws IOException {
        this.planoApplication.adicionar(planoModels);
    }

    public void remover(int id) throws IOException {
        this.planoApplication.remover(id);
    }

    public void atualizar(int id, PlanoModels planoModels) throws IOException {
        this.planoApplication.atualizar(planoModels, id);
    }
}
