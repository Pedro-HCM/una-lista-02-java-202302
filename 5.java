import java.util.Scanner;

public class SalarioBruto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de horas trabalhadas no mês: ");
        double hTrabalhadas = scanner.nextDouble();

        System.out.print("Informe o valor recebido por hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Informeo valor do salário família: ");
        double salario = scanner.nextDouble();

        System.out.print("Informe o número de filhos com idade menor que 14 anos: ");
        int Filhos = scanner.nextInt();

        scanner.close();

        double Bruto = (hTrabalhadas * valorHora) + (salario * Filhos);

        System.out.println("O total do salário bruto a ser recebido é: " + Bruto);
    }
}
