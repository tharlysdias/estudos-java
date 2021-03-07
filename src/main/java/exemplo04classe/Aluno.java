package exemplo04classe;

/**
 *
 * @author tharlys
 */
public class Aluno {
    
    public String nome;
    public int codigo;
    
    // Metodo com retorno do tipo double
    // Com três parâmetros: nota1, nota2, nota3. São passados para o calculo
    // Parâmetro serve para passar informações de fora para dentro do metodo
    // Parâmetros são informações obrigatorias para o metodo poder funcionar
    public double calcularMedia(double nota1, double nota2, double nota3) {
        
        double somatoria = nota1 + nota2 + nota3;
        double media = somatoria / 3;
        return media;
    }
    
}
