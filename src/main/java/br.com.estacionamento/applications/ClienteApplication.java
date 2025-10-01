package br.com.estacionamento.applications;

import br.com.estacionamento.interfaces.ClienteRepository;
import br.com.estacionamento.models.ClienteModels;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class ClienteApplication {
    private ClienteRepository clienteRepository;

    public ClienteApplication(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteModels> buscarTodos() throws IOException{
        return this.clienteRepository.buscarTodos();
    }

    public ClienteModels buscarPorId(int id){
        return this.clienteRepository.buscarPorId(id);
    }

    public void adicionar (ClienteModels clienteModels) throws IOException{
        this.clienteRepository.adicionar(clienteModels);
    }

    public void remover (int id) throws IOException{
        this.clienteRepository.remover(id);
    }

    public void atualizar (ClienteModels clienteModels, int id) throws IOException{
        this.clienteRepository.atualizar(clienteModels.getId(), clienteModels);
    }
}

