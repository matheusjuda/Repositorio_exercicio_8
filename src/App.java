import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {  
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos você ganha por hora?");
        double valores = sc.nextDouble();

        System.out.println("Quantas horas você trabalha no mês?");
        double horas = sc.nextDouble();

        sc.close();

        double salario = valores*horas;

        System.out.println("O valor do seu salário no mês é de: "+salario);
    }
}