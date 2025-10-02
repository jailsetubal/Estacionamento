package br.com.estacionamento.applications;

import br.com.estacionamento.models.LeituraSensorModels;
import br.com.estacionamento.interfaces.LeituraSensorRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class LeituraSensorApplication {
    private LeituraSensorRepository leituraSensorRepository;

    public LeituraSensorApplication(LeituraSensorRepository leituraSensorRepository){
        this.leituraSensorRepository = leituraSensorRepository;
    }

    public List<LeituraSensorModels> buscarTodos() throws IOException {
        return this.leituraSensorRepository.buscarTodos();
    }

    public LeituraSensorModels buscarPorId(int id) throws IOException{
        return this.leituraSensorRepository.buscarPorId(id);
    }

    public void adicionar(LeituraSensorModels leituraSensorModels) throws IOException{
        this.leituraSensorRepository.adicionar(leituraSensorModels);
    }

    public void remover(int id) throws IOException{
        this.leituraSensorRepository.remover(id);
    }

    public void atualizar(LeituraSensorModels leituraSensorModels, int id) throws IOException{
        this.leituraSensorRepository.atualizar(id, leituraSensorModels);
    }
}
