
import java.util.HashSet;

public class TipoSet {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Liedson");
        conjunto.add(1);
        conjunto.add("X");

        System.out.println(conjunto.size());
        System.out.println(conjunto.contains("Liedson"));
        System.out.println(conjunto.isEmpty());
        System.out.println(conjunto.hashCode());
    }
}
