package exemplo01construtores;

/**
 *
 * @author tharlys
 */
public class Exemplo01Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cachorro dog1 = new Cachorro("Popi");
        // dog1.setNome("Popi");
        dog1.setRaca("");
        dog1.setIdade(2);
        
        System.out.println(dog1.getNome());
        
    }
    
}
