package repositories;

import entities.Vaga;

import java.util.ArrayList;
import java.util.List;

public class VagaRepository {
    private List<Vaga> vagas = new ArrayList<>();

public List<Vaga> buscarTodos(){
    return vagas;
}
}
