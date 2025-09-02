//Implementando uma subclasse de ContaBancaria (Heranca):
public class ContaPoupanca extends ContaBancaria{
    //Construtor da classe:
    public ContaPoupanca(String titular,double saldo){
        super(titular, saldo);
    }

    //Rescrevendo as funcoes abstratas da super classe:
    @Override
    public void exibirInfo(){
        System.out.println("------Caixa Eletronico------");
        System.out.printf("Titular da conta: %s\nTipo da conta: Poupanca\nSaldo Atual: R$ %.2f\n", getTitular(), getSaldo());
    }

    @Override
    public boolean depositar(double valor){
        //Caso tente depositar 0 reias ou um numero negativo:
        if (valor < 0 || valor == 0){
            exibirInfo();
            System.out.println("Deposito impossóvel de ser feito");
            return false;
        }
        //Ocorrera caso deposite um numero positivo:
        saldo += valor;
        exibirInfo();
        System.out.printf("Deposito de %.2f relizado com sucessso.\n", valor);
        return true;
    }

    @Override
    public boolean sacar(double valor){
        //Caso o saldo seja igual a zero ou menor que zero -> impossivel sacar algo:
        if (saldo < 0 || saldo == 0 || saldo < valor){
            exibirInfo();
            System.out.println("Saldo insuficiente para realizar o saque.");
            return false;
        } else if (saldo > 0) {
            //Ocorrera caso a conta tenha saldo possitivo:
            saldo -= valor;
            exibirInfo();
            System.out.printf("Saque de R$ %.2f Realizado com sucesso.\n", valor);
        }

        return true;
    }
}
