package applications;

import entities.Cliente;
import repositories.ClienteRepository;

import java.io.IOException;
import java.util.List;

public class ClienteApplication {
    private ClienteRepository clienteRepository;

    public ClienteApplication(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> buscarTodos() throws IOException {
        return this.clienteRepository.buscarTodos();
    }

    public Cliente buscarPorId(Cliente cliente) throws IOException{
        return this.clienteRepository.buscarPorId(cliente.getId());
    }

    public void adicionar(Cliente cliente) throws IOException{
        this.clienteRepository.adicionar(cliente);
    }

    public void remover(Cliente cliente) throws IOException{
        this.clienteRepository.remover(cliente.getId());
    }

    public void atualizar(Cliente cliente, int id) throws IOException{
        this.clienteRepository.atualizar(cliente.getId(), cliente);
    }
}
