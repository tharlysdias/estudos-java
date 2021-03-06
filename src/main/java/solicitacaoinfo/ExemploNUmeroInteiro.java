package solicitacaoinfo;

import java.util.Scanner;

/**
 *
 * @author tharl
 */
public class ExemploNUmeroInteiro {
    
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a idade");
        byte idade = Byte.parseByte(leitor.nextLine());
        
        System.out.println("Digite um número");
        short numero1 = Short.parseShort(leitor.nextLine());
        
        System.out.println("Digite um número 2:" );
        int numero2 = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Digite o numero 3: ");
        long numero3 = Long.parseLong(leitor.nextLine());
        
        System.out.println("Idade: " + idade 
                + "\nNúmero 1: " + numero1 
                + "\nNúmero 2: " + numero2
                + "\nNúmero 3: " + numero3);
        
        
        long somatoria = idade + numero1 + numero2 + numero3;
        
        System.out.println("Somatória: " + somatoria);
    }
}
