public class TipoString {
    public static void main(String[] args) {
        String s = "Vasco da Gama";
        System.out.println(s.charAt(3));
        System.out.println(s.startsWith("Vasco"));

        String nome = "Liedson";
        String sobrenome = "Danubio";
        int idade = 21;
        double salario = 12345.89;

        System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
    }
}
