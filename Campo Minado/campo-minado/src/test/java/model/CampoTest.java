package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Model.Campo;
import exception.ExplosaoException;


public class CampoTest {
    public Campo campo = new Campo(3, 3);;

    @Test
    void testVizinhoRealDistanciaEsquerda(){
        Campo vizinho = new Campo(3, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testVizinhoRealDistanciaDireita(){
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testVizinhoRealDistanciaEmCima(){
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testVizinhoRealDistanciaEmbaixo(){
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertTrue(resultado);
    }

    @Test
    void testNaoVizinho(){
        Campo vizinho = new Campo(1, 1);
        boolean resultado = campo.adicionarVizinho(vizinho);

        assertFalse(resultado);
    }

    @Test
    void testeValorPadraoAtributoMarcado(){
        assertFalse(campo.isMarcado());
    }

    @Test
    void testeAlternaMarcacao(){
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }

    @Test
    void testeAlternaMarcacaoDuasChamadas(){
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }

    @Test
    void testeAbrirNaoMinadoNaoMarcado(){
        assertTrue(campo.abrir());
    }

    @Test
    void testeAbrirNaoMinadoMarcado(){
        campo.alternarMarcacao();
        assertFalse(campo.abrir());
    }

    @Test
    void testeMinadoMarcado(){
        campo.alternarMarcacao();
        campo.minar();
        assertFalse(campo.abrir());
    }
    
    @Test
    void testeAbrirMinadoNaoMarcado(){
        campo.minar();

        assertThrows(ExplosaoException.class, () -> {
            campo.abrir();
        });
    }

    @Test
    void testeAbrirComVizinhos1(){
        Campo v1 = new Campo(2, 2);
        Campo vizinhoDoVizinho1 = new Campo(1, 1);

        v1.adicionarVizinho(vizinhoDoVizinho1);

        campo.adicionarVizinho(v1);
        campo.abrir();

        assertTrue(vizinhoDoVizinho1.isAberto() && v1.isAberto());
    }

    @Test
    void testeAbrirComVizinhos2(){
        Campo v1 = new Campo(2, 2);
        Campo v2 = new Campo(1, 1);
        v2.minar();

        Campo vizinhoDoVizinho1 = new Campo(1, 1);
        vizinhoDoVizinho1.adicionarVizinho(v1);
        vizinhoDoVizinho1.adicionarVizinho(v2);

        campo.adicionarVizinho(v1);
        campo.abrir();

        assertTrue(vizinhoDoVizinho1.isAberto() && v1.isFechado());
    }
}
