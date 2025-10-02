package br.com.estacionamento.models;


import br.com.estacionamento.entities.Cliente;
import br.com.estacionamento.entities.Pagamento;
import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

@Entity
@Table(name = "Pagamentos")
public class PagamentoModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dataPagamento;
    private float valor;
    private String status;

    public PagamentoModels(){

    }

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

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Data de Pagamento: " + dataPagamento + "\n" +
                "Valor: " + valor + "\n" +
                "Status: " + status + "\n";
    }

    @Bean
    public Pagamento getPagamento() {
        return new Pagamento();
    }
}
