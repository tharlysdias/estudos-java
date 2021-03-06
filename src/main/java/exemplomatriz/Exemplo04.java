package exemplomatriz;

import java.util.Scanner;

/**
 *
 * @author tharlys
 */
public class Exemplo04 {
    
    public static void main(String[] args) {
        
        // Matriz de objeto
        String[][] nomes = new String[2][3];
        
        Scanner leitor = new Scanner(System.in);
        
        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes[0].length; j++) {
                
                System.out.println("Nome: ");
                String nome = leitor.nextLine();
                
                nomes[i][j] = nome;
            }
        }
        
        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes[0].length; j++) {
                System.out.print(nomes[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
