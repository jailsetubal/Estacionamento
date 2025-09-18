package applications;

import entities.Veiculo;
import repositories.VeiculoRepository;

import java.io.IOException;
import java.util.List;

public class VeiculoApplication {
    private VeiculoRepository veiculoRepository;

    public VeiculoApplication(VeiculoRepository veiculoRepository){
        this.veiculoRepository = veiculoRepository;
    }

    public List<Veiculo> buscarTodos() throws IOException {
        return this.veiculoRepository.buscarTodos();
    }

    public Veiculo buscarPorId(Veiculo veiculo) throws IOException{
        return this.veiculoRepository.buscarPorId(veiculo.getId());
    }

    public void adicionar(Veiculo veiculo) throws IOException{
        this.veiculoRepository.adicionar(veiculo);
    }

    public void remover(Veiculo veiculo) throws IOException{
        this.veiculoRepository.remover(veiculo.getId());
    }

    public void atualizar(Veiculo veiculo, int id) throws IOException{
        this.veiculoRepository.atualizar(veiculo.getId(), veiculo);
    }
}

