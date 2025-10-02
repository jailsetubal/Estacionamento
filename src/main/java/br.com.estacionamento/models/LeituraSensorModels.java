package br.com.estacionamento.models;


import br.com.estacionamento.entities.FormaPagamento;
import br.com.estacionamento.entities.LeituraSensor;
import jakarta.persistence.*;
import org.hibernate.id.factory.spi.GenerationTypeStrategy;
import org.springframework.context.annotation.Bean;

@Entity
@Table(name = "LeituraSensor")
public class LeituraSensorModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String momento;
    private boolean ocupado;

    public LeituraSensorModels(){

    }

    public LeituraSensorModels(int id, String momento, boolean ocupado) {
        this.id = id;
        this.momento = momento;
        this.ocupado = ocupado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString(){
        return "Id:" + id + "\n" +
                "Momento: " + momento + "\n" +
                "Ocupado" + ocupado;
    }

    @Bean
    public LeituraSensor getLeituraSensor(){
        return new LeituraSensor();
    }
}

