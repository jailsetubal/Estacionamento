package entities;

public class LeituraSensor {
    private int id;
    private String horaDeteccao;
    private boolean ocupado;

    public LeituraSensor(int id, String horaDeteccao, boolean ocupado) {
        this.id = id;
        this.horaDeteccao = horaDeteccao;
        this.ocupado = ocupado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoraDeteccao() {
        return horaDeteccao;
    }

    public void setHoraDeteccao(String horaDeteccao) {
        this.horaDeteccao = horaDeteccao;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
