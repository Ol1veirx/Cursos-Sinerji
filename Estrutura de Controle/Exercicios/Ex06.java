
import java.util.Random;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100);
        int tentativas = 0;
        int numeroDoJogador = 0;

        while(tentativas <= 10){
            System.out.println("Advinhe o numero: ");
            numeroDoJogador = sc.nextInt();
            tentativas++;
            System.out.println("------------------------------");
            if(numeroAleatorio == numeroDoJogador) {
                System.out.println("Acertou!!!");
                break;
            }
        }

        System.out.println("Fim");
        System.out.printf("Numero da maquina %d e o seu %d", numeroAleatorio, numeroDoJogador);

        sc.close();
    }

}
