package br.com.alura.exec.desafio.dois;


public class Cadastro {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        ContaBancaria conta = new ContaBancaria();
        IdadePessoa idadePessoa = new IdadePessoa();
        Livro livro = new Livro();
        Produto produto = new Produto();

        conta.setNumeroConta(123);
        conta.setSaldo(1000);
        conta.setTitular("João");

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.getTitular());

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());


    }
}