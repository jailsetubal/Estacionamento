package br.com.estacionamento.facades;

import br.com.estacionamento.applications.LeituraSensorApplication;
import br.com.estacionamento.entities.LeituraSensor;
import br.com.estacionamento.models.LeituraSensorModels;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class LeituraSensorFacade {
    private LeituraSensorApplication leituraSensorApplication;

    public LeituraSensorFacade(LeituraSensorApplication leituraSensorApplication) {
        this.leituraSensorApplication = leituraSensorApplication;
    }

    public List<LeituraSensorModels> buscarTodos() throws IOException {
        return this.leituraSensorApplication.buscarTodos();
    }

    public LeituraSensorModels buscarPorId(int id) throws IOException {
        return this.leituraSensorApplication.buscarPorId(id);
    }

    public void adicionar(LeituraSensorModels leituraSensorModels) throws IOException {
        this.leituraSensorApplication.adicionar(leituraSensorModels);
    }

    public void remover(int id) throws IOException {
        this.leituraSensorApplication.remover(id);
    }

    public void atualizar(int id, LeituraSensorModels leituraSensorModels) throws IOException {
        this.leituraSensorApplication.atualizar(leituraSensorModels, id);
    }


}

