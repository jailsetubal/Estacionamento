package br.com.estacionamento.repositories.veiculo;

import br.com.estacionamento.entities.Veiculo;
import br.com.estacionamento.models.VeiculoModels;

import java.util.ArrayList;
import java.util.List;

public class VeiculoRepositoryImpl {
    private List<VeiculoModels> veiculos = new ArrayList<>();

    public List<VeiculoModels> buscarTodos(){
        return veiculos;
    }

    public VeiculoModels buscarPorId(int id) {
        return veiculos
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .get();
    }

    public void adicionar(VeiculoModels veiculo){
        this.veiculos.add(veiculo);
    }

    public void remover(int id){
        this.veiculos.removeIf(v -> v.getId() == id);
    }

    public void atualizar(int id, VeiculoModels veiculo){
        VeiculoModels veiculoInMemoiry = buscarPorId(id);

        veiculoInMemoiry.setPlaca(veiculo.getPlaca());
        veiculoInMemoiry.setTipo(veiculo.getTipo());
        veiculoInMemoiry.setModelo(veiculo.getModelo());
        veiculoInMemoiry.setCor(veiculo.getCor());
    }

}
