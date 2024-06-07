public class Desafio2 {
    public static void main(String[] args) {
        int conta1 = 6 * (3 + 2);
        int formula1 = (int) Math.pow(conta1, 2) / (3 * 2);

        int conta2 = (1 - 5) * (2 - 7) / 2;
        int formula2 = (int) Math.pow(conta2, 2);

        int conta3 = formula1 - formula2;
        int formula3 = (int) Math.pow(conta3, 3);

        int conta4 = (int) Math.pow(10, 3);

        int contaFinal = formula3 / conta4;


        System.out.println(contaFinal);
    }
}
