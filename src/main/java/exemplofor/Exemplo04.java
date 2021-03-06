package exemplofor;

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
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Número de parada: ");
        int numeroParada = Integer.parseInt(leitor.nextLine());
        
        for (int i = 0; i < 10_000; i++) {
            if (i == 10) {
                // Incrementa +1 no i
                // Ignora o restante
                continue;
            }
            
            System.out.println(i);
            
            if (i == numeroParada) {
                break;
            }
        }
        
    }
    
}
