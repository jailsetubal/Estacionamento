package br.com.estacionamento.repositories.vaga;

import br.com.estacionamento.entities.Vaga;
import br.com.estacionamento.models.VagaModels;

import java.util.ArrayList;
import java.util.List;

public class VagaRepositoryImpl {
    private List<VagaModels> vagas = new ArrayList<>();

    public List<VagaModels> buscarTodos(){
        return vagas;
    }

    public VagaModels buscarPorId(int id){
        return vagas
                .stream()
                .filter(vaga -> vaga.getId() == id)
                .findFirst().get();
    }

    public void adicionar(VagaModels newVaga){
        this.vagas.add(newVaga);
    }

    public void remover(int id){
        this.vagas.removeIf(vaga -> vaga.getId() == id);
    }

    public void atualizar(int id, VagaModels vaga){
        VagaModels vagaInMemory = buscarPorId(id);

        vagaInMemory.setNumeroVaga(vaga.getNumeroVaga());
        vagaInMemory.setTipoVaga(vaga.getTipoVaga());
        vagaInMemory.setAndar(vaga.getAndar());
        vagaInMemory.setSetor(vaga.getSetor());
        vagaInMemory.setTemSensor(vagaInMemory.isOcupado());
    }

}
