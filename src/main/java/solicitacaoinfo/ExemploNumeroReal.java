package solicitacaoinfo;

import java.util.Scanner;

/**
 *
 * @author tharl
 */
public class ExemploNumeroReal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o peso: ");
        float peso = Float.parseFloat(leitor.nextLine());
        
        System.out.println("Digite a altura: ");
        double altura = Double.parseDouble(leitor.nextLine());
        
        System.out.println("Peso: " + peso 
                + "\nAltura: " + altura);
        
    }
    
}
