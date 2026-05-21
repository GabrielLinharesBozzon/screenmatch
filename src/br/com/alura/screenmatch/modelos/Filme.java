package br.com.alura.screenmatch.modelos;

public class Filme {
    public String nome;
    public int anoDeLancamento;
   public boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totaldeAvaliacoes;
   public  int duracaoEmMinutos;
    //modificadores metodos
  public  int  getTotaldeAvaliacoes(){
        return totaldeAvaliacoes;
    }


  public void exibeFichaTecnica(){
        IO.println("Nome do filme "+nome);
        IO.println( "Ano de lançamento:" +anoDeLancamento);
        IO.println("Incluído no plano:"+incluindoNoPlano);
        IO.println("Duração em minutos:"+duracaoEmMinutos);


    }
    public  void avalia (double nota ){
        somaDasAvaliacoes += nota;
        totaldeAvaliacoes++;
    }
   public double pegaMedia(){
        return somaDasAvaliacoes / totaldeAvaliacoes;
    }
}
