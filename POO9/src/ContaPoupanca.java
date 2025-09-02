public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String titular,double saldo){
        super(titular, saldo);
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void sacar(double valor){
        if (saldo < 0 || saldo < valor){
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else if (saldo > 0 || saldo > valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f Realizado com sucesso.\n", saldo);
        }
    }
}
