package br.com.estacionamento.facades;

import br.com.estacionamento.applications.VeiculoApplication;
import br.com.estacionamento.entities.Veiculo;
import br.com.estacionamento.models.VeiculoModels;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


@Component
public class VeiculoFacade {
    private final VeiculoApplication veiculoApplication;

    public VeiculoFacade(VeiculoApplication veiculoApplication) {
        this.veiculoApplication = veiculoApplication;
    }

    public List<VeiculoModels> buscarTodos() throws IOException {
        return this.veiculoApplication.buscarTodos();
    }

    public VeiculoModels buscarPorId(int id) throws IOException{
        return this.veiculoApplication.buscarPorId(id);
    }

    public void adicionar(VeiculoModels veiculoModels) throws IOException{
        this.veiculoApplication.adicionar(veiculoModels);
    }

    public void remover(int id) throws IOException{
        this.veiculoApplication.remover(id);
    }

    public void atualizar(int id, VeiculoModels veiculoModels) throws IOException{
        this.veiculoApplication.atualizar(veiculoModels, id);
    }
}
