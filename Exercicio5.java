import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua altura em metros:");
        double altura = input.nextDouble();
        System.out.println("Informe seu peso em Kg:");
        double peso = input.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("O valor do seu IMC é: %.2f %n", imc);

        if (imc < 17.00) {
            System.out.println("Muito abaixo do peso!");
        } else if (17.00 <= imc && imc <= 18.49) {
            System.out.println("Abaixo do peso!");
        } else if (18.50 <= imc && imc <= 24.99) {
            System.out.println("Peso normal!");
        } else if (25.00 <= imc && imc <= 29.99) {
            System.out.println("Acima do peso!");
        } else if (30.00 <= imc && imc <= 34.99) {
            System.out.println("Obesidade grau I!");
        } else if (35.00 <= imc && imc <= 39.99) {
            System.out.println("Obesidade grau II! (severa)");
        } else {
            System.out.println("Obesidade grau III! (mórbida)");
        }

        input.close();
    }
}