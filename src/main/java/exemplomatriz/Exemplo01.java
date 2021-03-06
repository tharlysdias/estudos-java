package exemplomatriz;

/**
 *
 * @author tharlys
 */
public class Exemplo01 {
    
    public static void main(String[] args) {
        
        // Matrizes geralmente são utilizadas para guardar coordenadas
        // matriz de 3 linhas x 2 colunas
        // Sempre começa com a quantidade de linhas e depois das colunas
        int[][] numeros = new int[3][2];
        
        // linha x coluna
        numeros[0][0] = 32;
        numeros[0][1] = 33;
        numeros[1][0] = 35;
        numeros[1][1] = 36;
        numeros[2][0] = 39;
        numeros[2][1] = 40;
        
        System.out.println(numeros[0][0] + " " + numeros[0][1]);
        System.out.println(numeros[1][0] + " " + numeros[1][1]);
        System.out.println(numeros[2][0] + " " + numeros[2][1]);
        
        // Tamanho da matriz
        System.out.println("Linhas: " +  numeros.length);
        System.out.println("Colunas: " +  numeros[0].length);
        System.out.println("Colunas: " +  numeros[1].length);
        System.out.println("Colunas: " +  numeros[2].length);
        
    }
}
