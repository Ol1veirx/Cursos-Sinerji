import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu peso[kg]: ");
        double peso = sc.nextDouble();
        System.out.println("Informe sua altura[m]: ");
        double altura = sc.nextDouble();

        double imc = peso/(Math.pow(altura, 2));

        System.out.println("Seu imc é de: " + imc);

        sc.close();
    }
}
