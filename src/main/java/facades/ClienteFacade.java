package facades;

import applications.ClienteApplication;
import models.ClienteModels;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class ClienteFacade {
    private final ClienteApplication clienteApplication;

    public ClienteFacade(ClienteApplication clienteApplication) {
        this.clienteApplication = clienteApplication;
    }

    public List<ClienteModels> buscarTodos() throws IOException {
        return this.clienteApplication.buscarTodos();
    }

    public ClienteModels buscarPorId(int id) throws IOException{
        return this.clienteApplication.buscarPorId(id);
    }

    public void adicionar(ClienteModels clienteModels) throws IOException{
        this.clienteApplication.adicionar(clienteModels);
    }

    public void remover(int id) throws IOException{
        this.clienteApplication.remover(id);
    }

    public void atualizar(int id, ClienteModels clienteModels) throws IOException{
        this.clienteApplication.atualizar(clienteModels, clienteModels.getId());
    }
}
