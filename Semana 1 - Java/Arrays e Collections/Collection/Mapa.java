
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();
        
        users.put(12345, "Liedson");
        users.put(12, "Ana");

        System.out.println(users.entrySet());
    }
}
