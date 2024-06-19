public class Logico {
    public static void main(String[] args) {
        // Trabalho na terça(V OU F)

        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;
        boolean tomarSorvete, comprarTv32, comprarTv50, ficarEmCasa;

        if(trabalhoQuinta && trabalhoTerca) {
            tomarSorvete = true;
            comprarTv50 = true;
            comprarTv32 = false;
            ficarEmCasa = false;
            System.out.println("Tomar sorvete e compra tv de 50");
        } else if(trabalhoQuinta || trabalhoTerca) {
            tomarSorvete = true;
            comprarTv32 = true;
            comprarTv50 = false;
            ficarEmCasa = false;
            System.out.println("tomar sorvete e compra tv de 32");
        } else {
            tomarSorvete = false;
            comprarTv32 = false;
            comprarTv50 = false;
            ficarEmCasa = true;
            System.out.println("ficar em casa: " + ficarEmCasa);
        }

    }
}
