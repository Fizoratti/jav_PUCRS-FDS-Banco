import java.util.Scanner;

public class Menu {
    private static Menu INSTANCE = new Menu();

    private Menu() {
        
    }

    public static Menu getInstance() {
        return INSTANCE;
    }

    public void showMenu() {
        System.out.println("--------------------------");
        System.out.println("MENU PRINCIPAL");

        System.out.println("1 - Registrar 1");
        System.out.println("2 - Registrar 2");
        System.out.println("3 - Registrar 3");

        System.out.println("0 - Sair");
        System.out.print("\n$ Digite a opção: ");

        Scanner ler = new Scanner(System.in);
        int opc = ler.nextInt();

        switch(opc) {
            case 1:
                showMenuEmprestimo();
                break;
            case 2:
                showMenuDevolucao();
                break;
            case 3:
                showMenuDoacao();
                break;
            case 0:
                System.out.println("\nVolte logo!");
                break;
            default:
                showMenu();
                break;
        }
    }
}