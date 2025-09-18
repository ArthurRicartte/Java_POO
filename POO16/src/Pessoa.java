public abstract class Pessoa {
    private String nome;
    private int telefone;
    private String cpf;

    public Pessoa(String nome, int telefone, String cpf){
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }
}
