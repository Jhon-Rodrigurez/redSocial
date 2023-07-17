package com.unab.pubunab.Dao;

import com.unab.pubunab.modelos.DetallePublicacion;
import com.unab.pubunab.modelos.GridPublicacion;
import com.unab.pubunab.modelos.Publicacion;
import java.util.ArrayList;

public interface IDaoPublicacion {
    
    boolean crearPublicacion(Publicacion publicacion);
    
    ArrayList<Publicacion> verPublicaciones();
    
//    ArrayList<GridPublicacion> verGridPublicaciones();
    
    DetallePublicacion detallePublicacion(GridPublicacion gridPublicacion);

}
