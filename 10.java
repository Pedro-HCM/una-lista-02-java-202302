import java.util.Scanner;

public class Medias{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double n3 = scanner.nextDouble();

        scanner.close();

        double mediaA = (n1 + n2 + n3) / 3.0;

        double mediaH = 3.0 / ((1.0 / n1) + (1.0 / n2) + (1.0 / n3));

        double mediaG = Math.cbrt(n1 * n2 * n3);

        System.out.println("Média Aritmética: " + mediaA);
        System.out.println("Média Harmônica: " + mediaH);
        System.out.println("Média Geométrica: " + mediaG);
    }
}
