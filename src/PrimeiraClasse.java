public class PrimeiraClasse {

    public static void main(String args[]) {
        System.out.println("Olá, Alexandre");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        System.out.println(cliente.getEndereco());

    }
}
