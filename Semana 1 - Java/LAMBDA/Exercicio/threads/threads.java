public class threads {
    public static void main(String[] args) {
        Runnable t1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Trabalho 1: " + i);
                }
            }
        };

        Runnable t2 = () -> {
            for (int i = 0; i < 10; i++) {
                    System.out.println("Trabalho 2: " + i);
            }
        };
        
        Thread tr1 = new Thread(t1);
        Thread tr2 = new Thread(t2);

        tr1.start();
        tr2.start();
    }
}
