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

    public void printCliente() {
        System.out.println(nome + ", " + idade);
    }

    public static void printClientes(List<Pessoa> lista, Predicate<Cliente> tester) {
        for (Cliente c : lista) {
            if (tester.test(p)) {
                c.printCliente();
            }
        }
    }
}