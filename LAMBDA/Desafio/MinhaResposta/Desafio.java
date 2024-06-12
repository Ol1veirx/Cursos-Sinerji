import java.util.function.Function;

public class Desafio {
    public static void main(String[] args) {

        Produto p1 = new Produto("IPhone", 5499.99, 0.15);

        //Preço Final
        Function<Produto, Double> precoReal = p -> Math.round(p.preco * (1 - p.desconto) * 100.0) / 100.0;
        double precoFinal = precoReal.apply(p1);
        System.out.printf("Preco final: R$%.2f\n", precoFinal);

        //Verifica o Imposto
        Function<Double, Double> temImposto = preco -> {
            boolean ehMaior = preco >= 2500.00;
            return Math.round((ehMaior ? preco + (preco * 0.085) : preco) * 100.0) / 100.0 ;
        };
        double precoComImposto = temImposto.apply(precoFinal);
        System.out.printf("Após verificação do imposto o valor ficou: R$%.2f\n", precoComImposto);

        // Valor do frete
        System.out.println("Quer saber o valor do seu frete? vamos conferir...");
        Function<Double, Double> valorFrete = valor -> Math.round((valor >= 3000 ? valor + 100 : valor + 50) * 100.0) / 100.0;
        double valorFinal = valorFrete.apply(precoComImposto);
        System.out.printf("O valor final é: R$%.2f", valorFinal);

    }
}
