package br.com.alura.exec.desafio.tres;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0; // saldo inicial do cartão
        List<Double> compras = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\n*-------------------------------------------------------------------------------*");
            System.out.println("                    Extrato do seu cartão                                         ");
            System.out.println("*-------------------------------------------------------------------------------*");
            System.out.println("1 - Saldo do cartão");
            System.out.println("2 - Lançar compra");
            System.out.println("3 - Exibir compras ordenadas por valor");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção:\n ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo disponível: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor da compra: ");
                    double valorCompra = scanner.nextDouble();
                    if (valorCompra <= saldo) {
                        compras.add(valorCompra);
                        saldo -= valorCompra;
                        System.out.println("Compra registrada com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;

                case 3:
                    compras.stream()
                            .sorted(Comparator.naturalOrder())
                            .forEach(c -> System.out.println("Compra: R$ " + c));
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
