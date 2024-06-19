
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = sc.nextInt();

        boolean ehPrimo = numero % 1 == 0 && numero % numero == 0; 

        if(ehPrimo) {
            System.out.printf("O numero %d eh primo", numero);
        } else {
            System.out.printf("O numero %d NAO eh primo", numero);
        }

        sc.close();
    }
}
