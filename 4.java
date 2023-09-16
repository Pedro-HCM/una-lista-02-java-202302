import java.util.Scanner;

public class CalculoJuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do capital a ser aplicado: ");
        double capital = scanner.nextDouble();
        
        System.out.print("Digite o prazo de aplicação em meses: ");
        int prazoMeses = scanner.nextInt();
        
        System.out.print("Digite a taxa de juros mensal (em decimal): ");
        double taxaJuros = scanner.nextDouble();
        
        scanner.close();
        
        double montante = capital * Math.pow((1 + taxaJuros), prazoMeses);
        
        System.out.println("O montante a ser recebido é: " + montante);
    }
}
