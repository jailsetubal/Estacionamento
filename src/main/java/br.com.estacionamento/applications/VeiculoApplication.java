package br.com.estacionamento.applications;

import br.com.estacionamento.interfaces.VeiculoRepository;
import br.com.estacionamento.models.VeiculoModels;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class VeiculoApplication {
    private VeiculoRepository veiculoRepository;

    public VeiculoApplication(VeiculoRepository veiculoRepository){
        this.veiculoRepository = veiculoRepository;
    }

    public List<VeiculoModels> buscarTodos() throws IOException {
        return this.veiculoRepository.buscarTodos();
    }

    public VeiculoModels buscarPorId(int id) throws IOException{
        return this.veiculoRepository.buscarPorId(id);
    }

    public void adicionar(VeiculoModels veiculoModels) throws IOException{
        this.veiculoRepository.adicionar(veiculoModels);
    }

    public void remover(int id) throws IOException{
        this.veiculoRepository.remover(id);
    }

    public void atualizar(VeiculoModels veiculoModels, int id) throws IOException{
        this.veiculoRepository.atualizar(id, veiculoModels);
    }
}

