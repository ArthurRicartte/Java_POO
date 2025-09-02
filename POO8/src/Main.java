public class Main {
    public static void adicionarPublicacao(Publicacao obra, Publicacao[] lista){
        for (int i = 0; i < lista.length; i++){
            if (lista[i] == null){
                lista[i] = obra;
                break;
            }
        }
    }

    public static void listarPublicacoes(Publicacao[] publicacoes){
        for (Publicacao publicacao :  publicacoes){
            publicacao.obterTipo();
        }
    }

    public static void main(String[] args) {
        Livro romance = new Livro("A procura do amor perdido", "Beth betano", 1978);
        Revista mangas = new Revista("Mangas - Sucessos de 2025", "Eliot", 2025);
        Artigo computacao =new Artigo("POO IN JAVA", "XINXIan", 1990);

        Publicacao[] publicacoes = new Publicacao[3];

        adicionarPublicacao(romance, publicacoes);
        adicionarPublicacao(mangas, publicacoes);
        adicionarPublicacao(computacao, publicacoes);

        listarPublicacoes(publicacoes);
    }
}