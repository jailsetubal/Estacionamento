package br.com.estacionamento.entities;

public class Veiculo {
    private int id;
    private String placa;
    private String tipo;
    private String modelo;
    private String cor;

    public Veiculo(){

    }

    public Veiculo(int id, String placa, String tipo, String modelo, String cor) {
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
}
