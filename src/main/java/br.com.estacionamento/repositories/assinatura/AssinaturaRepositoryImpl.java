package br.com.estacionamento.repositories.assinatura;

import br.com.estacionamento.interfaces.AssinaturaRepository;
import br.com.estacionamento.models.AssinaturaModels;

import java.util.ArrayList;
import java.util.List;

public class AssinaturaRepositoryImpl implements AssinaturaRepository {
    private List<AssinaturaModels> assinaturas = new ArrayList<>();

    public List<AssinaturaModels> buscarTodos(){
        return assinaturas;
    }

    public AssinaturaModels buscarPorId(int id) {
        return assinaturas
                .stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .get();
    }

    public void adicionar(AssinaturaModels assinatura){
        this.assinaturas.add(assinatura);
    }

    public void remover(int id){
        this.assinaturas.removeIf(a -> a.getId() == id);
    }

    public void atualizar(int id, AssinaturaModels assinatura){
        AssinaturaModels assinaturaInMemoiry = buscarPorId(id);

        assinaturaInMemoiry.setInicio(assinatura.getInicio());
        assinaturaInMemoiry.setFim(assinatura.getFim());
        assinaturaInMemoiry.setAtivo(assinatura.isAtivo());
    }
}
