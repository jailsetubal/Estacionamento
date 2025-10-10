package br.com.estacionamento.controllers;

import br.com.estacionamento.facades.AssinaturaFacade;
import br.com.estacionamento.models.AssinaturaModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/assinaturas")
public class AssinaturaController {

    private final AssinaturaFacade assinaturaFacade;

    @Autowired
    public AssinaturaController(AssinaturaFacade assinaturaFacade) throws IOException {
        this.assinaturaFacade = assinaturaFacade;
    }

    @GetMapping("/")
    public List<AssinaturaModels> getAssinaturas() throws IOException {
        return this.assinaturaFacade.buscarTodos();
    }

    @GetMapping("/{id}")
    public AssinaturaModels getAssinaturaById(@PathVariable int id) throws IOException {
        return this.assinaturaFacade.buscarPorId(id);
    }

    @PostMapping("/assinaturas/adicionar")
    public void adicionarAssinatura(@RequestBody AssinaturaModels assinatura) throws IOException {
        this.assinaturaFacade.adicionar(assinatura);
    }

    @PutMapping("/assinaturas/atualizar/{id}")
    public void atualizarAssinaturas(@PathVariable int id, @RequestBody AssinaturaModels assinatura) throws IOException {
        this.assinaturaFacade.atualizar(id, assinatura);
    }

    @DeleteMapping("/assinaturas/remover/{id}")
    public void removerAssinatura(@PathVariable int id) throws IOException {
        this.assinaturaFacade.remover(id);
    }
}

