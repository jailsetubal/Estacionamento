package br.com.estacionamento.repositories.cliente;

import br.com.estacionamento.interfaces.ClienteRepository;
import br.com.estacionamento.models.ClienteModels;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepository {
    private List<ClienteModels> clientes = new ArrayList<>();

    public List<ClienteModels> buscarTodos(){
        return clientes;
    }

    public ClienteModels buscarPorId(int id) {
         return clientes
                 .stream()
                 .filter(c -> c.getId() == id)
                 .findFirst()
                 .get();
    }

    public void adicionar(ClienteModels clienteModels){
        this.clientes.add(clienteModels);
    }

    public void remover(int id){
        this.clientes.removeIf(c -> c.getId() == id);
    }

    public void atualizar(int id, ClienteModels clienteModels){
        ClienteModels clienteInMemoiry = buscarPorId(id);

        clienteInMemoiry.setNome(clienteModels.getNome());
        clienteInMemoiry.setEmail(clienteModels.getEmail());
        clienteInMemoiry.setEndereco(clienteModels.getEndereco());
        clienteInMemoiry.setTelefone(clienteModels.getTelefone());
    }

}
