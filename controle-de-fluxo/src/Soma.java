import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler os dois valores inteiros
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // Calcular a soma
        int X = A + B;
        
        // Imprimir o resultado no formato especificado
        System.out.println("X = " + X);
        
        // Fechar o scanner
        scanner.close();
    }
}