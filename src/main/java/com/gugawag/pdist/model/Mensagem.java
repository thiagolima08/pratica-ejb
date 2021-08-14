package com.gugawag.pdist.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mensagem {

    @Id
    private long id;
    private String texto;

    public Mensagem(long id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public Mensagem() {

    }

    public long getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
