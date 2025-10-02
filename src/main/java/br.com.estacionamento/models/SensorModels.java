package br.com.estacionamento.models;


import br.com.estacionamento.entities.Cliente;
import br.com.estacionamento.entities.Sensor;
import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

@Entity
@Table(name = "Sensores")
public class SensorModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dataInstalacao;

    public SensorModels(){

    }

    public SensorModels(int id, String dataInstalacao) {
        this.id = id;
        this.dataInstalacao = dataInstalacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(String dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Data de Instalação: " + dataInstalacao;
    }

    @Bean
    public Sensor getSensor() {
        return new Sensor();
    }
}

