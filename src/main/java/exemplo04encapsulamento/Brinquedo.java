package exemplo04encapsulamento;

/**
 *
 * @author tharlys
 */
public class Brinquedo {
    
    private String nome;
    private double valor;
    private double desconto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.length() < 5) {
            throw new Exception(
                    "Nome deve conter no mínimo 5 caracteres"
            );
        }

        if (nome.length() > 20) {
            throw new Exception(
                    "Nome deve conter no máximo 20 caracteres"
            );
        }
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws Exception{
        if (valor <= 0) {
            throw new Exception(
                    "Valor não pode ser negativo e nem 0"
            );
        }
        
        this.valor = valor;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
}
