import java.util.Scanner;

public class ConversaoSegun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de segundos: ");
        int segundos = scanner.nextInt();

        scanner.close();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundos = segundos % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
