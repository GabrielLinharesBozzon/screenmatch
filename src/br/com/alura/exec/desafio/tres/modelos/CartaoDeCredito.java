package br.com.alura.exec.desafio.tres.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> Compras;



    public CartaoDeCredito(double limite){
    this.limite = limite;
    this.saldo = limite;
    this.Compras = new ArrayList<>();
}
    public boolean lancaCompra(Compra compra){
        if (this.saldo > compra.getValor()){
                this.saldo -= compra.getValor();
                this.Compras.add(compra);
                return true;

        }
        return false;
    }

    public double getLimite() {
        return limite;
    }


}
