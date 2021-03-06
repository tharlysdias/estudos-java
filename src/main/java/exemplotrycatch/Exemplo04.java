package exemplotrycatch;

/**
 *
 * @author tharlys
 */
public class Exemplo04 {
    
    public static void main(String[] args) {
        
        /*
            Quanto se tenta acessar uma posição de um vetor ou de uma matriz 
            e essa posição não existe
        */
        
        int[] numeros = new int[4];
        
        try {
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Não é possível acessar essa posição");
        }
        
        System.out.println("Obrigado");
        
    }
}
