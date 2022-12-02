package Modelos;

public class tareaModel {

    private int id_tarea;
    private int id_usuario;
    private String tarea, name_tarea;

    public tareaModel() {
    }

    public tareaModel(int id_usuario, String tarea, String name_tarea) {
        this.id_usuario = id_usuario;
        this.tarea = tarea;
        this.name_tarea = name_tarea;
    }

    public tareaModel(int id_tarea, int id_usuario, String tarea, String name_tarea) {
        this.id_tarea = id_tarea;
        this.id_usuario = id_usuario;
        this.tarea = tarea;
        this.name_tarea = name_tarea;
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getName_tarea() {
        return name_tarea;
    }

    public void setName_tarea(String name_tarea) {
        this.name_tarea = name_tarea;
    }

}
