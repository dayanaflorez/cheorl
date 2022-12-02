package Dao;

import Modelos.UserModel;
import java.util.ArrayList;

public interface IDaoUsuario {

    public boolean createUser(UserModel usuario);

    public boolean Dingreso(UserModel usuario);

    public ArrayList<UserModel> nameUser(UserModel usuario);

    public ArrayList<UserModel> getUser();
}
