package models;

import entities.Assinatura;
import entities.Cliente;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;


@Entity
@Table
public class AssinaturaModels {
    @Id
    @GeneratedValue

    private int id;
    private String inicio;
    private String fim;
    private boolean ativo;

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

    @Bean
    public Assinatura getAssinatura() {
        return new Assinatura();
    }
}


