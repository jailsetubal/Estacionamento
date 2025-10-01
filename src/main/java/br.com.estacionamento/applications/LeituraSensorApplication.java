package br.com.estacionamento.applications;

import br.com.estacionamento.entities.LeituraSensor;
import br.com.estacionamento.repositories.LeituraSensorRepository;

import java.io.IOException;
import java.util.List;

public class LeituraSensorApplication {
    private LeituraSensorRepository leituraSensorRepository;

    public LeituraSensorApplication(LeituraSensorRepository leituraSensorRepository){
        this.leituraSensorRepository = leituraSensorRepository;
    }

    public List<LeituraSensor> buscarTodos() throws IOException {
        return this.leituraSensorRepository.buscarTodos();
    }

    public LeituraSensor buscarPorId(LeituraSensor leituraSensor) throws IOException{
        return this.leituraSensorRepository.buscarPorId(leituraSensor.getId());
    }

    public void adicionar(LeituraSensor leituraSensor) throws IOException{
        this.leituraSensorRepository.adicionar(leituraSensor);
    }

    public void remover(LeituraSensor leituraSensor) throws IOException{
        this.leituraSensorRepository.remover(leituraSensor.getId());
    }

    public void atualizar(LeituraSensor leituraSensor, int id) throws IOException{
        this.leituraSensorRepository.atualizar(leituraSensor.getId(), leituraSensor);
    }
}
