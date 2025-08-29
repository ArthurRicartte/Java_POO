//Pessoa juridica é uma pessoa -> herança
public class PessoaJuridica extends Pessoa{
    private int funcionarios;

    //Construtor de pessoa fisica
    public PessoaJuridica(String nome, double rendaAnual, int funcionarios){
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    //Ambos os metodos abaixo estao sendo sobrescritos ->polimorfismo
    @Override
    public double calcularImposto(){
        //Verifica se a pessoa juridica tem mais de 10 funcionarios e calcula o imposto
        if (funcionarios > 10){
            return getRendaAnual() * 0.14;
        }

        //Retorna caso tenha menos que 10 funcionarios:
        return getRendaAnual() * 0.16;
    }

    @Override
    //Listar informacoes da pessoa:
    public void listarPessoa(){
        System.out.printf("---------Pessoa Juridica---------\nNome: %s\nRenda Anual: R$ %.2f\nFuncionarios: %d\nImposto pago: R$ %.2f\n"
                , getNome(), getRendaAnual(), this.funcionarios, calcularImposto());
        System.out.println("---------------------------------");
    }
}
