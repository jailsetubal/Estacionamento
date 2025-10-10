package br.com.estacionamento.repositories.veiculo;


import br.com.estacionamento.entities.Veiculo;
import br.com.estacionamento.interfaces.VeiculoRepository;
import br.com.estacionamento.models.ClienteModels;
import br.com.estacionamento.models.VeiculoModels;
import br.com.estacionamento.repositories.cliente.ClienteModelRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VeiculoRepositoryJpa implements VeiculoRepository {
    private final VeiculoModelRepositoryJpa veiculoModelRepositoryJpa;

    @Autowired
    public VeiculoRepositoryJpa(VeiculoModelRepositoryJpa veiculoModelRepositoryJpa) {
        this.veiculoModelRepositoryJpa = veiculoModelRepositoryJpa;
    }

    @Override
    public List<VeiculoModels> buscarTodos() {
        return this.veiculoModelRepositoryJpa.findAll();
    }

    @Override
    public VeiculoModels buscarPorId(int id) {
        return this.veiculoModelRepositoryJpa.findById(id).get();
    }

    @Override
    public void adicionar(VeiculoModels veiculoModels) {
        this.veiculoModelRepositoryJpa.save(veiculoModels);
    }

    @Override
    public void remover(int id) {
        this.veiculoModelRepositoryJpa.deleteById(id);
    }

    @Override
    public void atualizar(int id, VeiculoModels veiculoModels) {
        VeiculoModels veiculoInDB = this.veiculoModelRepositoryJpa.findById(id).get();

        veiculoInDB.setPlaca(veiculoModels.getPlaca());
        veiculoInDB.setTipo(veiculoModels.getTipo());
        veiculoInDB.setModelo(veiculoModels.getModelo());
        veiculoInDB.setCor(veiculoModels.getCor());
    }

}
