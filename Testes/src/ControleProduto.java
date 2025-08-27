public class ControleProduto {
    private Produto[] produtos;
    private int totalProdutos;

    public ControleProduto(){
        produtos = new Produto[10];
        totalProdutos = 0;
    }

    public void cadastrarProdutos(String nome, int quantidade, double preco){
        Produto p = new Produto(nome, quantidade, preco);

        for (int i = 0; i < this.produtos.length; i++){
            if (this.produtos[i] == null){
                this.produtos[i] = p;
                totalProdutos++;
                break;
            }
        }
    }

    public boolean efetuarVenda(String nome, int quantidade){
        boolean resultado;

        for (int i = 0; i < this.produtos.length; i++){
            if (this.produtos[i] == null){
                continue;
            } else if (this.produtos[i].getNome().equalsIgnoreCase(nome)){
                resultado = this.produtos[i].reduzirEstoque(quantidade);

                if (resultado){
                    System.out.println("Venda realizada com sucesso! Volte sempre.");
                    return resultado;
                }else{
                    System.out.println("Venda nao pode ser realizada!");
                    return  resultado;
                }
            }
        }
        System.out.println("Produto nao encontrado!");
        return false;
    }

    public void listaProdutos(){
        for (Produto produto : produtos){
            if (produto != null){
                produto.exibeInfo();
            }
        }
    }

}
