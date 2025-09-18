public class Medico extends  Pessoa{
    private int crm;
    private String especializacao;

    public Medico(String nome, int telefone, String cpf, int crm, String especializacao){
        super(nome, telefone, cpf);
        this.crm = crm;
        this.especializacao = especializacao;
    }

    public void exibirInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone:" + getTelefone());
        System.out.println("Cpf" + getCpf());
        System.out.println("Crm: " + this.crm);
        System.out.println("Especializacao: " + this.especializacao);
        System.out.println("-----------------------------------------------------------");
    }
}
