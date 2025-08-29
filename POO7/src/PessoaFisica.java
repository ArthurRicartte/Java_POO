//Pessoa fisica é uma pessoa -> herança
public class PessoaFisica extends Pessoa {
    private double gastosSaude;

    //Construtor de pessoa fisica
    public PessoaFisica(String nome, double rendaAnual, double gastosSaude){
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    //Ambos os metodos abaixo estao sendo sobrescritos ->polimorfismo
    @Override
    public double calcularImposto(){
        /*PercentualSaude serve para armazenar 50% dos gastos com saude
        *que serao descontados na hora de calcular o imposto*/

        double percentualSaude = 0.0;
        double imposto = 0.0;

        //Verifica se houve gastos com saude:
        if (gastosSaude > 0){
            percentualSaude = this.gastosSaude * 0.5;
        }

        //Calcula o imposto com base na renda anual
        if (getRendaAnual() <= 20000){
            return (getRendaAnual() * 0.15 - percentualSaude);
        }

        //Retorna caso receba mais de 20 mil reais por ano:
        return getRendaAnual() * 0.25 - percentualSaude;
    }

    @Override
    //Listar informacoes da pessoa:
    public void listarPessoa(){
        System.out.printf("----------Pessoa Fisica----------\nNome: %s\nRenda Anual: R$ %.2f\nGastos com Saude: R$ %.2f\nImposto pago: R$ %.2f\n"
                , getNome(), getRendaAnual(), this.gastosSaude, calcularImposto());
        System.out.println("---------------------------------");
    }
}
