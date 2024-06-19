public class Carro {
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    int acelerar() {
        if(velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            return velocidadeAtual += 5;
        }
        return 0;
    }

    int frear() {
        if(velocidadeAtual <= 0){
            return velocidadeAtual = 0;
        } else {
            return velocidadeAtual -= 5;
        }
    }
}
