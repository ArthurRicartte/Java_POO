public abstract class Pessoa {
    private String nome;
    private double rendaAnual;

    //Contrutor:
    public Pessoa(String nome, double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    //Getters e Setters:
    public void setRendaAnual(double rendaAnual){
        this.rendaAnual = rendaAnual;
    }

    public double getRendaAnual(){
        return this.rendaAnual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    //Metodos abstratos:
    public abstract double calcularImposto();
    public abstract void listarPessoa();

}
