
package entities;

import java.time.LocalDateTime;

public class Assinatura {
    private int id;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private boolean ativo;

    public Assinatura(int id, LocalDateTime inicio, LocalDateTime fim, boolean ativo) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
