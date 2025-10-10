package br.com.estacionamento.interfaces;

import br.com.estacionamento.models.VagaModels;
import br.com.estacionamento.models.VeiculoModels;

import java.util.List;

public interface VeiculoRepository {
    public List<VeiculoModels> buscarTodos();
    public VeiculoModels buscarPorId(int id);
    public void adicionar(VeiculoModels veiculoModels);
    public void remover(int id);
    public void atualizar(int id, VeiculoModels veiculoModels);
}
