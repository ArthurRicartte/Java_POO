//Vendendor eh um funcionario da empresa -> Heranca
public class Vendedor extends Funcionario{
    //Vendendor tem comissao adicionada ao seu salario:
    private double comissao;

    //Construtor de Vendendor:
    public Vendedor(String nome, String matricula, double salarioBase, double comissao){
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    //Sobrescrevendo metodo calcularSalario() da superclasse (Polimorfismo):
    @Override
    public double calcularSalario(){
        return getSalarioBase() + this.comissao;
    }

    //Sobrescrevendo metodo listarFuncionario() da superclasse (Polimorfismo):
    @Override
    public void listarFuncionario(){
        System.out.println("-\n---Informacoes sobre o funcionario----");
        String msg = String.format("Nome: %s\nCargo: vendendor\nMatricula: %s" +
                "\nSalario Base: R$ %.2f\nComissao: R$ %.2f\nSalario do funcionario: R$ %.2f"
                , getNome(), getMatricula(), getSalarioBase(),this.comissao, calcularSalario());
        System.out.println(msg);
    }

}
