package com.unab.pubunab.Dao;

import com.unab.pubunab.modelos.Comentario;
import com.unab.pubunab.modelos.Compartir;
import com.unab.pubunab.modelos.Megusta;


public interface IDaoInteraccion {
    
    boolean crearMegusta(Megusta megusta);
    
    String cantidadMegusta(String uuid);
          
    boolean crearComentario(Comentario comentario);
      
    String cantidadComentario(String uuid);
       
    boolean crearCompartir(Compartir compartir);
      
    String cantidadCompartir(String uuid);
  
}
