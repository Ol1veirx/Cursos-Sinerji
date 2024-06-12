package view;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import exception.ExplosaoException;
import exception.SairException;
import model.Tabuleiro;

// A seguinte classe é responsavel por fazer toda parte interativa, toda parte grafica do projeto no console
// Desse modo evita um carga grande na classe main do projeto
public class TabuleiroConsole {
    
    private Tabuleiro tabuleiro;
    private Scanner sc = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;

        executarJogo();
    }

    // Metodo que executa o jogo reiniciando o mesmo ou finalizando a depende da resposta do usuário
    private void executarJogo() {
        try {
            boolean continuar = true;
            while (continuar) { 
                cicloDoJogo();
                System.out.println("Outra partida? (S/n) ");
                String resposta = sc.nextLine();

                if("n".equalsIgnoreCase(resposta)) {
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }
        } catch (SairException e) {
            System.out.println("Tchau!!!");
        } finally {
            sc.close();
        }
    }

    // Esse metodo apresenta todo o ciclo logico do jogo onde:
    private void cicloDoJogo() {
        try {

            while (!tabuleiro.objetivoAlcancado()) { 
                // 1° Imprime o tabuleiro
                System.out.println(tabuleiro);

                // Armazena os valores da linha e da coluna
                String digitado = capturarValorDigitado("Digite (x, y): ");

                // Trata do tipo String para int
                Iterator<Integer> xy = Arrays.stream(digitado.split(","))
                    .map(e -> Integer.parseInt(e.trim())).iterator();
                
                digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");

                // Verifica se quer abrir o determinado campo ou (Des)Marcar de acordo com as cordenas passas anteriormente
                if("1".equals(digitado)) {
                    tabuleiro.abrirCampo(xy.next(), xy.next());
                } else if("2".equals(digitado)) {
                    tabuleiro.marcarCampo(xy.next(), xy.next());
                }
            }

            // Imprime novamente o tabulerio com as alterações após sair do while, caso não caia no Catch o User ganhou
            System.out.println(tabuleiro);
            System.out.println("Voce ganhou");
        } catch (ExplosaoException e) {
            // Caindo no Catch mostra o tabuleiro final e exibe a mensagem de perdeu
            System.out.println(tabuleiro);
            System.out.println("Voce perdeu!");
        }
    }   

    // Metodo resposnavel por capturar o valor digitado pelo usuario durante a interação no console
    private String capturarValorDigitado(String texto) {
        // Exibe o texto que foi mandando no parametro e captura o valor após digitar no console
        System.out.print(texto);
        String digitado = sc.nextLine();

        // Se digitar "sair" lança a exceção de Sair do jogo caso contrario retorna o valor capturado
        if("sair".equalsIgnoreCase(digitado)) {
            throw new SairException();
        }

        return digitado;
    } 
}
