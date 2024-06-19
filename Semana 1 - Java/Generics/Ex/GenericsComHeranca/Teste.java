

public class Teste {
    public static void main(String[] args) {
        // A gente pode tornar uma classe que herda da outra generica também e passar para a classe que foi herdada essa responsabilidade de verificar o tipo que foi criado;
        // Da mesma forma que a gente pode, ao herdar a classe generica, passar nela o tipo que a classe que herdou sera instanciada;

        // No exemplo abaixo ficou definido que será Integer;
        // Na verdade o tipo foi definido lá na classe, logo quando instanciada, por padrão precisa ser do tipo int;
        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(10);
        int coisaA = caixaA.abrir();
        System.out.println(coisaA);

        // Nesse exemplo abaixo colocamos um restrição
        // Restrição essa que so aceita atributos do tipo Number(int e double)
        CaixaNumero<Double> caixaB = new CaixaNumero();
        caixaB.guardar(2.90);
        System.out.println(caixaB.abrir());

        CaixaNumero<Integer> caixaC = new CaixaNumero();
        caixaC.guardar(10);
        System.out.println(caixaC.abrir());
    }
}
