package facades;

import applications.ClienteApplication;
import entities.Cliente;

import java.io.IOException;
import java.util.List;

public class ClienteFacade {
    private final ClienteApplication clienteApplication;

    public ClienteFacade(ClienteApplication clienteApplication) {
        this.clienteApplication = clienteApplication;
    }

    public List<Cliente> buscarTodos() throws IOException {
        return this.clienteApplication.buscarTodos();
    }

    public Cliente buscarPorId(Cliente cliente) throws IOException{
        return this.clienteApplication.buscarPorId(cliente);
    }

    public void adicionar(Cliente cliente) throws IOException{
        this.clienteApplication.adicionar(cliente);
    }

    public void remover(Cliente cliente) throws IOException{
        this.clienteApplication.remover(cliente);
    }

    public void atualizar(int id, Cliente cliente) throws IOException{
        this.clienteApplication.atualizar(cliente, cliente.getId());
    }
}
