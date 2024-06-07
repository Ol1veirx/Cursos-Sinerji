import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int num = sc.nextInt();

        boolean entreZeroEDez = num >= 0 && num <= 10;
        Boolean ehPar = num % 2 == 0;


        if(entreZeroEDez &&  ehPar) {
            System.out.println("O numero é par e esta entre 0 e 10");
        } else if(!entreZeroEDez && ehPar) {
            System.out.println("O numero é par, mas não esta entre 0 e 10");
        } else if(entreZeroEDez && !ehPar) {
            System.out.println("Esta entre 0 e 10, mas não é par");
        } else {
            System.out.println("Não esta entre 0 e 10 e nem é par");
        }

    }
}
