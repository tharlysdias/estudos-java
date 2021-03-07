package exemplo05classe;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tharlys
 */
public class ContaBancaria {
    
    public String cliente;
    public int numero;
    public double saldo;
    public String historico = "";
    
    // Saque
    public void Sacar(double valorSaque) {
        if (valorSaque > saldo) {
            System.out.println(
                    "Não foi possível sacar, "
                            + "pois o valor a ser sacado é maior que o saldo");
            return;
        }
        
        // Subtrai do saldo o valor de saque
        // \t: tabulação (formatação)
        saldo -= valorSaque;
        historico += "Saque \t\t\t\t" + RetornarDataHoraAtual() + "\t\t R$ " 
                + valorSaque + "\n";
    }
    
    // Deposito
    public void Depositar(double valorDeposito) {
        saldo += valorDeposito;
        historico += "Depósito\t\t\t" + RetornarDataHoraAtual() + "\t\t R$ " 
                + valorDeposito + "\n";
    }
    
    // Pagar conta
    public boolean PagarConta(String nome, double valor) {
        if (valor > saldo) {
            return false;
        }
        
        saldo -= valor;
        historico += "Pagamento da " + nome + "\t" + RetornarDataHoraAtual() 
                + "\t\t R$ " + valor + "\n";
        return true;
    }
    
    // Metodo que retorna a data e hora atual no padrão brasileiro
    public String RetornarDataHoraAtual() {
        return LocalDateTime
                .now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
    }
    
    // ApresentarExtrato
    public void ApresentarExtrato() {
        System.out.println(
                "\nCliente: " + cliente 
                + "\nConta: " + numero
                + "\nData do extrato: " + RetornarDataHoraAtual() 
                + "\nExtrato:\n\n"
        );
        System.out.println(historico);
    }
    
}
