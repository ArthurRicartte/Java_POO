public class Consulta {
    private String data;
    private Medico medicoResponsavel;
    private String descricao;


    public Consulta(String data, Medico medicoResponsavel, String descricao){
        this.data = data;
        this.medicoResponsavel = medicoResponsavel;
        this.descricao = descricao;
    }

    public Medico getMedicoResponsavel(){
        return this.medicoResponsavel;
    }

    public void dadosConsulta(){
        System.out.println("-------------------------Consulta--------------------------");
        System.out.println("Data: " + this.data);
        System.out.println("Descricao: " + this.descricao);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Medico Responsavel: ");
        getMedicoResponsavel().exibirInfo();
    }
}
