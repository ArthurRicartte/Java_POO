import java.util.*;

public class Consultorio {
    private List<Pasciente> pascientes;
    private List<Recepcionista> recepcionistas;
    private List<Medico> medicos;

    public Consultorio(){
        this.pascientes = new ArrayList<>();
        this.recepcionistas = new ArrayList<>();
        this.medicos = new ArrayList<>();
    }

    public void cadastrarPasciente(Pasciente pasciente){
        pascientes.add(pasciente);
    }

    public void cadastrarRecepcionista(Recepcionista recepcionista){
        recepcionistas.add(recepcionista);
    }

    public void cadastrarMedico(Medico medico){
        medicos.add(medico);
    }
    public void listaPascientes(){
        Iterator<Pasciente> it = pascientes.iterator();
        System.out.println();
        System.out.println("-------------------------Pascientes------------------------");
        while (it.hasNext()){
            Pasciente pasciente = it.next();
            pasciente.exibirInfo();
        }
    }

    public void listaRecepcionistas(){
        Iterator<Recepcionista> it = recepcionistas.iterator();
        System.out.println();
        System.out.println("-----------------------Recepcionistas----------------------");
        while (it.hasNext()){
            Recepcionista recepcionista = it.next();
            recepcionista.exibirInfo();
        }
    }

    public void listaMedicos(){
        System.out.println();
        Iterator<Medico> it = medicos.iterator();
        System.out.println("--------------------------Medicos--------------------------");
        while (it.hasNext()){
            Medico medico = it.next();
            medico.exibirInfo();
        }
    }

}
