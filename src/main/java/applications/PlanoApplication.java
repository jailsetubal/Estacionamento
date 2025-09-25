package applications;

import entities.Plano;
import repositories.PlanoRepository;

import java.io.IOException;
import java.util.List;

public class PlanoApplication {
    private PlanoRepository planoRepository;

    public PlanoApplication(PlanoRepository planoRepository){
        this.planoRepository = planoRepository;
    }

    public List<Plano> buscarTodos() throws IOException {
        return this.planoRepository.buscarTodos();
    }

    public Plano buscarPorId(Plano plano) throws IOException{
        return this.planoRepository.buscarPorId(plano.getId());
    }

    public void adicionar(Plano plano) throws IOException{
        this.planoRepository.adicionar(plano);
    }

    public void remover(Plano plano) throws IOException{
        this.planoRepository.remover(plano.getId());
    }

    public void atualizar(Plano plano, int id) throws IOException{
        this.planoRepository.atualizar(plano.getId(), plano);
    }
}
