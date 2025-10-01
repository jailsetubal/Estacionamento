package br.com.estacionamento.repositories;

import br.com.estacionamento.entities.Plano;

import java.util.ArrayList;
import java.util.List;

public class PlanoRepository {
    private List<Plano> planos = new ArrayList<>();

    public List<Plano> buscarTodos(){
        return planos;
    }

    public Plano buscarPorId(int id){
        return planos
                .stream()
                .filter(plano -> plano.getId() == id)
                .findFirst().get();
    }

    public void adicionar(Plano planosEst){
        this.planos.add(planosEst);
    }

    public void remover(int id){
        this.planos.removeIf(plano -> plano.getId() == id);
    }

    public void atualizar(int id, Plano planosEst){
        Plano planoInmemory = buscarPorId(id);

        planoInmemory.setNome(planosEst.getNome());
        planoInmemory.setPeriodicidades(planosEst.getPeriodicidades());
        planoInmemory.setTipoVeiculo(planosEst.gettipoVeiculo());
        planoInmemory.setValor(planosEst.getValor());
        planoInmemory.setFranquiaHoras(planosEst.getFranquiaHoras());
    }
}
