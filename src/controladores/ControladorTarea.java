package controladores;

import Dao.DaoTarea;
import Dao.IDaoTarea;
import Modelos.tareaModel;
import javax.swing.table.DefaultTableModel;
import vistas.VerTareas;

public class ControladorTarea{

    static DefaultTableModel modelo;
    static VerTareas verTareas = new VerTareas();

    public boolean crearTarea(int id_persona, String name, String text) {
        int id_usuario = id_persona + 1;
        String nameTarea = name;
        String tarea = text;
        System.out.println(id_usuario + " " + nameTarea + " " + tarea);
        tareaModel tModel = new tareaModel(id_usuario, tarea, nameTarea);
        IDaoTarea iDaoTarea = new DaoTarea();
        return iDaoTarea.createTarea(tModel);
    }

    // Esta función almacena los datos traidos de la db y los muestra en la jTable(table)
   /* public void btn_buscar() {

        IDaoTarea iDaoTarea = new DaoTarea();
               ArrayList<tareaModel> p = iDaoTarea.getTarea();
        modelo = (DefaultTableModel) verTareas.getTable().getModel();

        Object[] cl = new Object[p.size()];

        for (int i = 0; i < 20; i++) {
            cl[0] = p.get(i).getTarea();
            modelo.addRow(cl);
        }
        verTareas.getTable().setModel(modelo);

    }*/
}
