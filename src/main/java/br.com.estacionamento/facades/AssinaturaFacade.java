package br.com.estacionamento.facades;

import br.com.estacionamento.applications.AssinaturaApplication;
import br.com.estacionamento.models.AssinaturaModels;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class AssinaturaFacade {
    private final AssinaturaApplication assinaturaApplication;

    public AssinaturaFacade(AssinaturaApplication assinaturaApplication) {
        this.assinaturaApplication = assinaturaApplication;
    }

    public List<AssinaturaModels> buscarTodos() throws IOException {
        return this.assinaturaApplication.buscarTodos();
    }

    public AssinaturaModels buscarPorId(int id) throws IOException {
        return this.assinaturaApplication.buscarPorId(id);
    }

    public void adicionar(AssinaturaModels assinaturaModels) throws IOException {
        this.assinaturaApplication.adicionar(assinaturaModels);
    }

    public void remover(int id) throws IOException {
        this.assinaturaApplication.remover(id);
    }

    public void atualizar(int id, AssinaturaModels assinaturaModels) throws IOException {
        this.assinaturaApplication.atualizar(assinaturaModels, id);
    }
}
