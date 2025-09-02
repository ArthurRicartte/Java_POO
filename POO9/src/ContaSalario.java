import java.time.LocalDate;

//Implementando uma subclasse de ContaBancaria (Heranca):
public class ContaSalario extends ContaBancaria{
    private int mesUltimoSaque = 0;

    //Construtor da classe:
    public ContaSalario(String titular,double saldo){
        super(titular, saldo);
    }

    //Funcao que auxilia a realizar o saque:
    public void sacando(double valor){
        //Caso o saldo seja igual a zero ou menor que zero, ou o saldo seja menor que o valor que queira sacar -> impossivel sacar algo:
        if (saldo < 0 || saldo == 0 || saldo < valor){
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else if (saldo > 0) {
            //Caso a conta tenha saldo suficiente para realizar o saque:
            saldo -= valor;
            exibirInfo();
            System.out.printf("Saque de R$ %.2f Realizado com sucesso.\n", valor);
        }
    }

    //Rescrevendo as funcoes abstratas da super classe:
    @Override
    public void exibirInfo(){
        System.out.println("------Caixa Eletronico------");
        System.out.printf("Titular da conta: %s\nTipo da conta: Salario\nSaldo Atual: R$ %.2f\n", getTitular(), getSaldo());
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
        //Pega o mes atual:
        int mesAtual = LocalDate.now().getMonthValue();

        //Se forem diferentes, significa que eh possivel realizar o saque (so um por mes)
        if (mesUltimoSaque != mesAtual){
            mesUltimoSaque = mesAtual;
            //Chamando funcao sacando:
            sacando(valor);
            return true;
        } else{
            exibirInfo();
            System.out.println("Nao eh possivel realizar o saque este mes.");
        }

        return false;
    }
}
