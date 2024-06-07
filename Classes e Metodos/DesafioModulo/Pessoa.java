public class Pessoa {
    String nome;
    double peso;

    public Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida) {
        if(comida == null) {
            return;
        }
       this.peso += comida.peso;
    }
}
