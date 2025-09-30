package interfaces;

import entities.Assinatura;
import models.AssinaturaModels;
import models.ClienteModels;

import java.util.List;

public interface AssinaturaRepository {
    public List<Assinatura> buscarTodos();
    public AssinaturaModels buscarPorId(int id);
    public void adicionar(AssinaturaModels assinaturaModels);
    public void remover(int id);
    public void atualizar(int id, AssinaturaModels assinaturaModels);
}