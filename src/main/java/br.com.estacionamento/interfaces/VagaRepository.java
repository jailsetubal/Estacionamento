package br.com.estacionamento.interfaces;

import br.com.estacionamento.models.ClienteModels;
import br.com.estacionamento.models.VagaModels;

import java.util.List;

public interface VagaRepository {
    public List<VagaModels> buscarTodos();
    public VagaModels buscarPorId(int id);
    public void adicionar(VagaModels vagaModels);
    public void remover(int id);
    public void atualizar(int id, VagaModels vagaModels);
}
