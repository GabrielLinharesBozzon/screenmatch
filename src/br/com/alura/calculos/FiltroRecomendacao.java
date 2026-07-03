package br.com.alura.calculos;

public class FiltroRecomendacao {


    public void filtro(Classificavel classificavel) {
        if(classificavel.getClassificacao() >= 4){
            IO.println("Está entre os preferidos do momento ");
        }else if (classificavel.getClassificacao() >= 2){
            IO.println("Muito bem avalaido no momento !!!");
        }else {
            IO.println("Assista depois ");
        }

    }
}
