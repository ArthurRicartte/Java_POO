public class Gerente extends Pessoa{

    private int codigoGerente;
    private String cargo;
    private  String alocacao;

    public Gerente(String nome, String cpf, String dataNascimento, int codigoGerente, String cargo, String alocacao){
        super(nome, cpf, dataNascimento);
        this.codigoGerente = codigoGerente;
        this.cargo = cargo;
        this.alocacao = alocacao;
    }

    //Encapsulamento:
    public void setCodigoGerente(int codigoGerente) {
        this.codigoGerente = codigoGerente;
    }

    public int getCodigoGerente() {
        return codigoGerente;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setAlocacao(String alocacao) {
        this.alocacao = alocacao;
    }

    public String getAlocacao() {
        return alocacao;
    }

}
