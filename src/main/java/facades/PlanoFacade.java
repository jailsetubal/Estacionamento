package facades;

import applications.PlanoApplication;
import entities.Plano;

import java.io.IOException;
import java.util.List;

public class PlanoFacade {
    private final PlanoApplication planoApplication;

    public PlanoFacade(PlanoApplication planoApplication) {
        this.planoApplication = planoApplication;
    }

    public List<Plano> buscarTodos() throws IOException {
        return this.planoApplication.buscarTodos();
    }

    public Plano buscarPorId(Plano plano) throws IOException {
        return this.planoApplication.buscarPorId(plano);
    }

    public void adicionar(Plano plano) throws IOException {
        this.planoApplication.adicionar(plano);
    }

    public void remover(Plano plano) throws IOException {
        this.planoApplication.remover(plano);
    }

    public void atualizar(int id, Plano plano) throws IOException {
        this.planoApplication.atualizar(plano, plano.getId());
    }
}
