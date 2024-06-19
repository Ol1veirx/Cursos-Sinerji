import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> ehParOuImpar = 
            numero -> numero % 2 == 0 ? "Par" : "Impar";
        
            
            Function<String, String> oResultadoE = 
            valor -> "O resultado é: " + valor;
            
            Function<String, String> empolgado = valor -> valor + "!!!";

            Function<String, String> duvida = valor -> valor + "???";
            
            String resultadoFinal = ehParOuImpar
            .andThen(oResultadoE)
            .andThen(duvida)
            .apply(32);
            
            System.out.println(resultadoFinal);
            System.out.println(ehParOuImpar.apply(3));
    }
}
