package Projetoextra01;

public class AlunoEspecial extends Aluno {
   
    String tipoNecessidade; 
    String acompanhamento;  
    
    public AlunoEspecial() {
        super(); 
    }
    
    public void solicitarApoio() {
        System.out.println(nome + " solicitou apoio especial: " + acompanhamento);
    }
    
    @Override
    void mostrarSituacao() {
        super.mostrarSituacao(); 
        System.out.println("Tipo de necessidade especial: " + tipoNecessidade);
        System.out.println("Acompanhamento: " + acompanhamento);
    }
}
