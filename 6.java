import java.util.Scanner;

public class CalculoLog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número (base do logaritmo): ");
        double n2 = scanner.nextDouble();

        scanner.close();

        double result = Math.log(n1) / Math.log(n2);

        System.out.println("O logaritmo de " + n1 + " na base " + n2 + " é: " + result);
    }
}
