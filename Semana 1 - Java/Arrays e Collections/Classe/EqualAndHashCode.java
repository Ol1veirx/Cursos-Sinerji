public class EqualAndHashCode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Liedson";
        u1.email = "liedsonleite3@hotmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Karen";
        u2.email = "karen@hotmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
        System.out.println(u1.equals(u2));
    }
}
