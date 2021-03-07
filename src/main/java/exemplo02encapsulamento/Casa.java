package exemplo02encapsulamento;

/**
 *
 * @author tharlys
 */
public class Casa {
    
    /*
        Encapsulamento protected só são enchergados dentro do mesmo pacote, ou
        por uma classe que tem uma herança
    */
    
    // Comprimento, largura, valor, endereço
    protected double largura, comprimento, valor;
    protected String endereco;
    
    protected double retornarArea() {
        return largura * comprimento;
    }
}
