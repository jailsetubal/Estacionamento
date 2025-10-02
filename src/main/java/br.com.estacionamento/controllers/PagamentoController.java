package br.com.estacionamento.controllers;


import br.com.estacionamento.entities.Pagamento;
import br.com.estacionamento.facades.ClienteFacade;
import br.com.estacionamento.facades.PagamentoFacade;
import br.com.estacionamento.models.ClienteModels;
import br.com.estacionamento.models.PagamentoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/Pagamentos")
public class PagamentoController {

    private final PagamentoFacade pagamentoFacade;

    @Autowired
    public PagamentoController(PagamentoFacade pagamentoFacade) throws IOException {
        this.pagamentoFacade = pagamentoFacade;
    }

    @GetMapping("/")
    public List<PagamentoModels> getPagamento() throws IOException {
        return this.pagamentoFacade.buscarTodos();
    }

    @GetMapping("/{id}")
    public PagamentoModels getPagamentoById(@PathVariable int id) throws IOException {
        return this.pagamentoFacade.buscarPorId(id);
    }

    @PostMapping("/pagamentos/adicionar")
    public void adicionarPagamento(@RequestBody PagamentoModels pagamentoModels) throws IOException {
        this.pagamentoFacade.adicionar(pagamentoModels);
    }

    @PutMapping("/pagamentos/atualizar/{id}")
    public void atualizarPagamento(@PathVariable int id, @RequestBody PagamentoModels pagamentoModels) throws IOException {
        this.pagamentoFacade.atualizar(id, pagamentoModels);
    }

    @DeleteMapping("/pagamentos/remover/{id}")
    public void removerPagamento(@PathVariable int id) throws IOException {
        this.pagamentoFacade.remover(id);
    }
}
