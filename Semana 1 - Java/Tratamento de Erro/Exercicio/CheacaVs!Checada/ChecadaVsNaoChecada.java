public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        try {
            geraError2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal! #1");
    }

    static void geraError2() throws Exception {
        throw new Exception("Ocorreu um erro bem legal! #2");
    }
}
