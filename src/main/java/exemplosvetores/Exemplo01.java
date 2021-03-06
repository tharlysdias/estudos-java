/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosvetores;

/**
 *
 * @author tharl
 */
public class Exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] numeros = new int[5];
        
        numeros[0] = 10;
        numeros[1] = 11;
        numeros[2] = 12;
        numeros[3] = 13;
        
        numeros[4] = numeros[0] + numeros[1] + numeros[2] + numeros[3];
        
        System.out.println("0 -> " + numeros[0]);
        System.out.println("1 -> " + numeros[1]);
        System.out.println("2 -> " + numeros[2]);
        System.out.println("3 -> " + numeros[3]);
        System.out.println("Soma: " + numeros[4]);
        
        // Mostra o tamanho do vetor
        System.out.println("Tamanho: " + numeros.length);
    }
    
}
