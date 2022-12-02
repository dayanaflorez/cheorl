package Dao;

import Conexion.conexionSQL;
import Env.env;
import Modelos.tareaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoTarea extends conexionSQL implements IDaoTarea {

    @Override
    public boolean createTarea(tareaModel tarea) {
        String sql = "INSERT INTO " + env.T_TAREA + "("
                + env.ID_USER + "," + env.NAME_TAREA + "," + env.TAREA + ") VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, tarea.getId_usuario());
            ps.setString(2, tarea.getName_tarea());
            ps.setString(3, tarea.getTarea());
            ps.executeUpdate();
            System.out.println("Creado con exito");
            return true;
        } catch (SQLException e) {
            System.out.println("Error al crear " + e.getMessage());
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public ArrayList<tareaModel> getTarea() {
        ArrayList<tareaModel> arrayListDat = new ArrayList<>();
        String sql = "SELECT *  FROM " + env.T_TAREA +" where id_user=2";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                tareaModel u = new tareaModel();
                u.setName_tarea(resultSet.getString(env.NAME_TAREA));
                u.setTarea(resultSet.getString(env.TAREA));
                arrayListDat.add(u);
            }
            return arrayListDat;
        } catch (SQLException e) {
            System.out.println("Error al leer los datos " + e.getMessage());
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e);
            }
        }
        return arrayListDat; // si no hay datos correcto retorna un dato boolean 
    }
}
