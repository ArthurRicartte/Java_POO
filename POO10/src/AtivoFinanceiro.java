public abstract class AtivoFinanceiro {
    private String nome;
    private double valorInvestido;

    //Construtor da classe:
    public AtivoFinanceiro(String nome, double valorInvestido){
        this.nome = nome;
        this.valorInvestido = valorInvestido;
    }

    //Getters e Setters:
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    //Metodos abstratos:
    public abstract void calcularRetorno(int mes);
    public abstract void podeResgatar(double valor, int meses);
    public abstract void exibirInfo();
}
