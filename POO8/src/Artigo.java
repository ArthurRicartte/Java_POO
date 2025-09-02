public class Artigo extends Publicacao{
    public Artigo(String titulo, String autor, int anoPublicacao){
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void obterTipo(){
        System.out.println("------------------------------");
        System.out.printf("Tipo: Artigo\nTitulo: %s\nAutor: %s\nAno de Publicacao: %d\n"
                , getTitulo().trim(), getAutor().trim(),getAnoPublicacao());
        System.out.println("------------------------------");
    }
}
