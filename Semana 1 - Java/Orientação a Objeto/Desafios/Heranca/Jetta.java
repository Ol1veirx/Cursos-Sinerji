public class Jetta extends Carro {

    public Jetta(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }
    
    @Override
    int acelerar() {
        int acelera1 = super.acelerar();
        int acelera2 = super.acelerar();
        int aceleraRapido = acelera1 + acelera2;
        return aceleraRapido;
    }
}
