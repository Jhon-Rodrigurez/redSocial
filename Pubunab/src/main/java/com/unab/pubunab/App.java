package com.unab.pubunab;

import com.unab.pubunab.controladores.ControladorApp;
import com.unab.pubunab.vistas.JFrameApp;


public class App {
    
    public static void main(String[] args) {
        
        JFrameApp jFrameApp= new JFrameApp();
        
        ControladorApp controladorApp= new ControladorApp(jFrameApp);
        controladorApp.inicio();
        
        jFrameApp.setVisible(true);
    }
}
