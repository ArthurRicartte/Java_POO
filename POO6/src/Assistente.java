//Assistente eh um funcionario da empresa -> Heranca
public class Assistente extends Funcionario {

    //Construtor de Assistente:
    public Assistente(String nome, String matricula, double salariobase){
        super(nome, matricula, salariobase);
    }
    //Sobrescrevendo metodo calcularSalario() da superclasse (Polimorfismo):
    @Override
    public double calcularSalario(){
        return getSalarioBase();
    }

    //Sobrescrevendo metodo listarFuncionario() da superclasse (Polimorfismo):
    @Override
    public void listarFuncionario(){
        System.out.println("\n----Informacoes sobre o funcionario----");
        String msg = String.format("Nome: %s\nCargo: Assistente\nMatricula: %s" +
                        "\nSalario Base: R$ %.2f\nSalario do funcionario: R$ %.2f"
                , getNome(), getMatricula(), getSalarioBase(), calcularSalario());
        System.out.println(msg);
    }
}
