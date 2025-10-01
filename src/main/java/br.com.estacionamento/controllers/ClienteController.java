package br.com.estacionamento.controllers;

import br.com.estacionamento.facades.ClienteFacade;
import br.com.estacionamento.models.ClienteModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteFacade clienteFacade;

    @Autowired
    public ClienteController(ClienteFacade clienteFacade) throws IOException {
        this.clienteFacade = clienteFacade;
    }

    @GetMapping("/")
    public List<ClienteModels> getClientes() throws IOException {
        return this.clienteFacade.buscarTodos();
    }

    @GetMapping("/{id}")
    public ClienteModels getClienteById(@PathVariable int id) throws IOException {
        return this.clienteFacade.buscarPorId(id);
    }

    @PostMapping("/clientes/adicionar")
    public void adicionarCliente(@RequestBody ClienteModels cliente) throws IOException {
        this.clienteFacade.adicionar(cliente);
    }

    @PutMapping("/clientes/atualizar/{id}")
    public void atualizarCliente(@PathVariable int id, @RequestBody ClienteModels cliente) throws IOException {
        this.clienteFacade.atualizar(id, cliente);
    }

    @DeleteMapping("/clientes/remover/{id}")
    public void removerCliente(@PathVariable int id) throws IOException {
        this.clienteFacade.remover(id);
    }
}
