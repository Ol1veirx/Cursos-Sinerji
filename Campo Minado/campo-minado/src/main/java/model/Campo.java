package model;

import java.util.ArrayList;
import java.util.List;

import exception.ExplosaoException;

// Classe responsavel por cada campo no tabuleiro
public class Campo {
    // Posicao de um determinado campo em um tabuleiro
    private final int linha;
    private final int coluna;

    // Informa se esta aberto, minado e marcado
    private boolean aberto;
    private boolean minado;
    private boolean marcado;

    private List<Campo> vizinhos = new ArrayList<>();

    public Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getLinha(){
        return linha;
    }

    public int getColuna(){
        return coluna;
    }

    public boolean isMarcado(){
        return marcado;
    }

    void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

     public boolean isAberto(){
        return aberto;
    }

    public boolean isFechado() {
        return !isAberto();
    }

    public boolean isMinado() {
        return minado;
    }

    // Adiciona a um campo o seu vizinho
    public boolean adicionarVizinho(Campo vizinho) {
        boolean linhaDiferente = linha != vizinho.linha;
        boolean colunaDiferente = coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaColuna + deltaLinha;

        if(deltaGeral == 1 && !diagonal){
            vizinhos.add(vizinho);
            return true;
        } else if(deltaGeral == 2 && diagonal){
            vizinhos.add(vizinho);
            return true;
        } else {
            return false;
        }
    }

    // Alterna o valor booleano dizendo se o campo esta marcado ou nao
    public void alternarMarcacao() {
        if(!aberto){
            marcado = !marcado;
        }
    }

    // Metodo responsavel por abrir um determinado campo
    boolean abrir() {

        if(!aberto && !marcado) {
            aberto = true;

            // Se na abertura o campo estiver minado lancara a exceção de explosao
            if(minado) {
                throw new ExplosaoException();
            }

            if(vizinhacaSegura()) {
                vizinhos.forEach(v -> v.abrir());
            }

            return true;
        } else {
            return false;
        }
    }

    // Verifica se os viznhos daquele campo sao seguros
    boolean vizinhacaSegura() {
        return vizinhos.stream().noneMatch(v -> v.minado);
    }

    // Ao ser chamado um determinado campo é minado
    public void minar() {
        minado = true;
    }

    // retornar o objetivo alcançado de acordo com as condições passadas
    public boolean objetivoAlcancado() {
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return desvendado || protegido;
    }

    // Verifica as minhas na vizinhanca 
    public long minasNaVizinhanca() {
        return vizinhos.stream().filter(v -> v.minado). count();
    }

    // Reinicia o campo
    public void reiniciar() {
        aberto = false;
        minado = false;
        marcado = false;
    }

    //Exibe os caracteres para cada caso
    @Override
    public String toString(){
        // Se estiver marcado exibe o "X"
        // Se for aberto e minado exibe o "*"
        // Se abrir e houver minhas na vizinhança ira informar quantas minhas podem ter do ao redor
        // se estiver so aberto exibe o espaco em branco
        // E fechado exibe "?" - valor padrao
        if(marcado) {
            return "x";
        } else if(aberto && minado) {
            return "*";
        } else if(aberto && minasNaVizinhanca() > 0){
            return Long.toString(minasNaVizinhanca());
        } else if(aberto) {
            return " ";
        } else {
            return "?";
        }
    }
}
