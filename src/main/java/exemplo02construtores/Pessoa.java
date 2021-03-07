package exemplo02construtores;

/**
 *
 * @author tharlys
 */
public class Pessoa {
    
    private String nome;
    private byte idade;
    private double peso, altura;

    
    public Pessoa(String nome, byte idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, byte idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
