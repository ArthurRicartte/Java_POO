public class Pasciente extends Pessoa{

    private int registro;
    private Prontuario prontuario;

    public Pasciente(String nome, int telefone, String cpf, int registro, Prontuario prontuario){
        super(nome, telefone, cpf);
        this.registro = registro;
        this.prontuario = null;
        this.prontuario = prontuario;
    }

    public void addProntuario(String data, Medico medicoResponsavel, String descricao){
        prontuario.cadastrarConsulta(data, medicoResponsavel, descricao);
    }

    public void exibirInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone:" + getTelefone());
        System.out.println("Cpf" + getCpf());
        prontuario.exibirProntuario();
    }
}
