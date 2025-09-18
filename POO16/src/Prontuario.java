import java.util.*;

public class Prontuario {
    private List<Consulta> consultas;

    public Prontuario(){
        this.consultas = new LinkedList<>();
    }

    public void cadastrarConsulta(String data, Medico medicoResponsavel, String descricao){
        consultas.add(new Consulta(data, medicoResponsavel, descricao));
    }

    public void exibirProntuario(){
        Iterator<Consulta> it = consultas.iterator();

        while(it.hasNext()){
            Consulta consulta = it.next();
            consulta.dadosConsulta();
        }
    }
}
