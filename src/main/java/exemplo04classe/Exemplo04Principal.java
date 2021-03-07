package exemplo04classe;

/**
 *
 * @author tharlys
 */
public class Exemplo04Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aluno joao = new Aluno();
        
        joao.codigo = 12000;
        joao.nome = "João";
        
        double media = joao.calcularMedia(6.5, 8, 7.5);
        System.out.println("Média do joão: " + media);
        
    }
    
}
