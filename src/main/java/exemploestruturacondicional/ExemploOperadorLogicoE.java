package exemploestruturacondicional;

/**
 *
 * @author tharlys
 */
public class ExemploOperadorLogicoE {
    
    public static void main(String[] args) {
        
        boolean lavouLouca = true;
        boolean lavouCarro = true;
        
        if ((lavouLouca == true) && (lavouCarro == true)) {
            System.out.println("Você pode sair!");
        } else {
            System.out.println("Vai ficar em casa!");
        }
        
    }
}
