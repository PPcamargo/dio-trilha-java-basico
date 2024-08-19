import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        // Solicitando o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Lê um inteiro do terminal
        
        // Solicitando o segundo parâmetro
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Lê um inteiro do terminal
        
        try {
            // Chamando o método que realiza a contagem e impressão
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Capturando a exceção personalizada e imprimindo a mensagem
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validando se parametroUm é maior que parametroDois
        if (parametroUm > parametroDois) {
            // Lançando exceção personalizada se a validação falhar
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;

        // Realizando a contagem e impressão dos números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
