package interfaces;

import models.ClienteModels;

import java.util.List;

public interface ClienteRepository {
    public List<ClienteModels> buscarTodos();
    public ClienteModels buscarPorId(int id);
    public void adicionar(ClienteModels clienteModels);
    public void remover(int id);
    public void atualizar(int id, ClienteModels clienteModels);
}
