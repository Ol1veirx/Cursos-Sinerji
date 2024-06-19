

public class Baskhara {
    public static void main(String[] args) {        
        int a = 1;
        int b = 12;
        int c = -13;

        double delta = Math.pow(b, 2) - 4.*a*c / 2*a;
        double x1 = -b + Math.sqrt(delta) / 2 * a;
        double x2 = -b - Math.sqrt(delta) / 2 * a;

        System.out.println("Delta: " + delta);
        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
    }
}
