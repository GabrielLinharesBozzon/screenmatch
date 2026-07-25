package br.com.alura.principal;

import br.com.alura.calculos.FiltroRecomendacao;
import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;
import br.com.alura.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão 🎩",1970);
        Serie lost = new Serie("Lost🏝️",2000);
        Filme outroFilme = new Filme("Avatar👽",2023);
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        var filmeDoPaulo = new Filme("Dogville 👩",2003);


        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for(Titulo item : lista){
            System.out.println(item.getNome());
            System.out.println(item.getAnoDeLancamento());
            System.out.println();
        }

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: \n"+lista);
    }
}
