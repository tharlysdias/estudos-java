package exemplos;

/**
 *
 * @author tharl
 */
public class ExemploTrim {
    
    public static void main(String[] args) {
        
        String nome = "Francisco   ";
        System.out.println(nome.length());
        
        // trim remove os espaços
        nome = nome.trim();
        System.out.println(nome.length());
    }
}
