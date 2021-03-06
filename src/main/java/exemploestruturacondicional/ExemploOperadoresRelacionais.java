package exemploestruturacondicional;

/**
 *
 * @author tharl
 */
public class ExemploOperadoresRelacionais {
    
    public static void main(String[] args) {
        
        // Operadores relacionais
        // Condicionar variados valores
        /*
            == igual
            > maior
            >= maior ou igual
            < menor
            <= menor ou igual
            != diferente (negação da igualdade)
        */
        byte idade = 21;
        
        if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Menor de idade");
        }
        
        char sexo = 'm';
        if (sexo != 'f') {
            System.out.println("Masculino");
        } else {
            System.out.println("Feminino");
        }
    }
}
