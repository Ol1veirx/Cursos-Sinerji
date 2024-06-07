import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // Por se tratar de um exercicio de estrutura de controle decidi fazer varios ifs e else aninhados mesmo não sendo uma boa prática. 

        Scanner sc = new Scanner(System.in);

        int anoInformado = 0;

        System.out.println("Informe um ano: ");
        anoInformado = sc.nextInt();

        if(anoInformado % 4 == 0) {
            if(anoInformado % 100 == 0) {
                if(anoInformado % 400 == 0){
                    System.out.printf("%d é Bissexto", anoInformado);
                } else {
                    System.out.println("Não é bissexto");
                }
            } else{
                System.out.println("Não é bissexto");
            }
        } else{
            System.out.println("Não é bissexto");
        }

        sc.close();

    }
}
