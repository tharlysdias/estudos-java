package exemplos;

/**
 *
 * @author tharl
 */
public class ExemploConcatenacaoString {
    
    public static void main(String[] args) {
        
        String nome = "Pedro da Silva";
        byte idade = 21;
        
        String nome2 = "Lucas de Souza";
        byte idade2 = 18;
        
        String texto = "Nome: " + nome;
        texto += "\nIdade: " + idade;
        
        texto += "\nNome: " + nome2;
        texto += "\nIdade: " + idade2;
        
        System.out.println(texto);
    }
}
