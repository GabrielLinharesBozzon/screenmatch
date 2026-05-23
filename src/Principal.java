import br.com.alura.screenmatch.modelos.Filme;

public class  Principal {
    static void main(String[] args) {
        System.out.println("Filmes");

    Filme meuFilme = new Filme();
    meuFilme.setNome("O poderoso chefão 👍")  ;
    meuFilme.setAnoDeLancamento(1970);
    meuFilme.setDuracaoEmMinutos(180);
    meuFilme.exibeFichaTecnica();
    meuFilme.avalia(8);
    meuFilme.avalia(9);
    meuFilme.avalia(10);
        IO.println( "Média de avaliações do filme:" + meuFilme.pegaMedia());
        IO.println("Total de avaliacoes:"+ meuFilme.getTotaldeAvaliacoes());



    }
}


