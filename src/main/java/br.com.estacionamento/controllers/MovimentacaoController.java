package br.com.estacionamento.controllers;

import br.com.estacionamento.facades.MovimentacaoFacade;
import br.com.estacionamento.models.MovimentacaoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/Movimentacoes")
public class MovimentacaoController {
    private final MovimentacaoFacade movimentacaoFacade;

    @Autowired
    public MovimentacaoController(MovimentacaoFacade movimentacaoFacade) throws IOException {
        this.movimentacaoFacade = movimentacaoFacade;
    }

    @GetMapping("/")
    public List<MovimentacaoModels> getMovimentacao() throws IOException {
        return this.movimentacaoFacade.buscarTodos();
    }

    @GetMapping("/{id}")
    public MovimentacaoModels getMovimentacaoById(@PathVariable int id) throws IOException {
        return this.movimentacaoFacade.buscarPorId(id);
    }

    @PostMapping("/movimentacao/adicionar")
    public void adicionarMovimentacao(@RequestBody MovimentacaoModels movimentacaoModels) throws IOException {
        this.movimentacaoFacade.adicionar(movimentacaoModels);
    }

    @PutMapping("/movimentacao/atualizar/{id}")
    public void atualizarMovimentacao(@PathVariable int id, @RequestBody MovimentacaoModels movimentacaoModels) throws IOException {
        this.movimentacaoFacade.atualizar(id, movimentacaoModels);
    }

    @DeleteMapping("/movimentacao/remover/{id}")
    public void removerMovimentacao(@PathVariable int id) throws IOException {
        this.movimentacaoFacade.remover(id);
    }
}
