package br.com.estacionamento.applications;

import br.com.estacionamento.entities.Vaga;
import br.com.estacionamento.repositories.VagaRepository;

import java.io.IOException;
import java.util.List;

public class VagaApplication {
    private VagaRepository vagaRepository;

    public VagaApplication(VagaRepository vagaRepository){
        this.vagaRepository = vagaRepository;
    }

    public List<Vaga> buscarTodos() throws IOException {
        return this.vagaRepository.buscarTodos();
    }

    public Vaga buscarPorId(Vaga vaga) throws IOException{
        return this.vagaRepository.buscarPorId(vaga.getId());
    }

    public void adicionar(Vaga vaga) throws IOException{
        this.vagaRepository.adicionar(vaga);
    }

    public void remover(Vaga vaga) throws IOException{
        this.vagaRepository.remover(vaga.getId());
    }

    public void atualizar(Vaga vaga, int id) throws IOException{
        this.vagaRepository.atualizar(vaga.getId(), vaga);
    }
}
