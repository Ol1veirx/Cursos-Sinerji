
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        // Media total incrementada
        // Qtd de notas validas
        // Notas invalidas
        // Sair quando colocar menos 1

        Scanner sc = new Scanner(System.in);

        double totalNotas = 0.0;
        double nota = 0.0;
        int qtdNotasValidas = 0;
        int qtdNotasInvalidas = 0;

        while(nota >= 0.0) {
            System.out.println("Para sair digite -1.");
            System.out.println("Informe um nota entre 0.0 e 10.0: ");
            nota = sc.nextDouble();

            if(nota >= 0.0 && nota <= 10.0) {
                totalNotas+=nota;
                qtdNotasValidas++;
            } else{
                System.out.println("Nota invalida!");
                qtdNotasInvalidas++;
            }
        }

        double media = totalNotas / qtdNotasValidas;

        System.out.println("Media de notas: " + media);
        System.out.println("Qtd. Notas validas: " + qtdNotasValidas);
        System.out.println("Qtd. Notas invalidas: " + qtdNotasInvalidas);
    }
}
