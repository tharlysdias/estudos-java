package exemplotrycatch;

/**
 *
 * @author tharlys
 */
public class Exemplo05 {
    
    public static void main(String[] args) {
        
        /*
            NullPointerException: quando você tenta acessar alguma coisa, e 
            ela não existe.
        */
        
        String nome = null;
        
        try {
            if(nome.equals("Lucas")) {
                System.out.println("Parabéns");
            } else {
                System.out.println("Não tem festa");
            }
        } catch (NullPointerException e) {
            System.out.println("Nome deve ser inicializado");
        }
        
    }
}
