public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: %.2f", preco);
        System.out.println("\nQuantidade " + quantidade);
    }
    public void calcularTotal(){
        System.out.printf("Total: %.2f \n \n", quantidade * preco);
    }
}
