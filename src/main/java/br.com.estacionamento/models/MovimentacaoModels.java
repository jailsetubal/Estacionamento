package br.com.estacionamento.models;


import br.com.estacionamento.entities.Cliente;
import br.com.estacionamento.entities.Movimentacao;
import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

@Entity
@Table(name = "Movimentacoes")
public class MovimentacaoModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String entrada;
    private String saida;
    private float valorCalculado;

    public MovimentacaoModels(){
    }

    public MovimentacaoModels(int id, String entrada, String saida, float valorCalculado){
        this.id = id;
        this.entrada = entrada;
        this.saida = saida;
        this.valorCalculado = valorCalculado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public float getValorCalculado() {
        return valorCalculado;
    }

    public void setValorCalculado(float valorCalculado) {
        this.valorCalculado = valorCalculado;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Entrada: " + entrada + "\n" +
                "Saída: " + saida + "\n" +
                "Valor Calculado: " + valorCalculado + "\n";
    }
}

