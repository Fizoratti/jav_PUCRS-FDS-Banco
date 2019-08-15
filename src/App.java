import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String args[]) {
        System.out.print("Bem-vindo ao Banco!\n");

        Database.start();

        Menu.getInstance().showMenu();

    }
}