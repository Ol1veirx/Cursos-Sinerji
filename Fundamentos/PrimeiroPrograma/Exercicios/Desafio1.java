
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String valor1, valor2, valor3;

        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextLine().replace(",", ".");
        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextLine().replace(",", ".");
        System.out.println("Digite o terceiro valor: ");
        valor3 = sc.nextLine().replace(",", ".");

        double v1 = Double.parseDouble(valor1);
        double v2 = Double.parseDouble(valor2);
        double v3 = Double.parseDouble(valor3);
        double media = (v1 + v2 +v3) / 3;

        System.out.println(media);
    }
}
