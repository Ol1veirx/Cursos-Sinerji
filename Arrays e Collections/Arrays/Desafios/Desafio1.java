
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Voce quer informar quantas notas? ");
        int qtdNotas = sc.nextInt();

        double[] notasAluno = new double[qtdNotas];
        
        for(int i = 0; i < notasAluno.length; i++) {
            System.out.printf("Nota %d: ", i + 1);
            double nota = sc.nextDouble();
            notasAluno[i] = nota;
        }

        double somaDasNotas = 0;
        for (double nota : notasAluno){
            somaDasNotas += nota;
        }
        
        double media = somaDasNotas / notasAluno.length;

        System.out.printf("A media do aluno é: %.2f", media);

    }
}
