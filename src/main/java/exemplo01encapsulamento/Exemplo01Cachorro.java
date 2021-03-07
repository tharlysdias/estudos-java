package exemplo01encapsulamento;

/**
 *
 * @author tharlys
 */
public class Exemplo01Cachorro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cachorro dogao = new Cachorro();
        
        dogao.nome = "Pop";
        dogao.raca = "Labrador";
        dogao.peso = 100;
        dogao.quantidadeComida = 50;
        dogao.valor = 100_000.00;
    }
    
}
