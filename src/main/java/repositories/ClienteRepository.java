package repositories;

import entities.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> buscarTodos(){
        return clientes;
    }

    public Cliente buscarPorId(int id) {
         return clientes
                 .stream()
                 .filter(c -> c.getId() == id)
                 .findFirst()
                 .get();
    }

    public void adicionar(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void remover(int id){
        this.clientes.removeIf(c -> c.getId() == id);
    }

    public void atualizar(int id, Cliente cliente){
        Cliente clienteInMemoiry = buscarPorId(id);

        clienteInMemoiry.setNome(cliente.getNome());
        clienteInMemoiry.setEmail(cliente.getEmail());
        clienteInMemoiry.setEndereco(cliente.getEndereco());
        clienteInMemoiry.setTelefone(cliente.getTelefone());
    }

}
