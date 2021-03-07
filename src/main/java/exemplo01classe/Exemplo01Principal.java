package exemplo01classe;

/**
 *
 * @author tharlys
 */
public class Exemplo01Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Instanciando um objeto da classe pessoa
        Pessoa francisco = new Pessoa();
        francisco.nome = "Francisco";
        francisco.idade = 23;
        francisco.altura = 1.70f;

        Pessoa maria = new Pessoa();
        maria.nome = "Maria";
        maria.idade = 21;
        maria.altura = 1.89f;

        System.out.println(
                "Nome: " + francisco.nome
                + "\nIdade: " + francisco.idade
                + "\n\nNome: " + maria.nome
                + "\nIdade: " + maria.idade);

    }

}
