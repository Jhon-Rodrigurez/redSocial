package com.unab.pubunab.modelos;

import java.sql.Timestamp;

public class Publicacion {
    
    private int id;
    private String uuid ;
    private String email ;
    private String contenido;
    private Timestamp creado;

    public Publicacion() {
    }
        
    public Publicacion(String uuid, String email, String contenido, Timestamp creado) {
        this.uuid = uuid;
        this.email = email;
        this.contenido = contenido;
        this.creado = creado;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Timestamp getCreado() {
        return creado;
    }

    public void setCreado(Timestamp creado) {
        this.creado = creado;
    }
    
    
}