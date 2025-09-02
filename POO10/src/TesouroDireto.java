//TesouroDireto eh um AtivoFinanceiro -> Heranca
public class TesouroDireto extends AtivoFinanceiro{
    //Construtor da classe:
    public TesouroDireto(String nome, double valorInvestido){
        super(nome, valorInvestido);
    }

    //Sobrescrevendo Metodos:
    @Override
    public void exibirInfo(){
        System.out.println("------------------------------------------------");
        System.out.printf("Tipo: Tesouro Direto\nNome: %s\nValor inicial investido: R$ %.2f\n", getNome(), getValorInvestido());
    }

    @Override
    public void calcularRetorno(int meses){
        //Basicamente, a funcao faz uma estimativa de acordo com o tempo passado de quanto valera o ativo (por meio de juros compostos)
        double valorAposRetorno = getValorInvestido() * Math.pow((1 + 0.03), meses);
        exibirInfo();
        System.out.printf("Valor apos %d meses: R$ %.2f\n", meses, valorAposRetorno);
    }

    @Override
    public void podeResgatar(double valor, int meses){

        //Basicamente, calcula quanto valera o ativo com base no parametro meses.
        double valorEsperado = getValorInvestido() * Math.pow((1 + 0.03), meses);

        //Aqui, ve se eh possivel resgatar (nao tem como resgatar 1 milhao se o ativo so rendera 700 mil - exemplo)
        if (valor > valorEsperado){
            exibirInfo();
            System.out.printf("Nao eh possivel resgatar o valor, pois ele utrapassa o valor do investimento de %d meses", meses);

        } else if (valor < valorEsperado){//Ativo pode ser resgatado
            exibirInfo();
            System.out.printf("Eh possivel sacar R$ %.2f em %d meses", valor, meses);

        }else {
            exibirInfo();
            System.out.println("ERROR");
        }

    }
}
