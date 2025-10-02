package br.com.estacionamento.controllers;

import br.com.estacionamento.facades.FormaPagamentoFacade;
import br.com.estacionamento.models.FormaPagamentoModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/formasPagamento")
public class FormaPagamentoController {

    private final FormaPagamentoFacade formaPagamentoFacade;

    @Autowired
    public FormaPagamentoController(FormaPagamentoFacade FormaPagamentoFacade) throws IOException {
        this.formaPagamentoFacade = FormaPagamentoFacade;
    }

    @GetMapping("/")
    public List<FormaPagamentoModels> getFormaPagamento() throws IOException {
        return this.formaPagamentoFacade.buscarTodos();
    }

    @GetMapping("/{id}")
    public FormaPagamentoModels getFormaPagamentoById(@PathVariable int id) throws IOException {
        return this.formaPagamentoFacade.buscarPorId(id);
    }

    @PostMapping("/formasPagamento/adicionar")
    public void adicionarFormaPagamento(@RequestBody FormaPagamentoModels formaPagamento) throws IOException {
        this.formaPagamentoFacade.adicionar(formaPagamento);
    }

    @PutMapping("/formasPagamento/atualizar/{id}")
    public void atualizarFormaPagamento(@PathVariable int id, @RequestBody FormaPagamentoModels formaPagamento) throws IOException {
        this.formaPagamentoFacade.atualizar(id, formaPagamento);
    }

    @DeleteMapping("/formasPagamento/remover/{id}")
    public void removerFormaPagamento(@PathVariable int id) throws IOException {
        this.formaPagamentoFacade.remover(id);
    }
}