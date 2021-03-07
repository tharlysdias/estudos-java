package exemplo05encapsulamento;

/**
 *
 * @author tharlys
 */
public class Exemplo05Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Robo r2d2 = new Robo();
        
        r2d2.setModelo("R2-D2");
        r2d2.setDescritivo("Robo que auxilia na cozinha");
        
        Robo c3po = new Robo();
        
        c3po.setModelo("C-3PO");
        c3po.setDescritivo("Robo que auxilia na limpeza");
        
        System.out.println(
                "Modelo: " + r2d2.getModelo() 
                + "\nDescritivo: " + r2d2.getDescritivo()
                + "\n\nModelo: " + c3po.getModelo()
                + "\nDescritivo: " + c3po.getDescritivo()
        );
    }
    
}
