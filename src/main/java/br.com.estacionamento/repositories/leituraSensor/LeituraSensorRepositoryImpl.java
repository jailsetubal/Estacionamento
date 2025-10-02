package br.com.estacionamento.repositories.leituraSensor;

import br.com.estacionamento.entities.LeituraSensor;

import java.util.ArrayList;
import java.util.List;

public class LeituraSensorRepositoryImpl {
    private List<LeituraSensor> leituras = new ArrayList<>();

    public List<LeituraSensor> buscarTodos(){
        return leituras;
    }

    public LeituraSensor buscarPorId(int id) {
        return leituras
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .get();
    }

    public void adicionar(LeituraSensor leituraSensor){
        this.leituras.add(leituraSensor);
    }

    public void remover(int id){
        this.leituras.removeIf(s -> s.getId() == id);
    }

    public void atualizar(int id, LeituraSensor leituraSensor){
        LeituraSensor leituraInMemoiry = buscarPorId(id);

        leituraInMemoiry.setMomento(leituraSensor.getMomento());
        leituraInMemoiry.setOcupado(leituraSensor.isOcupado());


    }
}
