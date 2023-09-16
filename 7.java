import java.util.Scanner;

public class Vendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioF = scanner.nextDouble();

        System.out.print("Digite o valor total das vendas no mês: ");
        double Vendas = scanner.nextDouble();

        System.out.print("Digite o percentual de comissão sobre as vendas : ");
        double Comissao = scanner.nextDouble();

        scanner.close();

        double salarioT = salarioF + (Vendas * Comissao);

        System.out.println("O salário total do vendedor é: " + salarioT);
    }
}
