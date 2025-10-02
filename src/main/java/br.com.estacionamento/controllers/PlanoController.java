package br.com.estacionamento.controllers;


import br.com.estacionamento.facades.ClienteFacade;
import br.com.estacionamento.facades.PlanoFacade;
import br.com.estacionamento.models.ClienteModels;
import br.com.estacionamento.models.PlanoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/Planos")
public class PlanoController {
    private final PlanoFacade planoFacade;

    @Autowired
    public PlanoController(PlanoFacade clienteFacade) throws IOException {
        this.planoFacade = clienteFacade;
    }

    @GetMapping("/")
    public List<PlanoModels> getPlano() throws IOException {
        return this.planoFacade.buscarTodos();
    }

    @GetMapping("/{id}")
    public PlanoModels getPlanoById(@PathVariable int id) throws IOException {
        return this.planoFacade.buscarPorId(id);
    }

    @PostMapping("/plano/adicionar")
    public void adicionarPlano(@RequestBody PlanoModels plano) throws IOException {
        this.planoFacade.adicionar(plano);
    }

    @PutMapping("/plano/atualizar/{id}")
    public void atualizarPlano(@PathVariable int id, @RequestBody PlanoModels plano) throws IOException {
        this.planoFacade.atualizar(id, plano);
    }

    @DeleteMapping("/plano/remover/{id}")
    public void removerPlano(@PathVariable int id) throws IOException {
        this.planoFacade.remover(id);
    }

}
