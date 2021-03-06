package solicitacaoinfo;

import java.util.Scanner;

/**
 *
 * @author tharl
 */
public class ExemploLogico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Possui Cachorro?" + "\nTrue -> Sim\nFalse -> Não");
        boolean possuiCachorro = Boolean.parseBoolean(leitor.nextLine());
        
        if (possuiCachorro == true) {
            System.out.println("Possui cachorro");
        } else {
            System.out.println("Não tem cachorro");
        }
        
    }
    
}
