package com.unab.pubunab.modelos;

import java.sql.Timestamp;

public class Megusta {

    private String uuid;
    private String email;
    private Timestamp creado;

    public Megusta(String uuid, String email, Timestamp creado) {
        this.uuid = uuid;
        this.email = email;
        this.creado = creado;
    }

    
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreado() {
        return creado;
    }

    public void setCreado(Timestamp creado) {
        this.creado = creado;
    }

    
}
