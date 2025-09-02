public abstract class ContaBancaria {
    private String titular;
    protected double saldo;

    //Construtor da classe:
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    //Getters e Setters:
    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    //Metodos abstratos
    public abstract boolean depositar(double valor);
    public abstract boolean sacar(double valor);
    public abstract void exibirInfo();
}
