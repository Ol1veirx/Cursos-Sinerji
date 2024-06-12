import model.Tabuleiro;
import view.TabuleiroConsole;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(7, 7, 7);
        new TabuleiroConsole(tabuleiro);
    }
}
