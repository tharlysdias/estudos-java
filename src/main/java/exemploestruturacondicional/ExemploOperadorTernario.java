package exemploestruturacondicional;

/**
 *
 * @author tharlys
 */
public class ExemploOperadorTernario {
    
    public static void main(String[] args) {
        
        byte numero = 2;
        
        /*
        if (numero == 1) {
            System.out.println("Um");
        } else {
            System.out.println("Dois");
        }
        */
        
        // Operador Ternário
        // É utilizar quando se esperar apenas um retorno de informação
        System.out.println(numero == 1 ? "Um" : "Dois");
        
        char letra = 'a';
        
        System.out.println(
                letra == 'a' 
                        ? "Cadastro" 
                        : "Edição"
                );
        
    }
}
