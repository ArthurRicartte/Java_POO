//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarteiraInvestimentos carteirinha = new CarteiraInvestimentos();

        carteirinha.adicionarAtivo(new Acao("pet", 78000));
        carteirinha.adicionarAtivo(new CDB("peb233", 340033));
        carteirinha.adicionarAtivo(new TesouroDireto("junir", 79960));
        carteirinha.adicionarAtivo(new CDB("polar tang", 444594));
        carteirinha.adicionarAtivo(new Acao("peqa", 6789));
        carteirinha.adicionarAtivo(new Acao("dabsr", 6789));

        carteirinha.listarCarteira();
        carteirinha.resgatar("pet", 34000, 6);
    }
}