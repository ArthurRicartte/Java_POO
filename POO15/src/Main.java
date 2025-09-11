import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Digite o numerador:");
            double a = input.nextDouble();
            System.out.println("Digite o denominador:");
            double b = input.nextDouble();

            if (b == 0){
                System.out.println("Impossivel dividir algo por 0!");
            }else{
                double resultado = a / b;
                System.out.println("Resposta: "+ resultado);
            }
        } catch (Exception e) {
            System.out.println("Digite numeros!");;
        }finally {
            input.close();
        }

    }
}