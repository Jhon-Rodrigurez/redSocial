package com.unab.pubunab.modelos;

import java.sql.Timestamp;

public class GridPublicacion {
    
    private String uuid;
    private String nombreUsuarioPublicacion;
    private String contenidoPublicacion;
    private int cantidadMegusta;
    private int cantidadComentario;
    private int cantidadCompartir;
    private Timestamp creadoPublicacion;

    public GridPublicacion() {
    }

    public GridPublicacion(String nombreUsuarioPublicacion, String contenidoPublicacion, int cantidadMegusta, int cantidadComentario, int cantidadCompartir, Timestamp creadoPublicacion) {
        this.nombreUsuarioPublicacion = nombreUsuarioPublicacion;
        this.contenidoPublicacion = contenidoPublicacion;
        this.cantidadMegusta = cantidadMegusta;
        this.cantidadComentario = cantidadComentario;
        this.cantidadCompartir = cantidadCompartir;
        this.creadoPublicacion = creadoPublicacion;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNombreUsuarioPublicacion() {
        return nombreUsuarioPublicacion;
    }

    public void setNombreUsuarioPublicacion(String nombreUsuarioPublicacion) {
        this.nombreUsuarioPublicacion = nombreUsuarioPublicacion;
    }

    public String getContenidoPublicacion() {
        return contenidoPublicacion;
    }

    public void setContenidoPublicacion(String contenidoPublicacion) {
        this.contenidoPublicacion = contenidoPublicacion;
    }

    public int getCantidadMegusta() {
        return cantidadMegusta;
    }

    public void setCantidadMegusta(int cantidadMegusta) {
        this.cantidadMegusta = cantidadMegusta;
    }

    public int getCantidadComentario() {
        return cantidadComentario;
    }

    public void setCantidadComentario(int cantidadComentario) {
        this.cantidadComentario = cantidadComentario;
    }

    public int getCantidadCompartir() {
        return cantidadCompartir;
    }

    public void setCantidadCompartir(int cantidadCompartir) {
        this.cantidadCompartir = cantidadCompartir;
    }

    public Timestamp getCreadoPublicacion() {
        return creadoPublicacion;
    }

    public void setCreadoPublicacion(Timestamp creadoPublicacion) {
        this.creadoPublicacion = creadoPublicacion;
    }
    
    
}