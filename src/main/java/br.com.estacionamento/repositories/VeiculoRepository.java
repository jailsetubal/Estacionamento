package br.com.estacionamento.repositories;

import br.com.estacionamento.entities.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class VeiculoRepository {
    private List<Veiculo> veiculos = new ArrayList<>();

    public List<Veiculo> buscarTodos(){
        return veiculos;
    }

    public Veiculo buscarPorId(int id) {
        return veiculos
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .get();
    }

    public void adicionar(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }

    public void remover(int id){
        this.veiculos.removeIf(v -> v.getId() == id);
    }

    public void atualizar(int id, Veiculo veiculo){
        Veiculo veiculoInMemoiry = buscarPorId(id);

        veiculoInMemoiry.setPlaca(veiculo.getPlaca());
        veiculoInMemoiry.setTipo(veiculo.getTipo());
        veiculoInMemoiry.setModelo(veiculo.getModelo());
        veiculoInMemoiry.setCor(veiculo.getCor());
    }

}
