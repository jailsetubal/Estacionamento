package models;

public class SensorModels {
    private int id;
    private String dataInstalacao;

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
}

