import java.util.Scanner;

public class mAritimetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Informe um número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Informe outro número: ");
        double numero2 = scanner.nextDouble();

        scanner.close();
        double media = (numero1 + numero2) / 2;

        System.out.println("A média aritmética é: " + media);
    }
}
