public class Main {
    public static void main(String[] args) {
        ContaCorrente cliente1 = new ContaCorrente("Arthur", 12000);
        ContaPoupanca cliente2 = new ContaPoupanca("Joao Neto", 4000);
        ContaSalario cliente3 = new ContaSalario("Pessoa",1234);

        cliente1.depositar(100);
        cliente1.sacar(4000);

        cliente2.depositar(1000);
        cliente2.sacar(9000);

        cliente3.sacar(12);

    }
}