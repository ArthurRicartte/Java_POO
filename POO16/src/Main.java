public class Main {
    public static void main(String[] args) {
        Consultorio hapvida = new Consultorio();
        Pasciente arthur = new Pasciente("Arthur", 78594548, "123.344.545-56", 112, new Prontuario());

        Recepcionista maria = new Recepcionista("Maria let", 923382, "123.323.233-33", "äw212", "Geral");
        Recepcionista cris = new Recepcionista("Crislandia", 827121, "12.32.44.3-2", "crqw1212", "Infantil");

        Medico heitor = new Medico("Heitor", 923022, "121212.12-12", 1112, "Gastro");
        Medico luna = new Medico("Luna", 202565, "834.232.343-4", 1111, "Pediatria");


        arthur.addProntuario("18/09/2025", heitor, "Se cagou esperando o jogo de flamengo");
        arthur.addProntuario("30/09/2023", luna, "Sentiu calafrios na barriga");

        hapvida.cadastrarPasciente(arthur);
        hapvida.cadastrarRecepcionista(maria);
        hapvida.cadastrarRecepcionista(cris);
        hapvida.cadastrarMedico(heitor);
        hapvida.cadastrarMedico(luna);

        hapvida.listaPascientes();
        hapvida.listaRecepcionistas();
        hapvida.listaMedicos();

    }
}