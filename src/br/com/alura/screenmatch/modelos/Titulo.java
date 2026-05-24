package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totaldeAvaliacoes;
    private  int duracaoEmMinutos;

    public  int  getTotaldeAvaliacoes(){

        return totaldeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
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
