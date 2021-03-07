package exemplo02encapsulamento;

/**
 *
 * @author tharlys
 */
public class Exemplo02Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Casa casaVermelha = new Casa();
        
        casaVermelha.comprimento = 10.30;
        casaVermelha.largura = 3.45;
        casaVermelha.valor = 350_000.00;
        casaVermelha.endereco = "Rua XV de novembro 279";
        
        System.out.println(casaVermelha.retornarArea());
        
    }
    
}
