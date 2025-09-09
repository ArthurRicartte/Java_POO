import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.printf("Digite o numero %d:", i+1);
            String nome = input.nextLine();
            nomes.add(nome.trim().toLowerCase());
        }

        nomes.sort(null);
        Iterator<String> iterador = nomes.iterator();

        System.out.println("NOMES EM ORDEM");
        while(iterador.hasNext()){
            String nome = iterador.next();
            System.out.println(nome);
        }
    }
}