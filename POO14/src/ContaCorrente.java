public class ContaCorrente implements  OperacoesBancarias{

    private double saldo;
    private Cliente cliente;

    public ContaCorrente(double saldo, Cliente cliente){
        this.saldo = saldo;
        this.cliente = cliente;
    }

    //Encapsulamento:
    public Cliente getCliente() {
        return cliente;
    }

    //Rescrevendo metodos de Operacoes Bancarias
    @Override
    public void exibirInfo(String operacao, double valor){
        System.out.println("--------------------------------------");
        System.out.println("Nome: " + getCliente().getNome());
        System.out.println("CPF: " + getCliente().getCpf());
        System.out.println("Data de nascimento: " + getCliente().getDataNascimento() );
        System.out.println("Chave pix: " + getCliente().getChavePix());
        System.out.println("Operacao : " + operacao);
        System.out.printf("Valor do %s: R$ %.2f\n", operacao, valor);
        System.out.printf("Saldo bancario apos operacao: R$ %.2f\n", retornarSaldoAtual());
        System.out.println("--------------------------------------");
    }

    @Override
    public boolean depositar(double valor){
        //Caso tente depositar um valor negativo ou 0
        if (valor <= 0){
            System.out.println("Deposito invalido.");
            return false;
        }else{
            //Deposito de um valor positivo
            this.saldo += valor;
            System.out.println("Deposito realizado!");
            exibirInfo("Deposito", valor);
            return true;
        }
    }

    @Override
    public boolean sacar(double valor){
        //Caso valor seja maior que o saldo e saldo seja negativo, nao deixa sacar
        if (valor > this.saldo && this.saldo <= 0){
            System.out.println("Saque bloqueado");
            return false;
        }

        //Saque pode ser realizado
        this.saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
        exibirInfo("Saque", valor);
        return true;

    }

    @Override
    public double retornarSaldoAtual(){
        return this.saldo;
    }
}
