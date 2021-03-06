package exemplos;

/**
 *
 * @author tharlys
 */
public class ExemploString {
    
    public static void main(String[] args) {
        
        String texto1 = "Curso";
        String nomeCurso = "Java Fundamentos";
        
        String textoCompleto = texto1 + " " + nomeCurso;
        
        textoCompleto += " ministrado por Francisco Lucas Sens";
        
        System.out.println(textoCompleto);
    }
}
