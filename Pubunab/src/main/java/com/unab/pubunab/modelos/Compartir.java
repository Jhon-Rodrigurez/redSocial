package com.unab.pubunab.modelos;

import java.sql.Timestamp;


public class Compartir {

    private String uuid;
    private String emailFrom;
    private String emailTo;
    private Timestamp creado;

    public Compartir(String uuid, String emailFrom, String emailTo, Timestamp creado) {
        this.uuid = uuid;
        this.emailFrom = emailFrom;
        this.emailTo = emailTo;
        this.creado = creado;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public Timestamp getCreado() {
        return creado;
    }

    public void setCreado(Timestamp creado) {
        this.creado = creado;
    }

    
}
