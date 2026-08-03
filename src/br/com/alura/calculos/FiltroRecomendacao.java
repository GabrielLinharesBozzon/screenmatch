package br.com.alura.calculos;

public class FiltroRecomendacao {


    public void filtra(Classificavel classificavel) {
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento ");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avalaido no momento !!!");
        }else {
            System.out.println("Assista depois ");
        }


    }
}
