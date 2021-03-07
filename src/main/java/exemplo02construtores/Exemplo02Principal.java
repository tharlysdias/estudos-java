package exemplo02construtores;

/**
 *
 * @author tharlys
 */
public class Exemplo02Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa joao = new Pessoa("João", (byte) 4);
        
        Pessoa paulo = new Pessoa("Paulo", (byte) 30, 70.6, 1.83);
        
        System.out.println(
                "Nome: " + joao.getNome()
                + "Idade: " + joao.getIdade()
                + "Nome: " + paulo.getNome()
                + "Idade: " + paulo.getIdade()
                + "Peso: " + paulo.getPeso()
                + "Altura: " + paulo.getAltura()
        );
        
    }
    
}
