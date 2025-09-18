package entities;

public class LeituraSensor {
    private int id;
    private String momento;
    private boolean ocupado;

    public LeituraSensor(int id, String momento, boolean ocupado){
        this.id = id;
        this. momento = momento;
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
}
