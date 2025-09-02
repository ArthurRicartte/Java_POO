import javax.swing.JOptionPane;
public class Main {
    /*Aqui, criei duas funcoes para cadastrar uma pessoa no array pessoas
    *Ambas recebem o mesmo vetor, e a posicao que essa pessoa tem que ficar no array*/
    public static void CadastrarPessoaFisica(Pessoa[] vetor, int pos){
        //Pegando o nome:
        String msg = JOptionPane.showInputDialog("Pessoa Fisica\nDigite o nome:");
        String nome = msg;

        //Pegando a renda anual:
        msg = JOptionPane.showInputDialog("Pessoa Fisica\nDigite a renda anual:");
        double rendaAnual = Double.parseDouble(msg);

        //Pegando os gastos com saude:
        msg = JOptionPane.showInputDialog("Pessoa Fisica\nDigite os gastos com saude:");
        double gastosSaude = Double.parseDouble(msg);

        //Adicionando no array:
        vetor[pos] = new PessoaFisica(nome, rendaAnual, gastosSaude);
    }

    public static void CadastrarPessoaJuridica(Pessoa[] vetor, int pos){
        //Pegando o nome:
        String msg = JOptionPane.showInputDialog("Pessoa Juridica\nDigite o nome:");
        String nome = msg;

        //Pegando a renda anual:
        msg = JOptionPane.showInputDialog("Pessoa Juridica\nDigite a renda anual:");
        double rendaAnual = Double.parseDouble(msg);

        //Pegando a quantidade de funcionarios:
        msg = JOptionPane.showInputDialog("Pessoa Juridica\nQuantos funcionarios essa pessoa tem?");
        int funcionarios = Integer.parseInt(msg);

        //Pegando a renda anual:
        vetor[pos] = new PessoaJuridica(nome, rendaAnual, funcionarios);
    }


    public static void main(String[] args) {
        String msg = JOptionPane.showInputDialog("Quantas pessoas vc deseja listar?TO NO DELL");
        int quantidade = Integer.parseInt(msg);
        Pessoa[] pessoas = new Pessoa[quantidade];

        //Loop para cadastrar a quantidade de pessoas desejadas:
        int pos = 0;
        while (quantidade > 0){
            msg = JOptionPane.showInputDialog("Deseja cadastrar:\numa pessoa Fisica(digite 1)\numa pessoa Juridica (digite 2):");
            int choice = Integer.parseInt(msg);

            //So temos pessoa fisica(1) e pessoa juridica(2):
            if (choice < 1 || choice > 2){
                JOptionPane.showMessageDialog(null, "[ERROR] tipo inexistente! tente novamente!");
                continue;
            }else if (choice == 1){
                //chamando a funcao:
                CadastrarPessoaFisica(pessoas, pos);

            }else {
                //chamando a funcao:
                CadastrarPessoaJuridica(pessoas, pos);
            }

            /*diminuimos 1 de quantidade (visando chegar a 0 e sair do loop)
            e adicionamos 1 em pos (passar para a proxima posicao no array pessoas)*/
            pos++;
            quantidade--;
        }

        //Exibindo pessoas e o total de impostos arrecadados:
        double totImpostos = 0.0;

        //For each para percorrer o array pessoas:
        for (Pessoa pessoa : pessoas) {
            totImpostos += pessoa.calcularImposto();
            pessoa.listarPessoa();
        }

        System.out.printf("Total arrecadado: R$ %.2f\n",totImpostos);
    }
}