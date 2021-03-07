package exercicio01;

import java.util.Scanner;

/**
 *
 * @author tharlys
 */
public class Exercicio01Principal {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        System.out.println("Nome: ");
        pessoa.setNome(leitor.nextLine());
        System.out.println("Sobrenome: ");
        pessoa.setSobrenome(leitor.nextLine());
        System.out.println("Nota 1: ");
        pessoa.setNota1(Double.parseDouble(leitor.nextLine()));
        System.out.println("Nota 2: ");
        pessoa.setNota2(Double.parseDouble(leitor.nextLine()));
        System.out.println("Nota 3: ");
        pessoa.setNota3(Double.parseDouble(leitor.nextLine()));
        System.out.println("Nota 4: ");
        pessoa.setNota4(Double.parseDouble(leitor.nextLine()));
        
        System.out.println("\n\nNome completo: " + pessoa.getNome() 
                + " " + pessoa.getSobrenome()
                + "\nNota 1: " + pessoa.getNota1()
                + "\nNota 2: " + pessoa.getNota2()
                + "\nNota 3: " + pessoa.getNota3()
                + "\nNota 4: " + pessoa.getNota4()
        );
        
        double notaTotal = pessoa.getNota1() + pessoa.getNota2() 
                + pessoa.getNota3() + pessoa.getNota4();
        
        double media = notaTotal / 4;
        
        System.out.println("\nMédia: " + media);
        
        if (media < 5) {
            System.out.println("\nSituação: Reprovado");
        } else if (media < 7) {
            System.out.println("\nSituação: Em recuperação");
        } else if (media >= 7) {
            System.out.println("\nSituação: Aprovado");
        }
    }
    
}
