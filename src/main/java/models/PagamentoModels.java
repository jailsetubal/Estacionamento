package models;

public class PagamentoModels {
    private int id;
    private String dataPagamento;
    private float valor;
    private String status;

    public PagamentoModels(int id, String dataPagamento, float valor, String status) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.valor = valor;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
