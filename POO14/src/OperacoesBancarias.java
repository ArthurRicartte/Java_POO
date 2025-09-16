public interface OperacoesBancarias {
    void exibirInfo(String operacao, double valor);
    boolean depositar(double valor);
    boolean sacar(double valor);
    double retornarSaldoAtual();
}
