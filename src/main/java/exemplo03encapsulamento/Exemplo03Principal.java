package exemplo03encapsulamento;

/**
 *
 * @author tharlys
 */
public class Exemplo03Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gato miau = new Gato();
        
        miau.setNome("Miau");
        miau.setIdade((byte) 10);
        
        System.out.println(miau.getNome());
        System.out.println(miau.getIdade());
    }
    
}
