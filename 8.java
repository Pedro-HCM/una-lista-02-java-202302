import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de veículos: ");
        int totalVeiculos = scanner.nextInt();

        System.out.print("Digite o total de rodas: ");
        int totalRodas = scanner.nextInt();

        scanner.close();

        // Suponha que cada carro tenha 4 rodas e cada moto tenha 2 rodas
        int rodasCarros = 4 * totalCarros(totalVeiculos, totalRodas);
        int rodasMotos = 2 * totalMotos(totalVeiculos, totalRodas);

        System.out.println("Quantidade de carros no estacionamento: " + totalCarros(totalVeiculos, totalRodas));
        System.out.println("Quantidade de motos no estacionamento: " + totalMotos(totalVeiculos, totalRodas));
    }

    public static int totalCarros(int totalVeiculos, int totalRodas) {
    
        return (totalRodas - (2 * totalVeiculos)) / 2;
    }

    public static int totalMotos(int totalVeiculos, int totalRodas) {
    
        return totalVeiculos - totalCarros(totalVeiculos, totalRodas);
    }
}

