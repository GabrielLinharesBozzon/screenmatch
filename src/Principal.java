public class  Principal {
    static void main(String[] args) {
        System.out.println("Filmes");

        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão 👍";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos= 180;

    meuFilme.exibeFichaTecnica();
    meuFilme.avalia(8);
    meuFilme.avalia(9);
    meuFilme.avalia(10);
        IO.println( "Média de avaliações do filme:" + meuFilme.pegaMedia());
        IO.println("Total de avaliacoes:"+ meuFilme.getTotaldeAvaliacoes());



    }
}


