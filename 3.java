import java.util.Scanner;

public class cTemp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura que gostaria de converter: ");
        double fah = scanner.nextDouble();
        scanner.close();

        double cel = (fah - 32) * 5.0/9.0;

        System.out.println("A temperatura fahrenheit em graus Celsius é: " + cel);
    }
}
