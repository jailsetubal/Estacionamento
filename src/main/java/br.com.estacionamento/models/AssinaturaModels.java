package br.com.estacionamento.models;

import br.com.estacionamento.entities.Assinatura;
import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;


@Entity
@Table(name = "assinaturas")
public class AssinaturaModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String inicio;
    private String fim;
    private boolean ativo;

    public AssinaturaModels(){

    }

    public AssinaturaModels(int id, String inicio, String fim, boolean ativo) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
            this.ativo = ativo;
        }


    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Inicio: " + inicio + "\n" +
                "Fim: " + fim + "\n" +
                "Ativo: " + ativo + "\n";
    }
}


