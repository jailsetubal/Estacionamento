package applications;

import entities.Assinatura;
import repositories.AssinaturaRepository;

import java.io.IOException;
import java.util.List;

public class AssinaturaApplication {
    private AssinaturaRepository assinaturaRepository;

    public AssinaturaApplication(AssinaturaRepository assinaturaRepository){
        this.assinaturaRepository = assinaturaRepository;
    }

    public List<Assinatura> buscarTodos() throws IOException{
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

