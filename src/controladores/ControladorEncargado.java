package controladores;

import vistas.vistaEncargado;

public class ControladorEncargado {

    static vistaEncargado vEncargado = new vistaEncargado();

    public static void visible(String name) {
        vEncargado.getNameUser().setText(name.toUpperCase());
        vEncargado.setVisible(true);
    }

    public static void hidden() {
        vEncargado.dispose();
    }

    public static void exit() {
        hidden();
        ControladorInit.visible();
    }

}
