package exercicio02;

import java.util.Scanner;

/**
 *
 * @author tharlys
 */
public class Exercicio02Principal {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int numeros[] = new int[15];
        
        int totalSoma = 0;
        double somaPares = 0;
        double somaImpares = 0;
        
        int quantidadeNumerosPares = 0;
        int quantidadeNumerosImpares = 0;
        
        int quantidadeNumerosPositivos = 0;
        int quantidadeNumerosNegativos = 0;
        int quantidadeNumerosNeutros = 0;
        
        int quantidadeNumerosNegativosPares = 0;
        int quantidadeNumerosPositivosImpares = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i+1) + ":");
            numeros[i] = Integer.parseInt(leitor.nextLine());
            
            totalSoma += numeros[i];
            
            // Soma impares
            if ((numeros[i]%2 == 1) || (numeros[i]%2 == -1)) {
                somaImpares += numeros[i];
            }
            
            // Soma pares
            if (numeros[i]%2 == 0) {
                somaPares += numeros[i];
            }
            
            // Quantidade numeros pares
            if (numeros[i]%2 == 0) {
                quantidadeNumerosPares += 1;
            }
            
            // Quantidade numeros impares
            if ((numeros[i]%2 == 1) || (numeros[i]%2 == -1)) {
                quantidadeNumerosImpares += 1;
            }
            
            // Quantidade numeros positivos
            if (numeros[i] > 0) {
                quantidadeNumerosPositivos += 1;
            }
            
            // Quantidade numeros negativos
            if (numeros[i] < 0) {
                quantidadeNumerosNegativos += 1;
            }
            
            // Quantidade numeros neutros
            if (numeros[i] == 0) {
                quantidadeNumerosNeutros += 1;
            }
            
            // Quantidade numeros negativos e pares
            if ((numeros[i] < 0) && (numeros[i]%2 == 0)) {
                quantidadeNumerosNegativosPares += 1;
            }
            
            // Quantidade numeros positivos e impares
            if ((numeros[i] > 0) && ((numeros[i]%2 == 1) || (numeros[i]%2 == -1))) {
                quantidadeNumerosPositivosImpares += 1;
            }
        }
        
        double media = totalSoma / numeros.length;
        System.out.println("Média dos números: " + media);
        
        System.out.println("Média dos números ímpares: " + (somaImpares/(double) quantidadeNumerosImpares));
        System.out.println("Média dos números pares: " + (somaPares/(double) quantidadeNumerosPares));
        System.out.println("Quantidade de números pares: " + quantidadeNumerosPares);
        System.out.println("Quantidade de números ímpares: " + quantidadeNumerosImpares);
        System.out.println("Quantidade de números positivos: " + quantidadeNumerosPositivos);
        System.out.println("Quantidade de números negativos: " + quantidadeNumerosNegativos);
        System.out.println("Quantidade de números neutros: " + quantidadeNumerosNeutros);
        System.out.println("Quantidade de números negativos e pares: " + quantidadeNumerosNegativosPares);
        System.out.println("Quantidade de números positivos e ímpares: " + quantidadeNumerosPositivosImpares);
    }
    
}
