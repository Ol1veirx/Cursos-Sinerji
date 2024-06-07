public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro(10, 10);
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);
        heroi.x = 10;
        heroi.y = 11;

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);
    }
}
