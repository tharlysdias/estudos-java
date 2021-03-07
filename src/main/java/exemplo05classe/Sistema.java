package exemplo05classe;

import java.util.Scanner;

/**
 *
 * @author tharlys
 */
public class Sistema {
    
    ContaBancaria contaBancaria = new ContaBancaria();
    Scanner leitor = new Scanner(System.in);
    
    public void GerenciarMenu() {
        ApresentarMenu();
        int opcao = SolicitarOpcaoMenu();
        while (opcao != 6) {            
            ApresentarMenu();
            opcao = SolicitarOpcaoMenu();
        }
        System.out.println("Obrigado por utilizar o sistema!");
    }
    
    public void ApresentarMenu() {
        System.out.println(
                "\nBem-vindo ao ProBank\n"
                + "\n0 - Saldo"
                + "\n1 - Informações Básicas"
                + "\n2 - Saque"
                + "\n3 - Depósito"
                + "\n4 - Pagamento"
                + "\n5 - Extrato"
                + "\n6 - Sair"
        );
    }
    
    public int SolicitarOpcaoMenu() {
        int opcao = Integer.parseInt(leitor.nextLine());
        CoordenarMenu(opcao);
        return opcao;
    }
    
    public void CoordenarMenu(int opcao) {
        switch(opcao) {
            case 0:
                ApresentarSaldo();
                break;
            case 1:
                SolicitarInformacoesBasicas();
                break;
            case 2:
                Sacar();
                break;
            case 3:
                Depositar();
                break;
            case 4:
                PagarConta();
                break;
            case 5:
                ApresentarExtrato();
                break;
            case 6:
                break;
            default:
                System.out.println("Opção inválida! Digite uma opção válida");
        }
    }
    
    public void SolicitarInformacoesBasicas() {
        System.out.println("Nome: ");
        contaBancaria.cliente = leitor.nextLine();
        
        System.out.println("Número: ");
        contaBancaria.numero = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Informações básicas alteradas com sucesso!");
    }
    
    public void Sacar() {
        System.out.println("Valor a ser sacado: R$ ");
        String valorTexto = leitor.nextLine();
        valorTexto = valorTexto.replace(',', '.');
        double valorSaque = Double.parseDouble(valorTexto);
        
        contaBancaria.Sacar(valorSaque);
    }
    
    public void Depositar() {
        System.out.println("Valor a ser depositado: R$ ");
        double valorDeposito = Double.parseDouble(leitor
                .nextLine().replace(',', '.'));
        contaBancaria.Depositar(valorDeposito);
    }
    
    public void PagarConta() {
        System.out.println("Nome da conta: ");
        String nomeConta = leitor.nextLine();
        
        System.out.println("Valor: R$ ");
        boolean contaPaga = contaBancaria
                .PagarConta(nomeConta, Double
                        .parseDouble(leitor.nextLine().replace(',', '.')));
        
        if (contaPaga) {
            System.out.println("Conta paga com sucesso!");
        } else {
            System.out.println("Não foi possível pagar a conta!");
        }
    }
    
    public void ApresentarExtrato() {
        contaBancaria.ApresentarExtrato();
    }
    
    public void ApresentarSaldo() {
        System.out.println("Saldo: R$ " + contaBancaria.saldo);
    }
}
