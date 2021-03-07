package exemplo03classe;

/**
 *
 * @author tharlys
 */
public class Exemplo03Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Instanciando um objeto da classe Funcionario
        Funcionario pedro = new Funcionario();
        
        pedro.nome = "Pedro da Silva";
        pedro.idade = 17;
        pedro.valorHora = 10;
        pedro.quantidadeHorasTrabalhadas = 150;
        pedro.descontos = 150.00;
        pedro.acrescimos = 0;
        
        double salarioBruto = pedro.calcularSalarioBruto();
        double salarioLiquido = pedro.calcularSalarioLiquido();
        
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Salário Liquido: " + salarioLiquido);
        
    }
    
}
