import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
        // Criação de um objeto Scanner para leitura dos dados no terminal e setando o teclado no padrão US
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitação e leitura do número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

       // Solicitação e leitura da agência
        System.out.println("Digite por favor o numero da Agência:");
        String agencia = scanner.nextLine();

        // Solicitação e leitura do nome do Cliente
        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();

        // Solicitação e leitura do saldo 
        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        scanner.close();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                          + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " Já está disponível para saque."; 
        System.out.println(mensagem);
    }
}
