public class CaixaObjetoTest {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3); // double -> Double (autobox)

        // Esse cast é perigoso, pois o tipo retornado e Double
        Integer coisa = (Integer) caixaA.abrir();
        // Vai dar erro
        System.out.println(coisa);

        //Aqui daria porque o retorno é Double devido a conversão, mas na classe ta Object
        Double coisa2 = (Double) caixaA.abrir();
        System.out.println(coisa2);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Olá");

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);

        // Trabalhar dessa forma não é legal, mesmo que ele compile, irá executar de forma errada devido ao cast
        // Se precisamos de uma classe generica utilizamos o Generics
    }
}
