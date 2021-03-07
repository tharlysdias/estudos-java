package exemplo04encapsulamento;

/**
 *
 * @author tharlys
 */
public class Exemplo04Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Brinquedo palito = new Brinquedo();
            palito.setNome("Palito");
            palito.setValor(-89.78);
            
            System.out.println(
                    "Nome: " + palito.getNome()
                            + "\nValor: " + palito.getValor()
            );
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
