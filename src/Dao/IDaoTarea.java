package Dao;

import Modelos.tareaModel;
import java.util.ArrayList;

public interface IDaoTarea {

    public boolean createTarea(tareaModel tarea);

    ArrayList<tareaModel> getTarea();
}
