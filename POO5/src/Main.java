public class Main{
    public static void main(String[] args){
        ControleProduto estoque = new ControleProduto();
        estoque.cadastrarProdutos("nescau", 20, 5.50);
        estoque.cadastrarProdutos("pao", 122323, 2.00);
        estoque.listaProdutos();
    }
}