//CDB eh um AtivoFinanceiro -> Heranca
public class CDB extends AtivoFinanceiro{
    //Construtor da classe:
    public CDB(String nome, double valorInvestido){
        super(nome, valorInvestido);
    }

    //Sobrescrevendo Metodos:
    @Override
    public void exibirInfo(){
        System.out.println("------------------------------------------------");
        System.out.printf("Tipo: CDB\nNome: %s\nValor inicial investido: R$ %.2f\n", getNome(), getValorInvestido());
    }

    @Override
    public void calcularRetorno(int meses){
        //Basicamente, a funcao faz uma estimativa de acordo com o tempo passado de quanto valera o ativo (por meio de juros compostos)
        double valorAposRetorno = getValorInvestido() * Math.pow((1 + 0.04), meses);
        exibirInfo();
        System.out.printf("Valor apos %d meses: R$ %.2f\n", meses, valorAposRetorno);
    }

    @Override
    public void podeResgatar(double valor, int meses){

        //Calcula quanto valera o ativo com base no parametro meses.
        double valorEsperado = getValorInvestido() * Math.pow((1 + 0.04), meses);

        //Aqui, ve se eh possivel resgatar (nao tem como resgatar 1 milhao se o ativo so rendera 700 mil - exemplo)
        if (valor > valorEsperado){
            exibirInfo();
            System.out.printf("Nao eh possivel resgatar o valor, pois ele utrapassa o valor do investimento de %d meses", meses);

        } else if (valor >= valorEsperado /2){//Nao pode resgatar se o valor for maior ou igual que 50% do rendimento:
            exibirInfo();
            System.out.printf("Nao eh possivel resgatar o valor, pois ele é maior/igual que metade valor(R$ %.2f) do " +
                    "investimento de %d meses\n",(0.5*valorEsperado), meses);

        } else if (valor < valorEsperado){//Ativo pode ser resgatado
            exibirInfo();
            System.out.printf("Eh possivel sacar R$ %.2f em %d meses", valor, meses);

        }else {
            exibirInfo();
            System.out.println("ERROR");
        }

    }
}
