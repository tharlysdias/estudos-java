package exemplosvetores;

import java.util.Scanner;

/**
 *
 * @author tharl
 */
public class Exemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] nomes = new String[5];
        
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: ");
            nomes[i] = leitor.nextLine();
        }
        
        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            
            if (!nome.startsWith("F")) {
                System.out.println(nomes[i] + " - " + nome.length());
            }
        }
        
    }
    
}
