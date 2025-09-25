package entities;

public class Vaga {
    public int id;
    public int numeroVaga;
    public String tipoVaga;
    public String andar;
    public String setor;
    public Boolean temSensor;

    public Vaga(int id, int numeroVaga, String tipoVaga, String andar, String setor, Boolean temSensor) {
        this.id = id;
        this.numeroVaga = numeroVaga;
        this.tipoVaga = tipoVaga;
        this.andar = andar;
        this.setor = setor;
        this.temSensor = temSensor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroVaga() {
        return numeroVaga;
    }

    public void setNumeroVaga(int numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public String getTipoVaga() {
        return tipoVaga;
    }

    public void setTipoVaga(String tipoVaga) {
        this.tipoVaga = tipoVaga;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean isOcupado() {
        return temSensor;
    }

    public void setTemSensor(Boolean temSensor) {
        this.temSensor = temSensor;
    }
}
