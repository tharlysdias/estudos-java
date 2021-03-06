package tiposprimitivos;

/**
 *
 * @author tharlys
 */
public class OperacoesAritmeticas {
    
    public static void main(String[] args) {
        
        // Operações aritméticas
        int numero1 = 100;
        int numero2 = 200;
        
        // Somatória
        int soma = numero1 + numero2;
        
        // Subtracao
        int subtracao = numero1 - numero2;
        
        // Multiplicacao
        int multiplicacao = numero1 * numero2;
        
        // Divisao
        double divisao = (double) numero1 / numero2; // Quest
        
        // Resto
        int restoDivisao = numero1 % 2; // numero par retorna 0
        
        int restoDivisao1 = 23 % 2; // numero impar retorna 1
        
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Resto Divisão: " + restoDivisao);
        System.out.println("Resto Divisão de 23: " + restoDivisao1);
    }
}
