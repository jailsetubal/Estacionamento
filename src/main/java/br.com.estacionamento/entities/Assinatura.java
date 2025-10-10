
package br.com.estacionamento.entities;

import java.time.LocalDateTime;

public class Assinatura {
    private int id;
    private int inicio;
    private int fim;
    private boolean ativo;

    public Assinatura(){

    }

    public Assinatura(int id, int inicio, int fim, boolean ativo) {
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

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
