public class Byd extends Carro implements Esportivo {

    public Byd(int velocidadeMaxima) {
        super(velocidadeMaxima);
        velocidadeAtual = 100;
    }
    
    @Override
    int acelerar() {
        int acelera1 = super.acelerar();
        int acelera2 = super.acelerar();
        int acelera3 = super.acelerar();
        int aceleraRapido = acelera1 + acelera2 + acelera3;
        return aceleraRapido;
    }

    @Override
    public void ligarTurbo() {
        velocidadeAtual = 35;
    }

    @Override
    public void desligarTurbo() {
        velocidadeAtual = 15;
    }
}
