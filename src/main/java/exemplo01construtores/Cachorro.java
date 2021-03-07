package exemplo01construtores;

/**
 *
 * @author tharlys
 */
public class Cachorro {
    
    private String nome;
    private int idade;
    private String raca;

    // construtores
    public Cachorro(String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
}
