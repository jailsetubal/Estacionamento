package entities;

public class Plano{
    private int id;
    private String nome;
    private int periodicidades;
    private String tipoVeiculo;
    private int valor;
    private int franquiaHoras;



    public Plano(int id, String nome, int periodicidades, String tipoVeiculo, int valor, int franquiaHoras) {
        this.id = id;
        this.nome = nome;
        this.periodicidades = periodicidades;
        this.tipoVeiculo = tipoVeiculo;
        this.valor = valor;
        this.franquiaHoras = franquiaHoras;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodicidades() {
        return periodicidades;
    }

    public void setPeriodicidades(int periodicidades) {
        this.periodicidades = periodicidades;
    }

    public String gettipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
      public int getFranquiaHoras() {
        return franquiaHoras;
    }

    public void setFranquiaHoras(int franquiaHoras) {
        this.franquiaHoras = franquiaHoras;
    }
}

