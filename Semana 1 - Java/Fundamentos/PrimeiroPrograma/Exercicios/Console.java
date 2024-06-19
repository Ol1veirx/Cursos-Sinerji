
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        String cidade;

        System.out.print("Nome:");
        nome = sc.nextLine();
        System.out.print("Idade: ");
        idade = sc.nextInt();
        System.out.print("Cidade: ");
        cidade = sc.next();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);

        sc.close();
    }
}
