package br.com.alura.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadorasDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }


    ///public void inclui(Filme f){
    ///    tempoTotal += f.getDuracaoEmMinutos();
    ///
    ///}
    ///public void inclui(Serie s){
    ///    tempoTotal += s.getDuracaoEmMinutos();
    ///    }

    public void inclui(Titulo titulo){
        this.tempoTotal+= titulo.getDuracaoEmMinutos();
    }

}
