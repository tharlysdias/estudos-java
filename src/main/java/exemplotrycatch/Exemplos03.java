package exemplotrycatch;

/**
 *
 * @author tharlys
 */
public class Exemplos03 {
    
    public static void main(String[] args) {
        
        /*
            NumberFormatException: quando o usuario digita algo e ele tenta 
            converter para um determinado tipo, e o tipo
            apresentado não é do tipo que ele esperava
        
            ArithmeticException: quando se tenta dividir alguma coisa por 0
        */
        
        int numero1;
        try {
            numero1 = Integer.parseInt("32");
        } catch (NumberFormatException e) {
            numero1 = 0;
        }
        
        int numero2;
        try {
            numero2 = Integer.parseInt("32");
        } catch (NumberFormatException e) {
            numero2 = 0;
        }
        
        
        try {
            double resultado = numero1 / numero2;
            System.out.println("Número 1: " + numero1);
            System.out.println("Número 2: " + numero2);
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir algo por zero");
        }
    }
}
