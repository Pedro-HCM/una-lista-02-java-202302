
public class pProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.close();

        double novoPreco = preco * 1.10;

        System.out.println("O preço do produto com 10% de acréscimo é = " + novoPreco);
    }
}
