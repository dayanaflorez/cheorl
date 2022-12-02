package controladores;

import vistas.vistaUsuarios;

public class ControladorUsuario {

    static vistaUsuarios vUsuarios = new vistaUsuarios();

    public static void visible(String name) {
       vUsuarios.getNameUser().setText(name.toUpperCase());
        vUsuarios.setVisible(true);
    }
    
    public static void hidden(){
        vUsuarios.dispose();
    }
    
    public static void exit(){
        hidden();
        ControladorInit.visible();
    }
}
