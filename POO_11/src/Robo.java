public class Robo implements Controle{
    private String nome;

    public Robo(String nome){
        this.nome = nome;
    }

    //Sobrescrevendo metodos da interface:
    public void andar(){
        System.out.printf("%s esta andando\n", this.nome.trim());
    }

    public void falar() {
        System.out.printf("%s esta falando\n", this.nome.trim());
    }

    public void gritar() {
        System.out.printf("%s esta gritando\n", this.nome.trim());
    }
}
