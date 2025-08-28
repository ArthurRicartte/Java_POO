public abstract class Funcionario {
    //Definindo Atributos:
    private String nome;
    private String matricula;
    private double salarioBase;

    //Construtor da classe:
    public Funcionario(String nome, String matricula, double salarioBase){
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    /*Como em algumas subclasses de Funcionario sera necessario pegar o
     salario base para calcular o salario do funcionario, criei getters
     para possibiliatar tal acao*/

    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }

    //Criando funcoes abstratas para serem sobrescritas pelas subclasses:
    public abstract double calcularSalario();
    public abstract void listarFuncionario();
}
