package repositories;

import entities.Assinatura;

import java.util.ArrayList;
import java.util.List;

public class AssinaturaRepository {
    private List<Assinatura> assinaturas = new ArrayList<>();

    public List<Assinatura> buscarTodos(){
        return assinaturas;
    }

    public Assinatura buscarPorId(int id) {
        return assinaturas
                .stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .get();
    }

    public void adicionar(Assinatura assinatura){
        this.assinaturas.add(assinatura);
    }

    public void remover(int id){
        this.assinaturas.removeIf(a -> a.getId() == id);
    }

    public void atualizar(int id, Assinatura assinatura){
        Assinatura assinaturaInMemoiry = buscarPorId(id);

        assinaturaInMemoiry.setInicio(assinatura.getInicio());
        assinaturaInMemoiry.setFim(assinatura.getFim());
        assinaturaInMemoiry.setAtivo(assinatura.isAtivo());
    }
}
