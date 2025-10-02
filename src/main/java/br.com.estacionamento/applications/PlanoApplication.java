package br.com.estacionamento.applications;

import br.com.estacionamento.interfaces.PlanoRepository;
import br.com.estacionamento.models.PlanoModels;
import br.com.estacionamento.repositories.plano.PlanoRepositoryImpl;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service
public class PlanoApplication {
    private PlanoRepository planoRepository;

    public PlanoApplication(PlanoRepository planoRepository){
        this.planoRepository = planoRepository;
    }

    public List<PlanoModels> buscarTodos() throws IOException {
        return this.planoRepository.buscarTodos();
    }

    public PlanoModels buscarPorId(int id) throws IOException{
        return this.planoRepository.buscarPorId(id);
    }

    public void adicionar(PlanoModels planoModels) throws IOException{
        this.planoRepository.adicionar(planoModels);
    }

    public void remover(int id) throws IOException{
        this.planoRepository.remover(id);
    }

    public void atualizar(PlanoModels planoModels, int id) throws IOException{
        this.planoRepository.atualizar(id, planoModels);
    }
}
