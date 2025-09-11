public class Nota {
    //Atributos
    private boolean notaQualificada;
    private String nome;
    private Double nota;

    //Construtor
    public Nota(String nome, double nota, boolean notaQualificada){
        this.nome = nome;
        this.nota = nota;
        this.notaQualificada = notaQualificada;
    }

    //Encapsulamento
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }

    public void setNotaQualificada(boolean notaQualificada) {
        this.notaQualificada = notaQualificada;
    }

    public boolean getNotaQualificada(){
        return this.notaQualificada;
    }

    //Exibir informacoes
    public void exibirInfo(){
        System.out.println("Nome:" + getNome());
        System.out.println("Nota:" + getNota());
        System.out.println("Nota pode ser cadastrada? " + getNotaQualificada());
        System.out.println("----------------------------------");
    }

}
