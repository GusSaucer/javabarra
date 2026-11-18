package ex5;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        while(true){
            System.out.println("Digite o que você quer cadastrar:\n(A)luno\n(P)rofessor\n(FIM) para sair.");
            String opcao = scanner.nextLine();
            if(opcao.equals("A")){
                System.out.println("Digite seu nome:\n");
                String nome = scanner.nextLine();
                System.out.println("Digite seu CPF:\n");
                String cpf = scanner.nextLine();
                System.out.println("Digite sua nota 1:");
                double nota1 = scanner.nextDouble();
                while (nota1 <0 || nota1>10){
                    System.out.println("Digite uma nota válida:");
                    nota1 = scanner.nextDouble();
                }
                System.out.println("Digite sua nota 2:");
                double nota2 = scanner.nextDouble();
                while (nota2 <0 || nota2>10){
                    System.out.println("Digite uma nota válida:");
                    nota2 = scanner.nextDouble();
                }
                try{
                pessoas.add( new Aluno(nome, cpf, nota1, nota2));
                }catch(IllegalArgumentException e){
                    System.out.println("CPF inválido");
                }
                scanner.nextLine();
            }else if (opcao.equals("P")){
                System.out.println("Digite seu nome:\n");
                String nome = scanner.nextLine();
                System.out.println("Digite seu CPF:\n");
                String cpf = scanner.nextLine();
                System.out.println("Digite o valor da hora/aula:");
                double horaAula = scanner.nextDouble();
                System.out.println("Digite quantas horas o professor deu:");
                double quantidadeAulas = scanner.nextDouble();
                try{
                    pessoas.add( new Professor(nome, cpf, quantidadeAulas, horaAula));
                }catch(IllegalArgumentException e){
                    System.out.println("CPF inválido");
                }

                scanner.nextLine();
            }else if (opcao.equals("FIM")){
                for (Pessoa p : pessoas) {
                    p.exibirDadosResumidos();
                }
                if (pessoas.isEmpty()){
                    System.out.println("Ninguém foi cadastrado");
                }
               break;
            }else{
                System.out.println("Opção inválida, tente novamente");
            }
        }
    }
}