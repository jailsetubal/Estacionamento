package br.com.estacionamento.controllers;

import br.com.estacionamento.facades.LeituraSensorFacade;

import br.com.estacionamento.models.LeituraSensorModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/leituraSensor")
public class LeituraSensorController {

    private final LeituraSensorFacade leituraSensorFacade;

    @Autowired
    public LeituraSensorController(LeituraSensorFacade leituraSensorFacade) throws IOException {
        this.leituraSensorFacade = leituraSensorFacade;
    }

    @GetMapping("/")
    public List<LeituraSensorModels> getCLeituraSensor() throws IOException {
        return this.leituraSensorFacade.buscarTodos();
    }

    @GetMapping("/{id}")
    public LeituraSensorModels getLeituraSensorById(@PathVariable int id) throws IOException {
        return this.leituraSensorFacade.buscarPorId(id);
    }

    @PostMapping("/leituraSensor/adicionar")
    public void adicionarLeituraSensor(@RequestBody LeituraSensorModels leituraSensor) throws IOException {
        this.leituraSensorFacade.adicionar(leituraSensor);
    }

    @PutMapping("/leituraSensor/atualizar/{id}")
    public void atualizarLeituraSensor(@PathVariable int id, @RequestBody LeituraSensorModels leituraSensor) throws IOException {
        this.leituraSensorFacade.atualizar(id, leituraSensor);
    }

    @DeleteMapping("/leituraSensor/remover/{id}")
    public void removerLeituraSensor(@PathVariable int id) throws IOException {
        this.leituraSensorFacade.remover(id);
    }
}