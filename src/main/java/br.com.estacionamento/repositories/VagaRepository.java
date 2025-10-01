package br.com.estacionamento.repositories;

import br.com.estacionamento.entities.Vaga;

import java.util.ArrayList;
import java.util.List;

public class VagaRepository {
    private List<Vaga> vagas = new ArrayList<>();

    public List<Vaga> buscarTodos(){
        return vagas;
    }

    public Vaga buscarPorId(int id){
        return vagas
                .stream()
                .filter(vaga -> vaga.getId() == id)
                .findFirst().get();
    }

    public void adicionar(Vaga newVaga){
        this.vagas.add(newVaga);
    }

    public void remover(int id){
        this.vagas.removeIf(vaga -> vaga.getId() == id);
    }

    public void atualizar(int id, Vaga vaga){
        Vaga vagaInMemory = buscarPorId(id);

        vagaInMemory.setNumeroVaga(vaga.getNumeroVaga());
        vagaInMemory.setTipoVaga(vaga.getTipoVaga());
        vagaInMemory.setAndar(vaga.getAndar());
        vagaInMemory.setSetor(vaga.getSetor());
        vagaInMemory.setTemSensor(vagaInMemory.isOcupado());
    }

}
