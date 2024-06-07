
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contValor = 1;
        List<Integer> valores = new ArrayList<>();

        while(contValor <= 10) {
            System.out.println("Informe um valor: ");
            int valor = sc.nextInt();
            valores.add(valor);
            contValor++;
        }

        int maiorValor = valores.get(0);

        for(int i = 1; i < valores.size(); i++) {
            if(valores.get(i) > maiorValor) {
                maiorValor = valores.get(i);
            }
        }

        System.out.println("O maior valor é: " + maiorValor);

    }
}
