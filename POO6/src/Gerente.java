//Gerente eh um funcionario da empresa -> Heranca
public class Gerente extends Funcionario{

    //Construtor de gerente:
    public Gerente(String nome, String matricula, double salarioBase){
        super(nome, matricula, salarioBase);
    }

    //Sobrescrevendo metodo calcularSalario() da superclasse (Polimorfismo):
    @Override
    public double calcularSalario(){
        return (getSalarioBase() * 2);
    }

    //Sobrescrevendo metodo listarFuncionario() da superclasse (Polimorfismo):
    @Override
    public void listarFuncionario(){
        System.out.println("\n----Informacoes sobre o funcionario----");
        String msg = String.format("Nome: %s\nCargo: Gerente\nMatricula: %s" +
                        "\nSalario Base: R$ %.2f\nSalario do funcionario: R$ %.2f"
                , getNome(), getMatricula(), getSalarioBase(), calcularSalario());
        System.out.println(msg);
    }
}
