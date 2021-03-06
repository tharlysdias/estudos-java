package exemplomatriz;

import java.util.Random;

/**
 *
 * @author tharlys
 */
public class Exemplo03 {
    
    public static void main(String[] args) {
        
        // gera numeros aleatorios conforme a definição do limite
        Random random = new Random();
        
                                // Linhas x colunas
        int[][] numeros = new int[2][3];
        
        // quantidade de linhas: numeros.length
        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[0].length; coluna++) {
                numeros[linha][coluna] = random.nextInt(500);
            }
        }
        
        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[0].length; coluna++) {
                System.out.print(numeros[linha][coluna] + "\t");
            }
            System.out.println("");
        }
        
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                soma += numeros[i][j];
            }
        }
        System.out.println("Soma: " + soma);
    }
}
