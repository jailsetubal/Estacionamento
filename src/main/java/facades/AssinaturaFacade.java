package facades;

import applications.AssinaturaApplication;
import entities.Assinatura;

import java.io.IOException;
import java.util.List;

public class AssinaturaFacade {
    private final AssinaturaApplication assinaturaApplication;

    public AssinaturaFacade(AssinaturaApplication assinaturaApplication) {
        this.assinaturaApplication = assinaturaApplication;
    }

    public List<Assinatura> buscarTodos() throws IOException {
        return this.assinaturaApplication.buscarTodos();
    }

    public Assinatura buscarPorId(Assinatura assinatura) throws IOException {
        return this.assinaturaApplication.buscarPorId(assinatura);
    }

    public void adicionar(Assinatura assinatura) throws IOException {
        this.assinaturaApplication.adicionar(assinatura);
    }

    public void remover(Assinatura assinatura) throws IOException {
        this.assinaturaApplication.remover(assinatura);
    }

    public void atualizar(int id, Assinatura assinatura) throws IOException {
        this.assinaturaApplication.atualizar(assinatura, id);
    }
}
