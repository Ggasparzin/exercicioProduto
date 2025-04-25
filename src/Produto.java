public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: %.2f", preco);
        System.out.println("\nQuantidade\n " + quantidade);
    }
    public void calcularTotal(){
        double total = 0;
        for(int i = 0; i < 2; i++){
            total += quantidade * preco;
        }
        System.out.println("Total: " + total);

    }
}
