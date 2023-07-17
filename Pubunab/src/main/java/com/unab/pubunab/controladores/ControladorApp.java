
package com.unab.pubunab.controladores;

import com.unab.pubunab.Dao.DaoInteraccion;
import com.unab.pubunab.Dao.DaoPublicacion;
import com.unab.pubunab.Dao.DaoUsuario;
import com.unab.pubunab.Dao.IDaoInteraccion;
import com.unab.pubunab.Dao.IDaoPublicacion;
import com.unab.pubunab.Dao.IDaoUsuario;
import com.unab.pubunab.modelos.Comentario;
import com.unab.pubunab.modelos.Compartir;
import com.unab.pubunab.modelos.Megusta;
import com.unab.pubunab.modelos.Publicacion;
import com.unab.pubunab.modelos.Usuario;
import com.unab.pubunab.vistas.JFrameApp;
import com.unab.pubunab.vistas.JFrameMuro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ControladorApp implements ActionListener{
    
    private IDaoPublicacion iDaoPublicacion;
    private IDaoUsuario iDaoUsuario;
    private IDaoInteraccion iDaoInteraccion;
    private JFrameApp jFrameApp;
    private JPanel jPanel;
    private JFrameMuro jFrameMuros[];
    private Publicacion publicaciones[];

    
    public ControladorApp(JFrameApp jFrameApp) {
        this.iDaoPublicacion= new DaoPublicacion();
        this.iDaoUsuario= new DaoUsuario();
        this.iDaoInteraccion= new DaoInteraccion();
        this.jFrameApp= jFrameApp;
    }
    
    
    public void inicio(){

        jFrameApp.jbPublicar.addActionListener(this);
            
        setJcbUsuario();
                
        mostrarPublicaciones(iDaoPublicacion.verPublicaciones());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==jFrameApp.jbPublicar){
                             
            String email= getJcbUsuario();
            
            if(!email.equals("Seleccione")){
                publicar();
                limpiar();
                mostrarPublicaciones(iDaoPublicacion.verPublicaciones());
            }else{
               JOptionPane.showMessageDialog(null, "Seleccione un usuario", null, JOptionPane.WARNING_MESSAGE);                    
            }

        }

        for (int i=0; i<jFrameMuros.length; i++) {
            
            if(e.getSource()==jFrameMuros[i].jbVer){
                
            }
            
            if(e.getSource()==jFrameMuros[i].jbMegusta){
  
                String email= getJcbUsuario();
                
                if(!email.equals("Seleccione")){
                
                    long fecha= System.currentTimeMillis();
                    Timestamp creado= new Timestamp(fecha);
                
                    if(iDaoInteraccion.crearMegusta(new Megusta(publicaciones[i].getUuid(), email, creado))){                    
                        mostrarPublicaciones(iDaoPublicacion.verPublicaciones());
                        JOptionPane.showMessageDialog(null, "Me gusta!", null, JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al dar me gusta", null, JOptionPane.ERROR_MESSAGE);                    
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione un usuario", null, JOptionPane.WARNING_MESSAGE);                    
                }
            }
            
            if(e.getSource()==jFrameMuros[i].jbComentar){

                String email= getJcbUsuario();
            
                if(!email.equals("Seleccione")){
      
                    long fecha= System.currentTimeMillis();
                    Timestamp creado= new Timestamp(fecha);

                    String titulo="Comentar a "+jFrameMuros[i].jlNombre.getText();
                    JTextArea jTextArea = new JTextArea("");
                    jTextArea.setColumns(15);
                    jTextArea.setRows(5);
                    JScrollPane entrada=new JScrollPane(jTextArea);
            
                    int opcion = JOptionPane.showConfirmDialog(null, entrada, titulo, 
                            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null);
                    
                    if (opcion == 0) {
                        
                        String contenido= jTextArea.getText();
                    
                        if(iDaoInteraccion.crearComentario(new Comentario(publicaciones[i].getUuid(), email, contenido, creado))){                    
                        mostrarPublicaciones(iDaoPublicacion.verPublicaciones());
                        JOptionPane.showMessageDialog(null, "Comentado!", null, JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "Error al comentar", null, JOptionPane.ERROR_MESSAGE);                    
                        }
                    }

                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione un usuario", null, JOptionPane.WARNING_MESSAGE);
                }

            }

            if(e.getSource()==jFrameMuros[i].jbCompartir){

                String emailFrom= getJcbUsuario();
                
                if(!emailFrom.equals("Seleccione")){

                    long fecha= System.currentTimeMillis();
                    Timestamp creado= new Timestamp(fecha);

                    ArrayList<Usuario> arrayListUsuarios= iDaoUsuario.verUsuarios();

                    String contactos[]= new String[arrayListUsuarios.size()];
                    contactos[0]="Seleccione";

                    for(int x=0, y=1; x<arrayListUsuarios.size() && y<arrayListUsuarios.size()+1; x++, y++) {
                        if(!arrayListUsuarios.get(x).getEmail().equals(emailFrom)){
                            contactos[y]=arrayListUsuarios.get(x).getNombre();
                        }else{
                            y--;
                        }
                    }
                                                    
                    String contacto = (String) JOptionPane.showInputDialog(null, "Contacto", "Compartir publicacion", 
                            JOptionPane.QUESTION_MESSAGE, null, contactos, contactos[0]);                                   
   
                    if(!contacto.equals("Seleccione")){

                        String emailTo="";

                        for(Usuario usuario : arrayListUsuarios) {
                            if (usuario.getNombre().equals(contacto)) {
                                emailTo= usuario.getEmail();
                            }
                        }
                            
                        if(iDaoInteraccion.crearCompartir(new Compartir(publicaciones[i].getUuid(), emailFrom, emailTo, creado))){                    
                            mostrarPublicaciones(iDaoPublicacion.verPublicaciones());
                            JOptionPane.showMessageDialog(null, "Compartido!", null, JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "Error al compartir", null, JOptionPane.WARNING_MESSAGE);                    
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Seleccione un contacto", null, JOptionPane.WARNING_MESSAGE);                    
                    }
                }else{                    
                    JOptionPane.showMessageDialog(null, "Seleccione un usuario", null, JOptionPane.WARNING_MESSAGE);                    
                }
            }
        }
    }
    
        
    private void publicar(){
        
        String email= getJcbUsuario();
            
        String contenido= jFrameApp.jtaContenidoP.getText();

        long fecha= System.currentTimeMillis();

        Timestamp creado= new Timestamp(fecha);

        String uuid= email+String.valueOf(fecha);          

        Publicacion publicacion= new Publicacion(uuid, email, contenido, creado);

        if(iDaoPublicacion.crearPublicacion(publicacion)){
             JOptionPane.showMessageDialog(null, "Publicacion creada con exito", null, JOptionPane.INFORMATION_MESSAGE);
        }else{
             JOptionPane.showMessageDialog(null, "Error al crear publicacion", null, JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void setJcbUsuario(){
        jFrameApp.jcbUsuario.removeAllItems();
        jFrameApp.jcbUsuario.addItem("Seleccione");
        
        for(Usuario user: iDaoUsuario.verUsuarios()){
            jFrameApp.jcbUsuario.addItem(user.getEmail());
        }

    }
    
    private String getJcbUsuario() {
        return jFrameApp.jcbUsuario.getSelectedItem().toString();
    }
    
    private void limpiar(){
        jFrameApp.jcbUsuario.setSelectedIndex(0);
        jFrameApp.jtaContenidoP.setText(null);
    }

    private void mostrarPublicaciones(ArrayList<Publicacion> verPublicaciones) {
                       
        jFrameMuros= new JFrameMuro[verPublicaciones.size()];
        publicaciones= new Publicacion[verPublicaciones.size()];
        
        jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        
        for(int i=0; i<verPublicaciones.size(); i++) {

            JFrameMuro jFrameMuroPanel =new JFrameMuro();  
            
            jFrameMuroPanel.jbVer.addActionListener(this);
            jFrameMuroPanel.jbMegusta.addActionListener(this);
            jFrameMuroPanel.jbComentar.addActionListener(this);
            jFrameMuroPanel.jbCompartir.addActionListener(this);
            
            jFrameMuroPanel.jlNombre.setText(verPublicaciones.get(i).getEmail());
            jFrameMuroPanel.jtaContenido.setText(verPublicaciones.get(i).getContenido());
            jFrameMuroPanel.jlMegusta.setText(iDaoInteraccion.cantidadMegusta(verPublicaciones.get(i).getUuid()));
            jFrameMuroPanel.jlComentario.setText(iDaoInteraccion.cantidadComentario(verPublicaciones.get(i).getUuid()));
            jFrameMuroPanel.jlCompartir.setText(iDaoInteraccion.cantidadCompartir(verPublicaciones.get(i).getUuid()));

            jFrameMuros[i]=jFrameMuroPanel;
            publicaciones[i]=verPublicaciones.get(i);
            jPanel.add(jFrameMuroPanel.jpMuro);    

        }
        
         jFrameApp.jspMuro.setViewportView(jPanel);

    }
    

}
