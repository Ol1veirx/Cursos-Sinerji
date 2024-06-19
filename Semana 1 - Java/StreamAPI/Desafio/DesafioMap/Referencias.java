
import java.util.function.Function;

public class Referencias {
    public final static Function<Integer, String> paraBinario = n -> Integer.toBinaryString(n) + " ";

    public final static Function<String, String> inverterValor = v -> new StringBuilder(v).reverse().toString() + " ";

    public final static Function<String, Integer> paraInteiro = valor -> Integer.parseInt(valor.trim(), 2);
}
