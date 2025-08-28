public class Produto {
    private String nome;
    private  int quantidade;
    private double preco;


    //Criando construtores:
    public Produto(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto(){
        this.nome = null;
        this.quantidade = 0;
        this.preco = 0.0;
    }

    //Geters e Seters:
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return  this.nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //Criando metodos pedidos pela questao:
    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }

    public boolean reduzirEstoque(int quantidade){
        if (this.quantidade > 0){
            this.quantidade -= quantidade;
            return  true;
        }

        return false;
    }

    public void exibeInfo(){
        String msg = String.format("Informacoes sobre o produto:\n" +
                "Nome: %s\nPreco (por unidade): R$ %.2f\nQuantidade em estoque: %d" +
                "\n---------------------------------------", this.nome, this.preco, this.quantidade);

        System.out.println(msg);
    }

}
