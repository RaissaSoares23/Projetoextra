public class AlunoEspecial extends Aluno {
    private String projeto;
    private boolean monitor;

    public AlunoEspecial(String nome, int idade, String matricula, double n1, double n2, double n3, String projeto, boolean monitor)
            throws NotaInvalidaException {
        super(nome, idade, matricula, n1, n2, n3);
        this.projeto = projeto;
        this.monitor = monitor;
    }

    @Override
    public String getSituacao() {
        return calcularMedia() >= 5.5 ? "Aprovado (Especial)" : "Reprovado (Especial)";
    }

    public void apresentarProjeto() {
        System.out.println(nome + " está desenvolvendo o projeto: " + projeto);
    }
}
