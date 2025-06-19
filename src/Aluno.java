
public class Aluno {
    String nome;
    int idade;
    String matricula;
    double n1, n2, n3;

    // Método para calcular a média das duas maiores notas
    double calcularMedia() {
        // Descobre a menor nota e a ignora
        double menor = Math.min(n1, Math.min(n2, n3));
        double soma = n1 + n2 + n3 - menor; // soma das duas maiores
        return soma / 2;
    }

    // Método para mostrar a situação do aluno
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
