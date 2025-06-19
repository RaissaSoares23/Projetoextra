package Projetoextra01;

public class Aluno {
    String nome;
    int idade;
    String matricula;
    double n1, n2, n3;
    
    double calcularMedia() {
    
        double menor = Math.min(n1, Math.min(n2, n3));
        double soma = n1 + n2 + n3 - menor; 
        return soma / 2;
    }
  
    void mostrarSituacao() {
        double media = calcularMedia();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + media);

        if (media >= 6) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
