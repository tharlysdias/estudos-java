package exemplosvetores;

import java.util.Scanner;

/**
 *
 * @author tharl
 */
public class Exemplo05 {
    
    public static void main(String[] args) {
        
        String[] produtos = new String[4];
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i < produtos.length; i++) {
            
            System.out.println("Produto: ");
            produtos[i] = leitor.nextLine();
            
        }
        
        // foreach
        for (String produto : produtos) {
            System.out.println("Nome: " + produto);
        }
        
        System.out.println("OUTRA FORMA");
        for (int i = 0; i < produtos.length; i++) {
            String produto = produtos[i];
            
            System.out.println("Nome: " + produto);
        }
        
    }
}
