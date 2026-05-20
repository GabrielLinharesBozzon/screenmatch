public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totaldeAvaliacoes;
    int duracaoEmMinutos;
    //modificadores metodos
    int  getTotaldeAvaliacoes(){
        return totaldeAvaliacoes;
    }


    void exibeFichaTecnica(){
        IO.println("Nome do filme "+nome);
        IO.println( "Ano de lançamento:" +anoDeLancamento);
        IO.println("Incluído no plano:"+incluindoNoPlano);
        IO.println("Duração em minutos:"+duracaoEmMinutos);


    }
      void avalia (double nota ){
        somaDasAvaliacoes += nota;
        totaldeAvaliacoes++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / totaldeAvaliacoes;
    }
}
