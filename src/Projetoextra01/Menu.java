package Projetoextra01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Turma turma = new Turma();

    public void executar() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Adicionar novo aluno");
            System.out.println("2. Listar todos os alunos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        adicionarAluno(sc);
                        break;
                    case 2:
                        turma.listarAlunos();
                        break;
                    case 3:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Use apenas números.");
                sc.nextLine(); 
                opcao = 0;
            }
        } while (opcao != 3);

        sc.close();
    }

    private void adicionarAluno(Scanner sc) {
        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();

        System.out.print("Idade: ");
        aluno.idade = sc.nextInt();
        sc.nextLine();

        if (aluno.idade < 18) {
            System.out.println("Erro: idade mínima é 18.");
            return;
        }

        System.out.print("Matrícula: ");
        aluno.matricula = sc.nextLine();
        if (aluno.matricula.isEmpty()) {
            System.out.println("Erro: matrícula não pode estar vazia.");
            return;
        }

        aluno.n1 = lerNota(sc, "Nota 1");
        aluno.n2 = lerNota(sc, "Nota 2");
        aluno.n3 = lerNota(sc, "Nota 3");

        turma.adicionarAluno(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    private double lerNota(Scanner sc, String msg) {
        double nota;
        while (true) {
            try {
                System.out.print(msg + ": ");
                nota = sc.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota fora da faixa (0 a 10).");
                } else {
                    return nota;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite número decimal.");
                sc.nextLine();
            }
        }
    }
}
