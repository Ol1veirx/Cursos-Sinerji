
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 +  nota2) / 2;

        if(media > 7.0) {
            System.out.println("Aprovado");
        } else if(media < 7.0 && media >= 4.0) {
            System.out.println("Recueperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
