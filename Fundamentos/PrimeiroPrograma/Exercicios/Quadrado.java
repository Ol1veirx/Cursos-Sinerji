import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inform um valor: ");
        int valor = sc.nextInt();

        int quadrado = (int) Math.pow(valor, 2);
        int cubo = (int) Math.pow(valor, 3);

        System.out.println("O quadrado é: " + quadrado);
        System.out.println("O cubo é: " + cubo);

        sc.close();
    }
}
