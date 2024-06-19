
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos aluno? ");
        int qtdAluno = sc.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdNotas = sc.nextInt();

        double[][] notasDaTurma = new double[qtdAluno][qtdNotas];

        double tot = 0;
        for(int a = 0; a < notasDaTurma.length; a++) {
            for(int n = 0; n < notasDaTurma[a].length; n++){
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = sc.nextDouble();
                tot += notasDaTurma[a][n];
            }

            double media = tot / (qtdAluno * qtdNotas);
            System.out.println("Media da turma é: " + media);
        }
    }
}
