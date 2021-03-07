package exemplo02classe;

/**
 *
 * @author tharlys
 */
public class Exemplo02Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        calculadora.numero1 = 10;
        calculadora.numero2 = 25;
        
        System.out.println("Número 01: " + calculadora.numero1);
        System.out.println("Número 02: " + calculadora.numero2);
        calculadora.somar();
        calculadora.subtrair();
        calculadora.multiplicar();
        calculadora.dividir();
    }
    
}
