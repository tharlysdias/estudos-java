package tiposprimitivos;

/**
 *
 * @author tharlys
 */
public class NumerosInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte idade = 32; // -128 até 127
        short batimentosDiarios = 31768; // -32768 até 32767
        int batimentosSemanais = 2_100_768; // || 2100768 - 2 milhões
        long batimentosAnuais = 3_976_732_100L; // mais de 2 milhões
        
        short anoAtual = 2018; // 1500 até 2100
        
        System.out.println("Idade: " + idade);
        System.out.println("Batimentos Diários: " + batimentosDiarios);
        System.out.println("Batimentos Semanais: " + batimentosSemanais);
        System.out.println("Batimentos Anuais: " + batimentosAnuais);
        System.out.println("Ano atual: " + anoAtual);
        
        
    }
    
}
