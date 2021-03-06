package exemplosvetores;

import java.util.Random;

/**
 *
 * @author tharl
 */
public class Exemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = new int[50];
        
        // Gera numeros aleatorios definindo até quanto se quer
        Random random = new Random();
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(200);
//            System.out.println(numeros[i]);
//            System.out.println("[" + i + "] = " + numeros[i]);
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("[" + i + "] = " + numeros[i]);
        }
        
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("Total: " + soma);
        
    }
    
}
