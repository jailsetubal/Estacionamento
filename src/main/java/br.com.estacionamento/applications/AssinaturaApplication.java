package br.com.estacionamento.applications;

import br.com.estacionamento.interfaces.AssinaturaRepository;
import br.com.estacionamento.models.AssinaturaModels;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class AssinaturaApplication {
    private AssinaturaRepository assinaturaRepository;

    public AssinaturaApplication(AssinaturaRepository assinaturaRepository){
        this.assinaturaRepository = assinaturaRepository;
    }

    public List<AssinaturaModels> buscarTodos() throws IOException{
        return this.assinaturaRepository.buscarTodos();
    }

    public AssinaturaModels buscarPorId(int id){
        return this.assinaturaRepository.buscarPorId(id);
    }

    public void adicionar (AssinaturaModels assinaturaModels) throws IOException{
        this.assinaturaRepository.adicionar(assinaturaModels);
    }

    public void remover (int id) throws IOException{
        this.assinaturaRepository.remover(id);
    }

    public void atualizar (AssinaturaModels assinaturaModels, int id) throws IOException{
        this.assinaturaRepository.atualizar(id, assinaturaModels);
    }
}

