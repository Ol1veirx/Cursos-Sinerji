package model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import exception.ExplosaoException;

// A seguinte classe é responsavel por todo desenho do tabuleiro no console
public class Tabuleiro {
    // Ao instanciar o usuario irá informar qtd de linhas e colunas, além do numero de bombas
    private int qtdLinhas;
    private int qtdColunas;
    private int qtdMinas;

    // Quanto de campos no tabuleiro
    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int qtdLinhas, int qtdColunas, int qtdMinas) {
        this.qtdLinhas = qtdLinhas;
        this.qtdColunas = qtdColunas;
        this.qtdMinas = qtdMinas;

        // Ao instanciar os seguinte metodos serão chamados
        gerarCampos();
        associarOsVizinhos();
        sortearMinas();
    }

    // A depender da escola do usuario, o campo sera aberto de acordo com a linha e coluna informado pelo mesmo
    public void abrirCampo(int linha, int coluna) {
        try {
            // Irá pega a primeira linha e coluna achada, se estiver presente será acionado o metodo abrir caso contrario irá explodir (cai no catch)
            campos.parallelStream()
            .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
            .findFirst()
            .ifPresent(c -> c.abrir());
        } catch (ExplosaoException e) {
            campos.forEach(c -> c.setAberto(true));
            throw e;
        }
    }

    // Metodo responsavel por marcar um possivel campo com a bomba de acordo com as cordenadas passadas no parametro do metodo
    public void marcarCampo(int linha, int coluna) {
        campos.parallelStream()
            .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
            .findFirst()
            .ifPresent(c -> c.alternarMarcacao());
    }

    // Metodo responsavel por gerar o campo de acordo com o numero de linhas e colunas informados no instanciamento da classe
    private void gerarCampos() {
        for (int l = 0; l < qtdLinhas; l++) {
            for(int c = 0; c < qtdColunas; c++){
                campos.add(new Campo(l, c));
            }
        }
    }

    // Relaciona um campo vizinho com o outro
    private void associarOsVizinhos() {
        for(Campo c1 : campos) {
            for(Campo c2 : campos) {
                c1.adicionarVizinho(c2);
            }
        }
    }

    // Ira sortear a quantidade de minas distribuídas baseado na quantidade passada no construtor
    private void sortearMinas() {
        long minasArmadas = 0;
        Predicate<Campo> minado = c -> c.isMinado();

        do {
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
            minasArmadas = campos.stream().filter(minado).count();
        } while (minasArmadas < qtdMinas);
    }

    // Ira retornar um boolean dizendo se foi alcançado ou não quando o metodo for chamado
    public boolean objetivoAlcancado() {
        return campos.stream().allMatch(c -> c.objetivoAlcancado());
    }

    // Reinicia todo o tabuleiro
    public void reiniciar() {
        campos.stream().forEach(c -> c.reiniciar());
        sortearMinas();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        // Adiciona os espaços e também o indice das colunas
        sb.append("  ");
        for (int c = 0; c < qtdColunas; c++) {
            sb.append(" ");
            sb.append(c);
            sb.append(" ");
        }

        sb.append("\n");

        // Adiciona os espaços em branco e o indice das linhas
        int i = 0;
        for(int l =0; l < qtdLinhas; l++) {
            sb.append(l);
            sb.append(" ");
            for (int c = 0; c < qtdColunas; c++) {
                sb.append(" ");
                sb.append(campos.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}
