package exemplowhile;

/**
 *
 * @author tharl
 */
public class Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int quantidadeLouca = 10;
        
        while (quantidadeLouca > 0) {
            System.out.println("Lavando a louça " + quantidadeLouca);      
            quantidadeLouca--;
        }
        
        System.out.println("Acabei a louça ufa");
        
    }
    
}
