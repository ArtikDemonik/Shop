package org.example;
import java.util.*;

public class Authorization {
    public static Hashtable<String, String[]> data = new Hashtable<>();
    public static boolean registration(String nickname, String password, String name, String surname){
        if (!nickname_used(nickname)){
            String[] temp_data = {name, surname, password};
            data.put(nickname, temp_data);
            return true;
        }
        return false;
    }
    public static boolean login(String nickname, String password){
        if (nickname_used(nickname)){
            return Objects.equals(data.get(nickname)[2], password);
        }
        return false;
    }
    private static boolean nickname_used(String login){
        return data.containsKey(login);
    }
}
