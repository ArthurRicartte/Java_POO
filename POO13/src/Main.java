import java.util.*;

public class Main {
    public static void dadosFrota(List<Veiculo> frota){
        Iterator<Veiculo> it = frota.iterator();

        while (it.hasNext()){
            Veiculo veiculo = it.next();
            veiculo.acelerar();
            veiculo.freiar();
        }
    }

    public static void main(String[] args) {
        List<Veiculo> frota = new ArrayList<Veiculo>();

        Carro porche = new Carro("Porche", "panamera", 2025, 4 );
        Moto kawasaki = new Moto("Kawasaki", "Ninja", 2017, 90);

        frota.add(porche);
        frota.add(kawasaki);

        dadosFrota(frota);
    }
}