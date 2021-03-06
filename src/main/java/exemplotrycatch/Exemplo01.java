package exemplotrycatch;

import java.util.Scanner;

/**
 *
 * @author tharlys
 */
public class Exemplo01 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Nome:");
        String nome = leitor.nextLine();

        // Tratamentos de erro no java
        try {
            System.out.println("Idade: ");
            byte idade = Byte.parseByte(leitor.nextLine());            
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Obrigado!");
    }
}
