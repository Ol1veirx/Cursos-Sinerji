public class SwitchTest {
    public static void main(String[] args) {
        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei isso");
            case "marrom":
                System.out.println("Sei aquilo");
            case "amarela":
                System.out.println("Sou mais ou menos");
            default:
                System.out.println("Sou iniciante");
        }
    }
}
