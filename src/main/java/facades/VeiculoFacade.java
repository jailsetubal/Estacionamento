package facades;

import applications.VeiculoApplication;
import entities.Veiculo;

import java.io.IOException;
import java.util.List;

public class VeiculoFacade {
    private final VeiculoApplication veiculoApplication;

    public VeiculoFacade(VeiculoApplication veiculoApplication) {
        this.veiculoApplication = veiculoApplication;
    }

    public List<Veiculo> buscarTodos() throws IOException {
        return this.veiculoApplication.buscarTodos();
    }

    public Veiculo buscarPorId(Veiculo veiculo) throws IOException{
        return this.veiculoApplication.buscarPorId(veiculo);
    }

    public void adicionar(Veiculo veiculo) throws IOException{
        this.veiculoApplication.adicionar(veiculo);
    }

    public void remover(Veiculo veiculo) throws IOException{
        this.veiculoApplication.remover(veiculo);
    }

    public void atualizar(int id, Veiculo veiculo) throws IOException{
        this.veiculoApplication.atualizar(veiculo, veiculo.getId());
    }
}
