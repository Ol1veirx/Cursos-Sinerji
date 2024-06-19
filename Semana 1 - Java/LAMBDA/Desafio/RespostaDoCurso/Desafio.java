
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3235.89, 0.50);

        Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);

        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;

        UnaryOperator<Double> arrendondar = preco -> Math.round(preco * 100.0) / 100.0;

        Function<Double, String> formatar = preco -> String.format("R$%.2f", preco);
        
        String preco = precoFinal
            .andThen(impostoMunicipal)
            .andThen(frete)
            .andThen(arrendondar)
            .andThen(formatar)
            .apply(p1);
        System.out.println("O preco final é: " + preco);
    }
}
