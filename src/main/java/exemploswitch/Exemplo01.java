package exemploswitch;

/**
 *
 * @author tharlys
 */
public class Exemplo01 {
    
    public static void main(String[] args) {
        
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Editar");
        System.out.println("3 - Listar");
        System.out.println("4 - Apagar");
        byte opcao = 1;
        
        switch (opcao) {
            case 1:
                System.out.println("Bem vindo ao Cadastro");
                break;
            case 2:
                System.out.println("Bem vindo a edição");
                break;
            case 3:
                System.out.println("Bem vindo a Lista");
                break;
            case 4:
                System.out.println("Bem vindo a parte para Excluir");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        
    }
}
