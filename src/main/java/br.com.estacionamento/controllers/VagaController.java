package br.com.estacionamento.controllers;

import br.com.estacionamento.facades.VagaFacade;
import br.com.estacionamento.models.VagaModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/Vagas")
public class VagaController {
    private final VagaFacade vagaFacade;

    @Autowired
    public VagaController(VagaFacade vagaFacade) throws IOException {
        this.vagaFacade = vagaFacade;
    }

    @GetMapping("/")
    public List<VagaModels> getVaga() throws IOException {
        return this.vagaFacade.buscarTodos();
    }

    @GetMapping("/{id}")
    public VagaModels getVagaById(@PathVariable int id) throws IOException {
        return this.vagaFacade.buscarPorId(id);
    }

    @PostMapping("/vaga/adicionar")
    public void adicionarVaga(@RequestBody VagaModels vaga) throws IOException {
        this.vagaFacade.adicionar(vaga);
    }

    @PutMapping("/vaga/atualizar/{id}")
    public void atualizarVaga(@PathVariable int id, @RequestBody VagaModels vaga) throws IOException {
        this.vagaFacade.atualizar(id, vaga);
    }

    @DeleteMapping("/vaga/remover/{id}")
    public void removerVaga(@PathVariable int id) throws IOException {
        this.vagaFacade.remover(id);
    }
}
