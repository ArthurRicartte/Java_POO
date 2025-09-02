import java.time.LocalDate;

public class ContaSalario extends ContaBancaria{
    public ContaSalario(String titular,double saldo){
        super(titular, saldo);
    }

    public void sacando(double valor){
        if (saldo < 0 || saldo < valor){
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else if (saldo > 0 || saldo > valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f Realizado com sucesso.\n", saldo);
        }
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    int mesUltimoSaque = 0;
    @Override
    public void sacar(double valor){
        int mesAtual = LocalDate.now().getMonthValue();

        if (mesUltimoSaque != mesAtual){
            mesUltimoSaque = mesAtual;
            sacando(valor);
        } else{
            System.out.println("Nao eh possivel realizar o saque este mes.");
        }
    }
}
