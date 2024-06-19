
import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 10.0;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double totA = 0;
        for(int i = 0; i < notasAlunoA.length; i++) {
            totA += notasAlunoA[i];
        }

        System.out.println(totA);

        double[] notasAlunoB = {3.4, 4.5, 5.6, 9.1};

        double totB = 0;
        for(int i = 0; i < notasAlunoB.length; i++) {
            totB += notasAlunoB[i];
        }

        System.out.println(totB / notasAlunoB.length);
    }
}
