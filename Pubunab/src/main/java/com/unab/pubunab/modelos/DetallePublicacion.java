package com.unab.pubunab.modelos;

import java.sql.Timestamp;


public class DetallePublicacion extends GridPublicacion{
    
    private String nombreUsuarioMegusta;
    private String nombreUsuarioCompartir;
    private String nombreUsuarioComentario;
    private String contenidoComentario;
    private Timestamp creadoComentario;

    public DetallePublicacion() {
    }
    
    public DetallePublicacion(String nombreUsuarioMegusta, String nombreUsuarioCompartir, String nombreUsuarioComentario, String contenidoComentario, Timestamp creadoComentario, String nombreUsuarioPublicacion, String contenidoPublicacion, int cantidadMegusta, int cantidadComentario, int cantidadCompartir, Timestamp creadoPublicacion) {
        super(nombreUsuarioPublicacion, contenidoPublicacion, cantidadMegusta, cantidadComentario, cantidadCompartir, creadoPublicacion);
        this.nombreUsuarioMegusta = nombreUsuarioMegusta;
        this.nombreUsuarioCompartir = nombreUsuarioCompartir;
        this.nombreUsuarioComentario = nombreUsuarioComentario;
        this.contenidoComentario = contenidoComentario;
        this.creadoComentario = creadoComentario;
    }

    public String getNombreUsuarioMegusta() {
        return nombreUsuarioMegusta;
    }

    public void setNombreUsuarioMegusta(String nombreUsuarioMegusta) {
        this.nombreUsuarioMegusta = nombreUsuarioMegusta;
    }

    public String getNombreUsuarioCompartir() {
        return nombreUsuarioCompartir;
    }

    public void setNombreUsuarioCompartir(String nombreUsuarioCompartir) {
        this.nombreUsuarioCompartir = nombreUsuarioCompartir;
    }

    public String getNombreUsuarioComentario() {
        return nombreUsuarioComentario;
    }

    public void setNombreUsuarioComentario(String nombreUsuarioComentario) {
        this.nombreUsuarioComentario = nombreUsuarioComentario;
    }

    public String getContenidoComentario() {
        return contenidoComentario;
    }

    public void setContenidoComentario(String contenidoComentario) {
        this.contenidoComentario = contenidoComentario;
    }

    public Timestamp getCreadoComentario() {
        return creadoComentario;
    }

    public void setCreadoComentario(Timestamp creadoComentario) {
        this.creadoComentario = creadoComentario;
    }

    
    
    
}
