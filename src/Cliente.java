import java.util.function.Predicate;
import java.util.List;

public class Cliente {

    public String nome;
    public int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void printCliente() {
        System.out.println(nome + ", " + idade);
    }

    public static void printClientes(List<Cliente> lista, Predicate<Cliente> tester) {
        for (Cliente c : lista) {
            if (tester.test(c)) {
                c.printCliente();
            }
        }
    }
}