public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas){
        super(marca, modelo, cilindradas);
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar(){
        System.out.println("Moto " + this.modelo + " acelerando");
    }

    @Override
    public void freiar(){
        System.out.println("Moto " + this.modelo + " freiando");
    }

    public void mostrarPortas(){
        System.out.println("Esta moto tem " + this.cilindradas + " cilindradas");
    }
}
