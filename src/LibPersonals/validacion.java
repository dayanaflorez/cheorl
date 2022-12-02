package LibPersonals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validacion {

    public boolean validacionEmail(String email) {
        Pattern pattern = Pattern.compile("^[A-Za-z]+(\\_[A-Za-z]+)+(\\_[A-Za-z]+)*@fesc.edu.co$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }

    public boolean validacionName(String name) {
        Pattern pattern = Pattern.compile("^[A-Za-z]");
        Matcher mather = pattern.matcher(name);
        return mather.find();
    }
}
