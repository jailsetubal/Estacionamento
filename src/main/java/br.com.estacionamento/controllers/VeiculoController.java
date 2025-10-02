package br.com.estacionamento.controllers;


import br.com.estacionamento.facades.ClienteFacade;
import br.com.estacionamento.facades.VeiculoFacade;
import br.com.estacionamento.models.ClienteModels;
import br.com.estacionamento.models.VeiculoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/Veiculos")
public class VeiculoController {
    private final VeiculoFacade veiculoFacade;

    @Autowired
    public VeiculoController(VeiculoFacade veiculoFacade) throws IOException {
        this.veiculoFacade = veiculoFacade;
    }

    @GetMapping("/")
    public List<VeiculoModels> getVeiculo() throws IOException {
        return this.veiculoFacade.buscarTodos();
    }

    @GetMapping("/{id}")
    public VeiculoModels getVeiculoById(@PathVariable int id) throws IOException {
        return this.veiculoFacade.buscarPorId(id);
    }

    @PostMapping("/veiculo/adicionar")
    public void adicionarVeiculo(@RequestBody VeiculoModels veiculo) throws IOException {
        this.veiculoFacade.adicionar(veiculo);
    }

    @PutMapping("/veiculo/atualizar/{id}")
    public void atualizarVeiculo(@PathVariable int id, @RequestBody VeiculoModels veiculo) throws IOException {
        this.veiculoFacade.atualizar(id, veiculo);
    }

    @DeleteMapping("/veiculo/remover/{id}")
    public void removerVeiculo(@PathVariable int id) throws IOException {
        this.veiculoFacade.remover(id);
    }
}
