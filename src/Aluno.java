.|
public class Aluno {
    protected String nome;
    protected int idade;
    protected String matricula;
    protected double n1, n2, n3;

    public Aluno(String nome, int idade, String matricula, double n1, double n2, double n3) throws NotaInvalidaException {
        if (nome == null || nome.isEmpty()) throw new IllegalArgumentException("Nome obrigatório.");
        if (idade < 18) throw new IllegalArgumentException("Idade deve ser maior que 17.");
        if (matricula == null || matricula.isEmpty()) throw new IllegalArgumentException("Matrícula obrigatória.");
        if (!notaValida(n1) || !notaValida(n2) || !notaValida(n3)) throw new NotaInvalidaException("Notas devem estar entre 0 e 10.");

        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    private boolean notaValida(double nota) {
        return nota >= 0 && nota <= 10;
    }

    public double calcularMedia() {
        double[] notas = {n1, n2, n3};
        java.util.Arrays.sort(notas);
        return (notas[1] + notas[2]) / 2.0;
    }

    public String getSituacao() {
        return calcularMedia() >= 6 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Idade: %d | Matrícula: %s | Notas: %.1f, %.1f, %.1f | Média: %.2f | Situação: %s",
                nome, idade, matricula, n1, n2, n3, calcularMedia(), getSituacao());
    }

    public String getMatricula() {
        return this.matricula;
    }
}
