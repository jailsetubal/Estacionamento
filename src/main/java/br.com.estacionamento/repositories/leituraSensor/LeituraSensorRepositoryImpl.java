package br.com.estacionamento.repositories.leituraSensor;

import br.com.estacionamento.entities.LeituraSensor;
import br.com.estacionamento.models.LeituraSensorModels;

import java.util.ArrayList;
import java.util.List;

public class LeituraSensorRepositoryImpl {
    private List<LeituraSensorModels> leituras = new ArrayList<>();

    public List<LeituraSensorModels> buscarTodos(){
        return leituras;
    }

    public LeituraSensorModels buscarPorId(int id) {
        return leituras
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .get();
    }

    public void adicionar(LeituraSensorModels leituraSensorModels){
        this.leituras.add(leituraSensorModels);
    }

    public void remover(int id){
        this.leituras.removeIf(s -> s.getId() == id);
    }

    public void atualizar(int id, LeituraSensorModels leituraSensorModels){
        LeituraSensorModels leituraInMemoiry = buscarPorId(id);

        leituraInMemoiry.setMomento(leituraSensorModels.getMomento());
        leituraInMemoiry.setOcupado(leituraSensorModels.isOcupado());


    }
}
