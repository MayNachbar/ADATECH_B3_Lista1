import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = input.nextLine();

        System.out.println("Qual o seu salário?");
        double salario = input.nextDouble();

        System.out.println("Qual a sua idade?");
        int idade = input.nextInt();

        System.out.println("Qual a sua altura?");
        double altura = input.nextDouble();

        System.out.println("Qual o seu sexo?");
        input.nextLine();
        String sexo = input.nextLine();

        System.out.printf("O seu nome é %s %n" +
                          "Você recebe R$%.2f %n" +
                          "Você tem %d anos %n" +
                          "A sua altura é %.2f metros %n" +
                          "E o seu sexo é %s",
                          nome, salario, idade, altura, sexo);

        input.close();
    }
}