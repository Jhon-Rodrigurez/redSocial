package com.unab.pubunab.Dao;

import com.unab.pubunab.modelos.DetallePublicacion;
import com.unab.pubunab.modelos.GridPublicacion;
import com.unab.pubunab.modelos.Publicacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoPublicacion extends Conexion implements IDaoPublicacion{

    @Override
    public boolean crearPublicacion(Publicacion publicacion) {
        
        String sql="INSERT INTO "+Constantes.T_PUBLICACION+"("+
                    Constantes.TP_UUID+","+
                    Constantes.TP_EMAIL+","+
                    Constantes.TP_CONTENIDO+","+
                    Constantes.TP_CREADO+") VALUES(sha1(?),?,?,?)";
        
        try {
            PreparedStatement ps= getConexion().prepareStatement(sql);
            ps.setString(1, publicacion.getUuid());
            ps.setString(2, publicacion.getEmail());
            ps.setString(3, publicacion.getContenido());
            ps.setTimestamp(4, publicacion.getCreado());
            ps.executeUpdate();
            
            System.out.println("Publicacion creada con exito");
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error al crear la publicacion "+e.getMessage());
            return false;
        } finally{
            try {
                getConexion().close();
            } catch (SQLException e) {
                 System.out.println("Error al cerrar la conexion "+e.getMessage());
            }
        }
    }

    @Override
    public ArrayList<Publicacion> verPublicaciones() {
        
        ArrayList<Publicacion> arrayListPublicaciones=new ArrayList<>();
       
        String sql="SELECT * FROM "+Constantes.T_PUBLICACION+
                    " ORDER BY "+Constantes.TP_ID+" DESC";
        
        try {
            PreparedStatement ps=getConexion().prepareStatement(sql);
            ResultSet resultSet=ps.executeQuery();
            
            while (resultSet.next()) {                
                
                Publicacion publicacion=new Publicacion();
                publicacion.setId(resultSet.getInt(Constantes.TP_ID));
                publicacion.setUuid(resultSet.getString(Constantes.TP_UUID));
                publicacion.setEmail(resultSet.getString(Constantes.TP_EMAIL));
                publicacion.setContenido(resultSet.getString(Constantes.TP_CONTENIDO));
                publicacion.setCreado(resultSet.getTimestamp(Constantes.TP_CREADO));;
                
                arrayListPublicaciones.add(publicacion);
            }
            
            return arrayListPublicaciones;
            
        } catch (SQLException e) {
            System.out.println("Error al leer los datos "+e.getMessage());
            return arrayListPublicaciones;
        }finally{
            try {
                getConexion().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion "+e);
            }
        }
    }

    @Override
    public DetallePublicacion detallePublicacion(GridPublicacion gridPublicacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
