import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto chocolate = new Produto ("Chocolate", 12.30, 400);
        Produto picanha = new Produto ("Picanha", 999.99, 30);

        chocolate.exibirDetalhes();
        chocolate.calcularTotal();

        picanha.exibirDetalhes();
        picanha.calcularTotal();

    }
}