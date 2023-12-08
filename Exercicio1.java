import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = input.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = input.nextInt();

        System.out.print("Qual a sua profissão?\n");
        input.nextLine();
        String profissao = input.nextLine();

        System.out.printf("O seu nome é %s, você tem %d anos e a sua profissão é %s!", nome, idade, profissao);

        input.close();
    }
}