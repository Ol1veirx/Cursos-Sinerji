
import java.util.Scanner;

public class whileExe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean condicao = true;

        while (condicao) {
            System.out.println("Digite algo:");
            String valor = sc.next();
            System.out.println("Deseja continuar?[S/N] ");
            String simOuNao = sc.next();

            if(simOuNao.equalsIgnoreCase("S")) {
                condicao = true;
            } else {
                condicao = false;
            }
        }

        System.out.println("Fim");

        sc.close();
    }
}
