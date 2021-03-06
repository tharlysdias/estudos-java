package exemploestruturacondicional;

/**
 *
 * @author tharl
 */
public class ExemploOperadorLogicoOu {
    
    public static void main(String[] args) {
        
        double nota = 7.1;
        boolean aprovadoExame = true;
        
        // V ou V -> V
        // V ou F -> V
        // F ou V -> V
        // F ou F -> F
        if ((nota >= 7.0) || (aprovadoExame == true)) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
    }
}
