package br.com.estacionamento.repositories.plano;

import br.com.estacionamento.models.PlanoModels;

import java.util.ArrayList;
import java.util.List;

public class PlanoRepositoryImpl {
    private List<PlanoModels> planos = new ArrayList<>();

    public List<PlanoModels> buscarTodos(){
        return planos;
    }

    public PlanoModels buscarPorId(int id){
        return planos
                .stream()
                .filter(plano -> plano.getId() == id)
                .findFirst().get();
    }

    public void adicionar(PlanoModels planosEst){
        this.planos.add(planosEst);
    }

    public void remover(int id){
        this.planos.removeIf(plano -> plano.getId() == id);
    }

    public void atualizar(int id, PlanoModels planosEst){
        PlanoModels planoInmemory = buscarPorId(id);

        planoInmemory.setNome(planosEst.getNome());
        planoInmemory.setPeriodicidades(planosEst.getPeriodicidades());
        planoInmemory.setTipoVeiculo(planosEst.gettipoVeiculo());
        planoInmemory.setValor(planosEst.getValor());
        planoInmemory.setFranquiaHoras(planosEst.getFranquiaHoras());
    }
}
