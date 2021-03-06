package exemploestruturacondicional;

/**
 *
 * @author tharl
 */
public class ExemploComparacaoString {
    
    public static void main(String[] args) {
        
        String nome = new String("Olá");
        String texto = new String("olá");
        
        // == Verifica se existe no mesmo espaço de memoria (posição de memoria)
        // .equals Verifica se os textos são iguais (compara o conteudo da variavel)
        // .equalsIgnoreCase Verifica se os textos são iguais ignorando maiúscula e minúscula
        if (nome == texto || nome.equals(texto) || nome.equalsIgnoreCase(texto)) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }
    }
}
