package exemplo03construtores;

/**
 *
 * @author tharlys
 */
public class Macaco {
    
    private String nome;

    // Por baixo dos panos é colocado um construtor fazio
    public Macaco(String nome) {
        this.nome = nome;
    }

    public Macaco() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
