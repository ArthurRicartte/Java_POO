public class Recepcionista extends Pessoa{
    private  String codFuncionario;
    private String areaAtendimento;

    public Recepcionista(String nome, int telefone, String cpf, String codFuncionario, String areaAtendimento){
        super(nome, telefone, cpf);
        this.codFuncionario = codFuncionario;
        this.areaAtendimento = areaAtendimento;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone:" + getTelefone());
        System.out.println("Cpf" + getCpf());
        System.out.println("Codigo de Funcionario: " + this.codFuncionario);
        System.out.println("Area antendimento: " + this.areaAtendimento);
        System.out.println("-----------------------------------------------------------");
    }
}
