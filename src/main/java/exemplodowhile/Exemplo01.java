/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodowhile;

import java.util.Scanner;

/**
 *
 * @author tharl
 */
public class Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        boolean cadastrar;
        
        do {
            System.out.println("Nome do Produto: ");
            String nomeProduto = leitor.nextLine();
            
            System.out.println("Preço: R$ ");
            double preco = Double.parseDouble(leitor.nextLine());
            
            System.out.println("Deseja cadastrar mais produtos?");
            cadastrar = Boolean.parseBoolean(leitor.nextLine());
        } while (cadastrar == true);
        
    }
    
}
