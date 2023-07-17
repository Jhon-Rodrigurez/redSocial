package com.unab.pubunab.Dao;

import com.unab.pubunab.modelos.Comentario;
import com.unab.pubunab.modelos.Compartir;
import com.unab.pubunab.modelos.Megusta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DaoInteraccion extends Conexion implements IDaoInteraccion{

    @Override
    public boolean crearMegusta(Megusta megusta) {
        
        String sql="INSERT INTO "+Constantes.T_MEGUSTA+"("+
                    Constantes.TM_UUID+","+
                    Constantes.TM_EMAIL+","+
                    Constantes.TM_CREADO+") VALUES(?,?,?)";
        
        try {
            PreparedStatement ps= getConexion().prepareStatement(sql);
            ps.setString(1, megusta.getUuid());
            ps.setString(2, megusta.getEmail());
            ps.setTimestamp(3, megusta.getCreado());
            ps.executeUpdate();
            
            System.out.println("Creado con exito");
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error al crear "+e.getMessage());
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
    public String cantidadMegusta(String uuid) {
        
        String sql="SELECT COUNT(*) as cantidad FROM "+Constantes.T_MEGUSTA+
                    " WHERE "+Constantes.TM_UUID+"='"+uuid+"'";
        
        try {
            PreparedStatement ps=getConexion().prepareStatement(sql);
            ResultSet resultSet=ps.executeQuery();
            
            while (resultSet.next()) {                
                
                return resultSet.getString("cantidad");
            }
            
            return "0";
            
        } catch (SQLException e) {
            System.out.println("Error al leer los datos "+e.getMessage());
            return "0";
        }finally{
            try {
                getConexion().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion "+e);
            }
        }
    }

    
    @Override
    public boolean crearComentario(Comentario comentario) {
        
         String sql="INSERT INTO "+Constantes.T_COMENTARIO+"("+
                    Constantes.TCO_UUID+","+
                    Constantes.TCO_EMAIL+","+
                    Constantes.TCO_CONTENIDO+","+
                    Constantes.TCO_CREADO+") VALUES(?,?,?,?)";
        
        try {
            PreparedStatement ps= getConexion().prepareStatement(sql);
            ps.setString(1, comentario.getUuid());
            ps.setString(2, comentario.getEmail());
            ps.setString(3, comentario.getContenido());
            ps.setTimestamp(4, comentario.getCreado());
            ps.executeUpdate();
            
            System.out.println("Creado con exito");
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error al crear "+e.getMessage());
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
    public String cantidadComentario(String uuid) {
        
        String sql="SELECT COUNT(*) as cantidad FROM "+Constantes.T_COMENTARIO+
                    " WHERE "+Constantes.TCO_UUID+"='"+uuid+"'";
        
        try {
            PreparedStatement ps=getConexion().prepareStatement(sql);
            ResultSet resultSet=ps.executeQuery();
            
            while (resultSet.next()) {                
                
                return resultSet.getString("cantidad");
            }
            
            return "0";
            
        } catch (SQLException e) {
            System.out.println("Error al leer los datos "+e.getMessage());
            return "0";
        }finally{
            try {
                getConexion().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion "+e);
            }
        }
    }

    
    @Override
    public boolean crearCompartir(Compartir compartir) {
        
        String sql="INSERT INTO "+Constantes.T_COMPARTIR+"("+
                    Constantes.TCR_UUID+","+
                    Constantes.TCR_EMAILFROM+","+
                    Constantes.TCR_EMAILTO+","+
                    Constantes.TCR_CREADO+") VALUES(?,?,?,?)";
        
        try {
            PreparedStatement ps= getConexion().prepareStatement(sql);
            ps.setString(1, compartir.getUuid());
            ps.setString(2, compartir.getEmailFrom());
            ps.setString(3, compartir.getEmailTo());
            ps.setTimestamp(4, compartir.getCreado());
            ps.executeUpdate();
            
            System.out.println("Creado con exito");
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error al crear "+e.getMessage());
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
    public String cantidadCompartir(String uuid) {
        
        String sql="SELECT COUNT(*) as cantidad FROM "+Constantes.T_COMPARTIR+
                    " WHERE "+Constantes.TCR_UUID+"='"+uuid+"'";
        
        try {
            PreparedStatement ps=getConexion().prepareStatement(sql);
            ResultSet resultSet=ps.executeQuery();
            
            while (resultSet.next()) {                
                
                return resultSet.getString("cantidad");
            }
            
            return "0";
            
        } catch (SQLException e) {
            System.out.println("Error al leer los datos "+e.getMessage());
            return "0";
        }finally{
            try {
                getConexion().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion "+e);
            }
        }
    }

   
}
