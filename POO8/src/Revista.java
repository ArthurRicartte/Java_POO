public class Revista extends Publicacao{
    public Revista(String titulo, String autor, int anoPublicacao){
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void obterTipo(){
        System.out.println("------------------------------");
        System.out.printf("Tipo: Revista\nTitulo: %s\nAutor: %s\nAno de Publicacao: %d\n"
                , getTitulo().trim(), getAutor().trim(),getAnoPublicacao());
        System.out.println("------------------------------");
    }
}
