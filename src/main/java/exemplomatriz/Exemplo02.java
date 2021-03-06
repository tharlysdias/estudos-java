package exemplomatriz;

/**
 *
 * @author tharlys
 */
public class Exemplo02 {
    
    public static void main(String[] args) {
        
        int[][] numeros = new int[][]{
            {20,21},
            {30,31},
            {40,41},
            {50,51}
        };
        
        System.out.println("Linhas: " + numeros.length);
        System.out.println("Colunas: " + numeros[1].length);
        
        System.out.println(numeros[0][0] + " " + numeros[0][1]);
        System.out.println(numeros[1][0] + " " + numeros[1][1]);
        System.out.println(numeros[2][0] + " " + numeros[2][1]);
        System.out.println(numeros[3][0] + " " + numeros[3][1]);
        
    }
}
