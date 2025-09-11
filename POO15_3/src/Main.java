import java.util.*;

public class Main {

    //Funcao que vai verificar se a nota eh valida (entre 0 e 10):
    public static boolean VerificaNota(double nota) throws NotaInvalidaException{

        //Se nao estiever dentro do intervalo, vai lancar o error especializado
        if (nota < 0){
            throw new NotaInvalidaException("Nota menor que Zero!");
        } else if (nota > 10){
            throw new NotaInvalidaException("Nota maior que 10!");
        }

        //Nota dentro do intervalo!
        System.out.println("Nota valida");
        return true;
    }

    //Exibir alunos e suas notas (Recebe um List como parametro)
    public static void exibeAlunos(List<Nota> lista){

        //Caso esteja vazio, nao exibe nada.
        if (lista.isEmpty()){
            System.out.println("Nada para exibir");
        }else {
            System.out.println("--------------Alunos--------------");

            //Cria um iterator para possibilitar a exibicao de cada aluno
            Iterator<Nota> alunos = lista.iterator();
            while (alunos.hasNext()){
                Nota aluno = alunos.next();
                //Chama metodo exibirInfo de nota
                aluno.exibirInfo();
            }
        }
    }

    public static void main(String[] args) {
        //Criando um LinkedList para armazenar as notas
        List<Nota> alunos = new LinkedList<Nota>();

        //Iniciando Scanner
        Scanner sc = new Scanner(System.in);

        //boolean para controlar a situacao da nota do aluno
        boolean situacaoNota = false;

        while (true){

            //Recebendo nome e nota
            System.out.println("---------------------------------------");
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();

            //A condicao de parada do cadastro eh nome = sair.
            if (nome.equalsIgnoreCase("sair")){
                break;
            }

            System.out.print("Digite a nota do aluno: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            //Analisa se a nota esta no padrao pedido pela questao:
            try {
                situacaoNota = VerificaNota(nota);

            } catch (NotaInvalidaException e) {
                System.out.println(e.getMessage());
            }

            //Caso a nota esteja dentro do padrao, adiciona em alunos
            if (situacaoNota){
                alunos.add(new Nota(nome, nota, situacaoNota));
            }
        }

        //Fecha o Scanner e exibe todos os alunos cadastrados
        sc.close();
        exibeAlunos(alunos);

    }
}