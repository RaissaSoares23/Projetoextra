// Exceção personalizada (sem o modificador 'public' para caber no mesmo arquivo)
class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class ExcecaoPersonalizada {
   
    public static void verificarNota(int nota) throws NotaInvalidaException {
        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaException("Erro: A nota " + nota + " é inválida. Use uma nota entre 0 e 10.");
        }
        System.out.println("Nota válida: " + nota);
    }

    public static void main(String[] args) {
        try {
            verificarNota(8);  
            verificarNota(12);      
           
           
        } catch (NotaInvalidaException e) {
            System.out.println(e.getMessage());  
        }
    }
}
