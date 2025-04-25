import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        String cadastro;
        Produto p = null;

        do {
            System.out.println("Quantos produtos você quer cadastrar? ");
            int quantidadeProdutos = scan.nextInt();
            scan.nextLine();

            for(int i = 0; i < quantidadeProdutos; i++) {
                Produto produto = new Produto();
                System.out.println("Digite o nome do produto: ");
                produto.nome = scan.nextLine();

                System.out.println("Digite o preço do produto: ");
                produto.preco = scan.nextDouble();

                System.out.println("Digite a quantidade do produto: ");
                produto.quantidade = scan.nextInt();
                scan.nextLine();
                produtos.add(produto);
            }

            System.out.println("Deseja cadastrar outro produto? ");
            cadastro = scan.next();
            scan.nextLine();
        }
        while (cadastro.equalsIgnoreCase("Sim"));

        for(int i = 0; i < produtos.size(); i++){
            p = produtos.get(i);
            p.exibirDetalhes();
        }
        p.calcularTotal();

    }
}