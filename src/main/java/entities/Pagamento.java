package entities;

public class Pagamento {
    private int id;
    private String dataPagamento;
    private float valor;
    private String statusPagamento;

    public Pagamento(int id, String dataPagamento, float valor, String statusPagamento){
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.valor = valor;
        this.statusPagamento = statusPagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
}
