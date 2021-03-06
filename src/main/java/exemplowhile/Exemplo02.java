package exemplowhile;

import java.util.Scanner;

/**
 *
 * @author tharl
 */
public class Exemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String possuiAluno = "Sim";
        Scanner leitor = new Scanner(System.in);
        int quantidade = 0;
        while (possuiAluno.equals("Sim")) {            
            
            System.out.println("Nome: ");
            String nome = leitor.nextLine();
            
            System.out.println("Idade: ");
            byte idade = Byte.parseByte(leitor.nextLine());
            
            System.out.println("Possui aluno? Sim ou Não");
            possuiAluno = leitor.nextLine();
            
            quantidade++;
        }
        System.out.println("Quantidade: " + quantidade);
        
    }
    
}
