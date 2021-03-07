package exemplo03encapsulamento;

/**
 *
 * @author tharlys
 */
public class Gato {
    
    /*
        Encapsulamento Private as informações só podem ser acessadas dentro da 
        mesma classe
        Private traz a possibilidade de se fazer validações
    */
    
    private String nome;
    private byte idade;

    public String getNome() {
        return nome;
    }

    // Metodo set serve para definir a informação
    public void setNome(String nome) {
        // this acessa a variavel private String nome
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
}
