package br.com.alura.exec.desafio.um;

import java.util.Scanner;

public class Calculadora {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        IO.println("Digite o valor :");
        int valor = leitor.nextInt();
        IO.println("O valor é "+valor*2);
    }
}
