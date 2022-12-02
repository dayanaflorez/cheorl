package Dao;

import Conexion.conexionSQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Env.env;
import Modelos.UserModel;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DaoUsuario extends conexionSQL implements IDaoUsuario {

    @Override
    public boolean createUser(UserModel usuario) {
        String sql = "INSERT INTO " + env.T_USER + "("
                + env.NAME_USER + "," + env.EMAIL_USER + "," + env.PASS_USER + "," + env.ID_ROL + ") VALUES (?, ?, ?,?)";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getName_user());
            ps.setString(2, usuario.getEmail_user());
            ps.setString(3, usuario.getPass_user());
            ps.setInt(4, 2);
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
    public boolean Dingreso(UserModel usuario) {
        //query de la db
        String sql = "SELECT *  FROM " + env.T_USER + " WHERE " + env.EMAIL_USER + "='"
                + usuario.getEmail_user()
                + "' and " + env.PASS_USER + "='" + usuario.getPass_user() + "'" + "and " + env.ID_ROL + "='" + usuario.getId_rol() + "'";
        System.err.println(sql);
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                UserModel u = new UserModel();
                u.setName_user(resultSet.getString(env.NAME_USER));
                return true; // en tal caso de que los datos sean correctos retornara un datos boolean
            }
        } catch (SQLException e) {
            System.out.println("Error al leer los datos " + e.getMessage());
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e);
            }
        }
        return false; // si no hay datos correcto retorna un dato boolean 
    }

    @Override
    public ArrayList<UserModel> nameUser(UserModel usuario) {
        ArrayList<UserModel> arrayListDat = new ArrayList<>();
        String sql = "SELECT *  FROM " + env.T_USER + " WHERE " + env.EMAIL_USER + "='"
                + usuario.getEmail_user()
                + "' and " + env.PASS_USER + "='" + usuario.getPass_user() + "'" + "and " + env.ID_ROL + "='" + usuario.getId_rol() + "'";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                UserModel u = new UserModel();
                u.setName_user(resultSet.getString(env.NAME_USER));
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
    
    @Override
    public ArrayList<UserModel> getUser(){
        ArrayList<UserModel> arrayListDat = new ArrayList<>();
        String sql = "SELECT *  FROM " + env.T_USER + " WHERE " + env.ID_ROL + "='2'";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next()) {
                UserModel u = new UserModel();
                u.setName_user(resultSet.getString(env.NAME_USER));
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
