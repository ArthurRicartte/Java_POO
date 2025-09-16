import java.util.*;

public class BancoController {
    private Map<String, ContaCorrente > contas;

    public BancoController(){
        this.contas = new HashMap<>();
    }

    //Cadastrar nova conta:
    public void cadastrarConta(ContaCorrente novaConta){
        contas.put(novaConta.getCliente().getChavePix(), novaConta);
    }

    //Buscar conta por chave Pix
    public ContaCorrente buscarContaPorChavePix(String chave){
        //Caso a chave passada seja null
        if (chave == null){
            System.out.println("Chave pix invalida.");
            //Retorna null caso nao consiga encontrar
            return null;
        }

        //Bucas no HashMap contas, uma conta com tenha como "indice" a chave que foi passada com argumento
        return contas.get(chave);
    }

    public boolean fazerPix(ContaCorrente origem, double valor, String chaveDestino){
        //Se tentar fazer um pix de valor negativo -> impede isso
        if (valor <= 0){
            System.out.println("Nao eh possivel fazer um pix de 0 reias ou valor negativo");
            //Retornando false para parar a execucao do metodo e sinlizar que deu erro
            return false;
        }

        //Criando uma variavel para armazenar a conta Destino que foi encontrada por meio da chave pix
        ContaCorrente contaDestino = buscarContaPorChavePix(chaveDestino);

        //Caso contaDestino for null -> nao encontrou nenhuma conta que corresponda a chave pix
        if (contaDestino == null){
            System.out.println("Destino do pix nao encontrado!");
            //Retornando false para parar a execucao do metodo e sinlizar que deu erro
            return false;
        }

        //Caso consiga sacar e depositar o valor -> o pix sera feito com sucesso
        if (origem.sacar(valor) && contaDestino.depositar(valor)){
            System.out.println("Pix realizado com sucesso!");
            return true;
        }

        //Caso encontre uma conta destino e nao consiga realizar o pix (Vai depender do deposito e saque)
        System.out.println("Error, nao consegui fazer o pix!");
        //Retornando false para parar a execucao do metodo e sinlizar que deu erro
        return false;

    }
}
