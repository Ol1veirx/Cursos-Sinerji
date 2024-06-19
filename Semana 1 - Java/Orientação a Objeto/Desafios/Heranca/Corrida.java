public class Corrida {
    public static void main(String[] args) {

        Carro carro1 = new Carro(140);
        carro1.velocidadeAtual = 30;
        System.out.println(carro1.velocidadeAtual);
        carro1.acelerar();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        System.out.println(carro1.velocidadeAtual);

        System.out.println();

        Byd seals = new Byd(199);
        seals.velocidadeAtual = 20;
        System.out.println(seals.velocidadeAtual);
        seals.acelerar();
        seals.ligarTurbo();
        System.out.println(seals.velocidadeAtual);

        System.out.println();

        Jetta jetta = new Jetta(180);
        jetta.velocidadeAtual = 20;
        System.out.println(jetta.velocidadeAtual);
        jetta.acelerar();
        System.out.println(jetta.velocidadeAtual);
    }
}
