
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int num = sc.nextInt();

        boolean restoPorUm = false;

        for(int i = 2; i <= Math.sqrt(num);i++) {
            if(num % i == 0) {
                restoPorUm = false;
            }
            restoPorUm = true;
        }

        String ehPrimoString = Boolean.toString(restoPorUm);

       

        switch (ehPrimoString) {
            case "true" -> System.out.println("O numero eh primo");
            default -> System.out.println("NAO eh primo");
        }
    }
}
