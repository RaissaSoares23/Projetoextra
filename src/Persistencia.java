import java.util.*;

public class Persistencia {
    private List<Aluno> listaAlunos;
    private Set<Aluno> setAlunos;
    private Map<String, Aluno> mapAlunos;

    private int modo; 
    public Persistencia(int somaDasMatriculas) {
        this.modo = somaDasMatriculas % 3;

        switch (modo) {
            case 0:
                listaAlunos = new ArrayList<>();
                System.out.println("Usando estrutura: List");
                break;
            case 1:
                setAlunos = new HashSet<>();
                System.out.println("Usando estrutura: Set");
                break;
            case 2:
                mapAlunos = new HashMap<>();
                System.out.println("Usando estrutura: Map");
                break;
        }
    }

    public void adicionarAluno(Aluno aluno) {
        switch (modo) {
            case 0:
                listaAlunos.add(aluno);
                break;
            case 1:
                setAlunos.add(aluno);
                break;
            case 2:
                mapAlunos.put(aluno.matricula, aluno);
                break;
        }
    }

    public void listarAlunos() {
        switch (modo) {
            case 0:
                for (Aluno a : listaAlunos) {
                    exibir(a);
                }
                break;
            case 1:
                for (Aluno a : setAlunos) {
                    exibir(a);
                }
                break;
            case 2:
                for (Map.Entry<String, Aluno> entry : mapAlunos.entrySet()) {
                    exibir(entry.getValue());
                }
                break;
        }
    }

    private void exibir(Aluno a) {
        System.out.println("-----------------------------");
        System.out.println("Nome: " + a.nome);
        System.out.println("Idade: " + a.idade);
        System.out.println("Matrícula: " + a.matricula);
        System.out.println("Notas: " + a.n1 + ", " + a.n2 + ", " + a.n3);
        System.out.printf("Média: %.2f\n", a.calcularMedia());
        System.out.println("Situação: " + (a.calcularMedia() >= 6 ? "Aprovado" : "Reprovado"));
    }
}
