import java.util.*;

public class Persistencia {
    private Object estrutura;

    public Persistencia(int valorModulo3) {
        switch (valorModulo3) {
            case 0:
                estrutura = new ArrayList<Aluno>();
                break;
            case 1:
                estrutura = new HashSet<Aluno>();
                break;
            case 2:
                estrutura = new HashMap<String, Aluno>();
                break;
        }
    }

    public void adicionarAluno(Aluno aluno) {
        if (estrutura instanceof List) {
            ((List<Aluno>) estrutura).add(aluno);
        } else if (estrutura instanceof Set) {
            ((Set<Aluno>) estrutura).add(aluno);
        } else if (estrutura instanceof Map) {
            ((Map<String, Aluno>) estrutura).put(aluno.getMatricula(), aluno);
        }
    }

    public void listarAlunos() {
        if (estrutura instanceof List) {
            for (Aluno a : (List<Aluno>) estrutura) System.out.println(a);
        } else if (estrutura instanceof Set) {
            for (Aluno a : (Set<Aluno>) estrutura) System.out.println(a);
        } else if (estrutura instanceof Map) {
            for (Aluno a : ((Map<String, Aluno>) estrutura).values()) System.out.println(a);
        }
    }
}
