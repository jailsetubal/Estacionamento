package br.com.estacionamento.models;

import br.com.estacionamento.entities.Cliente;
import br.com.estacionamento.entities.Veiculo;
import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Veiculos")
public class VeiculoModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String placa;
    private String tipo;
    private String modelo;
    private String cor;

    @Column(name = "cliente_id")
    private int clienteId;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id",insertable = false, updatable = false)
    private ClienteModels cliente;

    @OneToMany(mappedBy = "veiculos")
    private List<MovimentacaoModels> movimentacoes = new ArrayList<>();

    public VeiculoModels(){

    }

    public VeiculoModels(int id, String placa, String tipo, String modelo, String cor) {
        this.id = id;
        this.placa = placa;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Placa: " + placa + "\n" +
                "Tipo: " + tipo + "\n" +
                "Modelo: " + modelo + "\n" +
                "Cor: " + cor + "\n";
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public ClienteModels getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModels cliente) {
        this.cliente = cliente;
    }
}


