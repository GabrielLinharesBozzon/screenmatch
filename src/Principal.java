import br.com.alura.calculos.CalculadorasDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class  Principal {
    static void main(String[] args) {
        System.out.println("Filmes");

    Filme titulo = new Filme();
<<<<<<< Updated upstream
    titulo.setNome("O poderoso chefão ←👽→")  ;
=======
    titulo.setNome("O poderoso chefão 👍")  ;
>>>>>>> Stashed changes
    titulo.setAnoDeLancamento(1970);
    titulo.setDuracaoEmMinutos(180);
    titulo.exibeFichaTecnica();
    titulo.avalia(8);
    titulo.avalia(9);
    titulo.avalia(10);
        IO.println( "Média de avaliações do filme:" + titulo.pegaMedia());
        IO.println("Total de avaliacoes:"+ titulo.getTotaldeAvaliacoes());

    Serie serie = new Serie();
    serie.setNome("Lost");
    serie.setAnoDeLancamento(2002);
    serie.exibeFichaTecnica();
    serie.setTemporadas(10);
    serie.setEpisodiosPorTemporadas(10);
    serie.getDuracaoEmMinutos();

    Filme outroFilme = new Filme();
    outroFilme.setNome("Outro");
    outroFilme.setAnoDeLancamento(2003);
    outroFilme.setDuracaoEmMinutos(200);


        CalculadorasDeTempo calculadora=  new CalculadorasDeTempo();
        calculadora.inclui(titulo);
        calculadora.inclui(outroFilme);
        IO.println(calculadora.getTempoTotal());
    }
}


