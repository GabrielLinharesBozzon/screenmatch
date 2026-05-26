package br.com.alura.calculos;
import br.com.alura.screenmatch.modelos.Filme;
public class CalculadorasDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();

    }
}
