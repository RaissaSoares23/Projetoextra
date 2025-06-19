package Projetoextra01;

import java.util.ArrayList;

public class Turma {
   
    ArrayList<Aluno> alunos = new ArrayList<>();

   
    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    
    void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("-------------------------");
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Idade: " + aluno.idade);
            System.out.println("Matrícula: " + aluno.matricula);
            System.out.println("Notas: " + aluno.n1 + ", " + aluno.n2 + ", " + aluno.n3);
            System.out.printf("Média: %.2f\n", aluno.calcularMedia());
            
            if (aluno.calcularMedia() >= 6) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
        }
    }
}
