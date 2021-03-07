package exemplo03classe;

/**
 *
 * @author tharlys
 */
public class Funcionario {
    
    public String nome;
    public int idade;
    public double valorHora;
    public int quantidadeHorasTrabalhadas;
    public double descontos;
    public double acrescimos;
    
    // Metodo que vai retornar um double
    public double calcularSalarioBruto() {
        double salarioBruto = quantidadeHorasTrabalhadas * valorHora;
        return salarioBruto;
    }
    
    public double calcularSalarioLiquido() {
        // Chama o outro metodo (calcularSalarioBruto)
        double salarioBruto = calcularSalarioBruto();
        double salarioLiquido = salarioBruto + acrescimos - descontos;
        return salarioLiquido;
    }
}
