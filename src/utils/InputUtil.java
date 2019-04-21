/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author vmascareno
 */
public class InputUtil {

    public static boolean isEmailValid(String email) {
        Pattern pat = Pattern.compile("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@"
                + "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$");
        Matcher mat = pat.matcher(email);
        return mat.find();
    }

    public static boolean isPhoneValid(String phone) {
        return phone.length() == 10;
    }
}
