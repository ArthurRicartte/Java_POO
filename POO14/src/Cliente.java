public class Cliente extends  Pessoa{

    private String chavePix;

    public Cliente(String nome, String cpf, String dataNascimento, String chavePix){
        super(nome, cpf, dataNascimento);
        this.chavePix = chavePix;
    }

    //Encapsulamento:

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }
}

