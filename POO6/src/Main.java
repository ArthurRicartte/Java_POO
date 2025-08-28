public class Main {
    //Funcao que vai calcular e exibir a folha salarial dos funcionarios da empresa
    public static void calcularFolhaSalarial(double[] salarios){
        double total = 0.0;
        /*Passei como paramentro um array com todos os salarios
        *Usei for each pois achei mais pratico, visando percorrer o array*/
        for (double salario : salarios){
            total += salario;
        }
        //Exibindo folha salarial:
        String msg = String.format("------------------------------------" +
                "\nFolha salarial: R$ %.2f", total);
        System.out.println(msg);
    }
    public static void main(String[] args) {
        //Criando obejtos:
        Gerente junin = new Gerente("Junior jr", "2334-23", 1000.00);
        Assistente claudio = new Assistente("Claudiono", "123,232,2", 1000.00);
        Vendedor jorge = new Vendedor("Jorge pig", "5.6544.5", 1000, 1000.00);

        //Folha salarial:
        double[] salarios = {junin.calcularSalario(), claudio.calcularSalario(), jorge.calcularSalario()};

        //Chamando metodos:
        jorge.listarFuncionario();
        junin.listarFuncionario();
        claudio.listarFuncionario();

        //Mostrando a folha salarial:
        calcularFolhaSalarial(salarios);
    }
}