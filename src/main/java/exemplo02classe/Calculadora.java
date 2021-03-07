package exemplo02classe;

/**
 *
 * @author tharlys
 */
public class Calculadora {
    
    public int numero1;
    public int numero2;
    
    // Metodo somar
    public void somar() {
        int soma = numero1 + numero2;
        System.out.println("Soma: " + soma);
    }
    
    // Metodo subtrair
    public void subtrair() {
        int resultado = numero1 - numero2;
        System.out.println("Subtração: " + resultado);
    }
    
    // Metodo multiplicar
    public void multiplicar() {
        int resultado = numero1 * numero2;
        System.out.println("Multiplicação: " + resultado);
    }
    
    // Metodo dividir
    public void dividir() {
        double resultado = (double)numero1 / numero2;
        System.out.println("Divisão: " + resultado);
    }
}
