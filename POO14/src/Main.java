public class Main {
    public static void main(String[] args) {
        BancoController banco = new BancoController();

        Cliente heitor = new Cliente("Heitor", "123.456.789.09", "07/07/2000", "Heitor@gmail.com");
        ContaCorrente contaHeitor = new ContaCorrente(33000, heitor);

        Cliente arthur = new Cliente("Arthur Ricartte", "102.343.567.56", "07/07/2006", "arthur@gmail.com");
        ContaCorrente contaArthur = new ContaCorrente(20000, arthur);

        banco.cadastrarConta(contaHeitor);
        banco.cadastrarConta(contaArthur);

        banco.fazerPix(contaHeitor, 10000, "arthur@gmail.com");

        System.out.println("Testando erros");
        banco.fazerPix(contaHeitor, 0, "arthur@gmail.com");

        System.out.println("Terceiro teste");
        banco.fazerPix(contaHeitor, 120, "chave");
    }
}