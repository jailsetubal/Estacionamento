package applications;

import entities.Assinatura;
import models.AssinaturaModels;
import org.springframework.stereotype.Service;
import repositories.assinatura.AssinaturaRepositoryImpl;

import java.io.IOException;
import java.util.List;

@Service
public class AssinaturaApplication {
    private AssinaturaRepositoryImpl assinaturaRepository;

    public AssinaturaApplication(AssinaturaRepositoryImpl assinaturaRepository){
        this.assinaturaRepository = assinaturaRepository;
    }

    public List<AssinaturaModels> buscarTodos() throws IOException{
        return this.assinaturaRepository.buscarTodos();
    }

    public Assinatura buscarPorId(Assinatura assinatura){
        return this.assinaturaRepository.buscarPorId(assinatura.getId());
    }

    public void adicionar (Assinatura assinatura) throws IOException{
        this.assinaturaRepository.adicionar(assinatura);
    }

    public void remover (Assinatura assinatura) throws IOException{
        this.assinaturaRepository.remover(assinatura.getId());
    }

    public void atualizar (Assinatura assinatura, int id) throws IOException{
        this.assinaturaRepository.atualizar(assinatura.getId(), assinatura);
    }
}

