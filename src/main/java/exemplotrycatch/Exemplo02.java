package exemplotrycatch;

/**
 *
 * @author tharlys
 */
public class Exemplo02 {
    
    public static void main(String[] args) {
        
        // Finally é executando independentemente da situação
        // É utilizado para fechar a conexão com banco de dados
        // Pois independentemente da situação ele será executado e fechará o db
        double numero1;
        double numero2;
        try {
            numero1 = Double.parseDouble("2,30");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            numero1 = 0;
        } finally {
            System.out.println("Minha mensagem do número 1");
        }
        
        try {
            numero2 = Double.parseDouble("3.40");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            numero2 = 0;
        } finally {
            System.out.println("Minha mensagem do número 2");
        }
        
        System.out.println("Soma: " + numero1 + numero2);
    }
}
