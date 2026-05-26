import br.com.alura.calculos.CalculadorasDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Titulo;

public class  Principal {
    static void main(String[] args) {
        System.out.println("Filmes");

    Titulo titulo = new Titulo();
    titulo.setNome("O poderoso chefão 👍")  ;
    titulo.setAnoDeLancamento(1970);
    titulo.setDuracaoEmMinutos(180);
    titulo.exibeFichaTecnica();
    titulo.avalia(8);
    titulo.avalia(9);
    titulo.avalia(10);
        IO.println( "Média de avaliações do filme:" + titulo.pegaMedia());
        IO.println("Total de avaliacoes:"+ titulo.getTotaldeAvaliacoes());


        CalculadorasDeTempo calculadora=  new CalculadorasDeTempo();
    }
}


