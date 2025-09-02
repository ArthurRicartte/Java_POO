public class CarteiraInvestimentos {
    //Composicao
    private AtivoFinanceiro[] carteira;

    //Construtor
    public CarteiraInvestimentos(){
        this.carteira = new AtivoFinanceiro[5];
    }

    //Metodo para adicionar ativos a carteira:
    public void adicionarAtivo(AtivoFinanceiro ativo){
        //Flag para controle
        boolean adicionado = false;

        //For para percorrer a carteira
        for (int i = 0; i < this.carteira.length; i++){
            //Se tiver algum espaco vazio -> adiciona o ativo
            if (this.carteira[i] == null){
                carteira[i] = ativo;
                System.out.println("Ativo adicionado na carteira com sucesso.");
                adicionado = true;
                break;
            }
        }

        //Se nao tiver vagas na carteira -> nada sera adicionado
        if (!adicionado){
            System.out.println("Nao ha mais espaco na carteira");
        }
    }

    //Funcao para listar os ativos da carteira:
    public void listarCarteira(){
        for (AtivoFinanceiro ativo : this.carteira){
            ativo.exibirInfo();
        }
    }

    //Funcao para analisar se eh possivel resgatar os ativos da carteira:
    public void resgatar(String nomeAtivo, double valor, int meses){
        //Flag para controle
        boolean encontrado = false;

        //For each:
        for (AtivoFinanceiro ativoFinanceiro : this.carteira) {
            //Analisamos se o nomeAtivo corresponde a algum nome da carteira de ativos, se corresponder -> este ativo existe!
            if (ativoFinanceiro.getNome().equalsIgnoreCase(nomeAtivo)) {
                //Verificamos se eh possivel resgatar o ativo, passando valor e meses.
                ativoFinanceiro.podeResgatar(valor, meses);
                encontrado = true;
                break;
            }
        }

        //Se o nomeAtivo nao tiver correspondente -> ativo inexistente
        if (!encontrado){
            System.out.println("Ativo nao encontrado.");
        }
    }

}
