package br.com.estacionamento.models;

public class MovimentacaoModels {
    private int id;
    private String entrada;
    private String saida;
    private float valorCalculado;

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
}

