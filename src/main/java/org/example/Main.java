package org.example;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    private static void registration(){
        System.out.print("Type nickname: ");
        String nickname = in.next();
        System.out.print("Type name: ");
        String name     = in.next();
        System.out.print("Type surname: ");
        String surname  = in.next();
        System.out.print("Type password: ");
        String password = in.next();
        if (Authorization.registration(nickname, password, name, surname))
            System.out.println("Registration successfully");
        else
            System.out.println("Registration denied");
    }
    private static void login(){
        System.out.print("Type nickname: ");
        String nickname = in.next();
        System.out.print("Type password: ");
        String password = in.next();
        if (Authorization.login(nickname, password))
            System.out.printf("Hello %s %s\n", Authorization.data.get(nickname)[0], Authorization.data.get(nickname)[1]);
        else
            System.out.print("Login error");
    }
    public static void main(String[] args) {
        while (true){
            System.out.print("Type command: ");
            String cmd = in.next();

            if (Objects.equals(cmd, "exit"))
                break;

            if (Objects.equals(cmd, "registration"))
                registration();

            if (Objects.equals(cmd, "login"))
                login();
        }
    }
}