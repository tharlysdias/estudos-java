package exemplos;

/**
 *
 * @author tharl
 */
public class ExemploSubstituicao {
    
    public static void main(String[] args) {
        
        String texto = "Curso de Java Fundamento";
        // Substitui uma determinada letra da string
        texto = texto.replace('o', 'O');
        texto = texto.replace('e', 'E');
        
        System.out.println(texto);
        
        String nomes = "UmDoisTres";
    }
}
