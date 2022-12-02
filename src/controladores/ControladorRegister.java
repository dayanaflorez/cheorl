package controladores;

import Dao.DaoUsuario;
import Dao.IDaoUsuario;
import LibPersonals.encoder;
import LibPersonals.validacion;
import Modelos.UserModel;
import javax.swing.JOptionPane;
import vistas.VistaRegistro;

public class ControladorRegister {

    static validacion eval = new validacion();
    static encoder mEnconder = new encoder();
    static VistaRegistro v = new VistaRegistro();

    public static void visible() {
        clear();
        v.setVisible(true);
    }

    public static void hidden() {
        v.dispose();
    }

    public static void btnBack() {
        hidden();
        ControladorInit.visible();
    }

    public static void btnRegister() {
        String usuario = v.getGetNombre().getText().toLowerCase();
        String email = v.getGetCorreo().getText().toLowerCase();
        String pass = mEnconder.ecnode(v.getGetPasswordOne().getText());

        if (usuario.equals("") || email.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(v, "Rellene los campos");
        } else {
            if (eval.validacionEmail(email) && eval.validacionName(usuario)) {
                IDaoUsuario iDaoUsuario = new DaoUsuario();
                UserModel u = new UserModel(usuario, email, pass, 0);
                if (iDaoUsuario.createUser(u)) {
                    JOptionPane.showMessageDialog(v, "Registrado");
                    clear();
                }
            } else {
                JOptionPane.showMessageDialog(v, "correo invalido o nombre invalido");
            }
        }
    }

    public static void clear() {
        v.getGetCorreo().setText("");
        v.getGetNombre().setText("");
        v.getGetPasswordOne().setText("");
    }

}
