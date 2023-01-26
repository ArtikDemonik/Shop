package org.example;

import java.util.Scanner;

public class auth {
    public static void base() {
        System.out.println("signin");
        Scanner in = new Scanner(System.in);
        System.out.print("Type command: ");
        String com = in.nextLine();
        switch (com) {
            case "login" -> auth.sign_in();
            case "register" -> auth.sign_up();
        }
    }

    public static void sign_in(){  //войти
        System.out.println("in");

    }
    public static void sign_up(){  // зарегистрироваться
        System.out.println("up");
    }
}
