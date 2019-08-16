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

        System.out.println("1 - Sou Cliente");
        System.out.println("2 - Sou Caixa");

        System.out.println("0 - Sair");
        System.out.print("\n$ Digite a opção: ");

        Scanner ler = new Scanner(System.in);
        int opc = ler.nextInt();

        switch(opc) {
            case 1:
                showMenuCliente();
                break;
            case 2:
                // showMenuCaixa();
                break;
            case 0:
                System.out.println("\nVolte logo!");
                break;
            default:
                showMenu();
                break;
        }
    }

    public void showMenuCliente() {
        System.out.println("--------------------------");
        System.out.println("MENU CLIENTE");

        System.out.println("Digite seu nome:");
        Scanner ler = new Scanner(System.in);
        String nome = ler.next();

        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();

        Cliente cliente = new Cliente(nome, idade);

        System.out.println("--------------------------");
        System.out.println("MENU CLIENTE\n");
        System.out.println(cliente.toString() + "\n");
        System.out.println("1 - Sim");
        System.out.println("0 - Não");
        System.out.print("$ Confirma os dados?: ");
        int opc = ler.nextInt();

        switch(opc) {
            case 1:
                Database.getInstance().saveFila(cliente);
                int pos = Database.getInstance().getFila().size();
                System.out.println("\nVocê está na posição " + pos + " da fila!\n");
                // Wait 2 seconds;
                try{ 
                    Thread.sleep(2000); 
                } catch(Exception e) {
                    Thread.currentThread().interrupt();
                }
            case 0:
                showMenu();
                break;
            default:
                showMenuCliente();
                break;
        }
    }
}