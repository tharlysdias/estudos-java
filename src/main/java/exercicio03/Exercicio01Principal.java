package exercicio03;

/**
 *
 * @author tharlys
 */
public class Exercicio01Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cachorro lupi = new Cachorro();
        lupi.setNome("Lupi");
        lupi.setRaca("Yorkshire");
        lupi.setPeso(3.5);
        lupi.setIdade(2);
        
        Cachorro buggi = new Cachorro();
        buggi.setNome("Buggi");
        buggi.setRaca("Pug");
        buggi.setPeso(3.0);
        buggi.setIdade(3);
        
        System.out.println(
                "Nome: " + lupi.getNome()
                + "\nRaça: " + lupi.getRaca()
                + "\nPeso: " + lupi.getPeso()
                + "\nIdade: " + lupi.getIdade()
                + "\n"
                + "\nNome: " + buggi.getNome()
                + "\nRaça: " + buggi.getRaca()
                + "\nPeso: " + buggi.getPeso()
                + "\nIdade: " + buggi.getIdade()
        );
        
        // Verifica o tamanho do nome
        if (lupi.getNome().length() > buggi.getNome().length()) {
            System.out.println("\n\n" + lupi.getNome() 
                    + " contém o maior nome com " 
                    + lupi.getNome().length() + " caracteres"
            );
        } else {
            System.out.println("\n\n" + buggi.getNome() 
                    + " contém o maior nome com " 
                    + buggi.getNome().length() + " caracteres"
            );
        }
        
        // Verifica qual é o mais velho
        if (lupi.getIdade() > buggi.getIdade()) {
            System.out.println(lupi.getNome() + " é o mais velho");
        } else {
            System.out.println(buggi.getNome() + " é o mais velho");
        }
        
        // Verifica qual é o mais pesado
        if (lupi.getPeso() > buggi.getPeso()) {
            System.out.println(lupi.getNome() + " é o mais pesado");
        } else {
            System.out.println(buggi.getNome() + " é o mais pesado");
        }
    }
    
}
