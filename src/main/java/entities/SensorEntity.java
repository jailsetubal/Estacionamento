package entities;

public class SensorEntity {
    private int id;
    private String dataInstalacao;


    public SensorEntity(int id, String dataInstalacao) {
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


