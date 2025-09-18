public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(String marca, String modelo, int ano, int qtdPortas){
        super(marca, modelo, qtdPortas);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public void acelerar(){
        System.out.println("Carro " + this.modelo + " acelerando");
    }

    @Override
    public void freiar(){
        System.out.println("Carro " + this.modelo + " freiando");
    }

    public void mostrarPortas(){
        System.out.println("Este carro tem " + this.qtdPortas + " portas");
    }
}
