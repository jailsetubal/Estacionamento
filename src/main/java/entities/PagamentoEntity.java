package entities;

public class PagamentoEntity {
        private int id;
        private String dataPagamento;
        private Float valor;
        private  String status;
        private  String pagamentoCol;

    public PagamentoEntity(int id, String dataPagamento, Float valor, String status, String pagamentoCol) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.valor = valor;
        this.status = status;
        this.pagamentoCol = pagamentoCol;
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

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPagamentoCol() {
        return pagamentoCol;
    }

    public void setPagamentoCol(String pagamentoCol) {
        this.pagamentoCol = pagamentoCol;
    }
}
