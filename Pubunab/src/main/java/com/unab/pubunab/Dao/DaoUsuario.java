package com.unab.pubunab.Dao;

import com.unab.pubunab.modelos.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoUsuario extends Conexion implements IDaoUsuario{

    @Override
    public ArrayList<Usuario> verUsuarios() {
        
        ArrayList<Usuario> arrayListUsuarios=new ArrayList<>();
        
        String sql="SELECT * FROM "+Constantes.T_USUARIO+
                    " ORDER BY "+Constantes.TU_ID+" DESC";
        
        try {
            PreparedStatement ps=getConexion().prepareStatement(sql);
            ResultSet resultSet=ps.executeQuery();
            
            while (resultSet.next()) {                
                
                Usuario usuario=new Usuario();
                usuario.setId(resultSet.getInt(Constantes.TU_ID));
                usuario.setEmail(resultSet.getString(Constantes.TU_EMAIL));
                usuario.setNombre(resultSet.getString(Constantes.TU_NOMBRE));
                usuario.setPassword(resultSet.getString(Constantes.TU_PASSWORD));
                usuario.setCreado(resultSet.getTimestamp(Constantes.TU_CREADO));               
                
                arrayListUsuarios.add(usuario);                
            }
            
            return arrayListUsuarios;
            
        } catch (SQLException e) {
            System.out.println("Error al leer los datos "+e.getMessage());
            return arrayListUsuarios;
        }finally{
            try {
                getConexion().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion "+e);
            }
        }
    }

 

 
    
}
