package br.com.estacionamento.applications;

import br.com.estacionamento.entities.Vaga;
import br.com.estacionamento.interfaces.VagaRepository;
import br.com.estacionamento.models.VagaModels;
import br.com.estacionamento.repositories.vaga.VagaRepositoryImpl;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class VagaApplication {
    private VagaRepository vagaRepository;

    public VagaApplication(VagaRepository vagaRepository){
        this.vagaRepository = vagaRepository;
    }

    public List<VagaModels> buscarTodos() throws IOException {
        return this.vagaRepository.buscarTodos();
    }

    public VagaModels buscarPorId(int id) throws IOException{
        return this.vagaRepository.buscarPorId(id);
    }

    public void adicionar(VagaModels vagaModels) throws IOException{
        this.vagaRepository.adicionar(vagaModels);
    }

    public void remover(int id) throws IOException{
        this.vagaRepository.remover(id);
    }

    public void atualizar(VagaModels vagaModels, int id) throws IOException{
        this.vagaRepository.atualizar(id, vagaModels);
    }
}
