package br.com.alura.exec.desafio.tres.modelos;

public class Compra {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "compra{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
