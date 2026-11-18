package ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("O que você quer cadastrar? (A)luno, (P)rofessor ou FIM");
            String opcao = scanner.nextLine().trim().toUpperCase();

            try {
                if (opcao.equals("A")) {
                    String nome = lerTexto("Nome: ");
                    String cpf = lerTexto("CPF: ");
                    double nota1 = lerNumero("Nota 1: ");
                    double nota2 = lerNumero("Nota 2: ");
                    pessoas.add(new Aluno(nome, cpf, nota1, nota2));
                    System.out.println("Aluno cadastrado!");

                } else if (opcao.equals("P")) {
                    String nome = lerTexto("Nome: ");
                    String cpf = lerTexto("CPF: ");
                    double horaAula = lerNumero("Valor da hora-aula: ");
                    double quantidadeAulas = lerNumero("Quantidade de aulas: ");
                    pessoas.add(new Professor(nome, cpf, quantidadeAulas, horaAula));
                    System.out.println("Professor cadastrado!");

                } else if (opcao.equals("FIM")) {
                    continuar = false;

                } else {
                    System.out.println("Opção inválida, tente novamente.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Cadastro não realizado: " + e.getMessage());
            }
        }

        if (pessoas.isEmpty()) {
            System.out.println("Ninguém foi cadastrado.");
        } else {
            for (Pessoa p : pessoas) {
                p.exibirDadosResumidos();
            }
        }
        scanner.close();
    }

    private static String lerTexto(String pergunta) {
        System.out.print(pergunta);
        return scanner.nextLine().trim();
    }

    private static double lerNumero(String pergunta) {
        while (true) {
            System.out.print(pergunta);
            String texto = scanner.nextLine().trim().replace(",", ".");
            try {
                return Double.parseDouble(texto);
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido (ex.: 7.5).");
            }
        }
    }
}