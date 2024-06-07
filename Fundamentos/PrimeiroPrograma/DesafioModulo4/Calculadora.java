
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, resultado;
        String operacao;

        System.out.println("Informe o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Informe o segundo numero: ");
        num2 = sc.nextInt();

        System.out.println("Qual operacao deseja realizar? + - * / %");
        operacao = sc.next().trim();

        if(operacao.equalsIgnoreCase("+")) {
            resultado = num1 + num2;
            System.out.println("O resultado da adição foi: " + resultado);
        } else if(operacao.equalsIgnoreCase("-")) {
            resultado = num1 - num2;
            System.out.println("O resultado da subtração foi: " + resultado);
        } else if(operacao.equalsIgnoreCase("*")) {
            resultado = num1 * num2;
            System.out.println("O valor da multiplicação foi: " + resultado);
        } else if(operacao.equalsIgnoreCase("/")) {
            resultado = num1 / num2;
            System.out.println("O valor da divisão é: " + resultado);
        } else if(operacao.equalsIgnoreCase("%")) {
            resultado = num1 % num2;
            System.out.println("O resto é: " + resultado);
        } else {
            System.out.println("Operacao inválida");
        }

        sc.close();

    }
}
