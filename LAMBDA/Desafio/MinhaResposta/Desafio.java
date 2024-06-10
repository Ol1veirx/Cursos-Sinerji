import java.util.function.Function;

public class Desafio {
    public static void main(String[] args) {

        Produto p1 = new Produto("IPhone", 5499.99, 0.15);

        //Preço Final
        Function<Produto, Double> precoReal = p -> p.preco * (1 - p.desconto);
        System.out.println("Preco final: R$" + precoReal.apply(p1));

        //Verifica o Imposto
        Function<Double, Double> temImposto = preco -> {
            boolean ehMaior = preco >= 2500.00;
            return ehMaior == true ? preco + (preco * 0.085) : preco;
        };
        System.out.printf("Após verificação do imposto o valor ficou: R$%.2f\n", temImposto.apply(precoReal.apply(p1)));

        // Valor do frete
        System.out.println("Quer saber o valor do seu frete? vamos conferir...");
        Function<Double, Double> valorFrete = valor -> {
            double precoFrete = valor >= 3000 ? valor + 100 : valor + 50;
            return precoFrete;
        }; 
        double valor = valorFrete.apply(temImposto.apply(precoReal.apply(p1)));
        System.out.printf("O valor final é: R$%.2f", valor);

    }
}
