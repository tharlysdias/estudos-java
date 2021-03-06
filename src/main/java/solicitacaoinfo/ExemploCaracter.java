package solicitacaoinfo;

import java.util.Scanner;

/**
 *
 * @author tharl
 */
public class ExemploCaracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o sexo: ");
        char sexo = leitor.nextLine().charAt(0);
        
        System.out.println("Sexo digitado " + sexo);
        
    }
    
}
