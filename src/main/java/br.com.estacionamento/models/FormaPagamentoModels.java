package br.com.estacionamento.models;


import br.com.estacionamento.entities.FormaPagamento;
import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

@Entity
@Table(name = "FormaPagamento")
public class FormaPagamentoModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tipo;

    public FormaPagamentoModels(){

    }

    public FormaPagamentoModels(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString(){
        return "Id:" + id + "\n" +
                "Tipo: " + tipo + "\n";
    }

    @Bean
    public FormaPagamento getFormaPagamento(){
        return new FormaPagamento();
    }
}







