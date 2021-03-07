package exemplo04construtores;

/**
 *
 * @author tharl
 */
public class Funcionario {
    
    private String nome, cargo, descricao;
    private double salario, valorHora;

    /*
        É possível a criação de vários construtores, todavia, precisa observar 
        se o novo construtor não tem os mesmos tipos e mesma quantidade de 
        parametros (com tipos iguais) do construtor já criado
    
    */
    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public Funcionario(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
}
