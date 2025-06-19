import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Persistencia persistencia;

    public Menu(Persistencia persistencia) {
        this.persistencia = persistencia;
    }

    public void exibir() {
        int opcao = -1;

        while (opcao != 3) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Adicionar novo aluno");
            System.out.println("2. Listar todos os alunos");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            
            try {
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1: adicionarAluno(); break;
                    case 2: persistencia.listarAlunos(); break;
                    case 3: System.out.println("Encerrando..."); break;
                    default: System.out.println("Opção inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número.");
            }
        }
    }

    private void adicionarAluno() {
        try {
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());

            System.out.print("Matrícula: ");
            String matricula = sc.nextLine();

            System.out.print("Nota N1: ");
            double n1 = Double.parseDouble(sc.nextLine());

            System.out.print("Nota N2: ");
            double n2 = Double.parseDouble(sc.nextLine());

            System.out.print("Nota N3: ");
            double n3 = Double.parseDouble(sc.nextLine());

            Aluno aluno = new Aluno(nome, idade, matricula, n1, n2, n3);
            persistencia.adicionarAluno(aluno);

            System.out.println("Aluno adicionado com sucesso!");

        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada numérica inválida.");
        } catch (NotaInvalidaException | IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
