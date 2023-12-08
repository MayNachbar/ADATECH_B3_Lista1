public class Exercicio4 {
    public static void main(String[] args) {

        double areaRetangulo = calculaAreaRetangulo(10.5, 20.8);
        double areaTriangulo = calculaAreaTriangulo(10.4, 20.7);
        double areaCirculo = calculaAreaCirculo(2.5);
        double areaTrapezio = calculaAreaTrapezio(10.5, 20.4, 5.2);

        System.out.printf("Área do retângulo: %.2f %n", areaRetangulo);
        System.out.printf("Área do triângulo: %.2f %n", areaTriangulo);
        System.out.printf("Área do círculo: %.2f %n", areaCirculo);
        System.out.printf("Área do trapézio: %.2f %n", areaTrapezio);
    }

    public static double calculaAreaRetangulo(double ladoRetangulo1, double ladoRetangulo2){
        return ladoRetangulo1 * ladoRetangulo2;
    }
    public static double calculaAreaTriangulo(double baseTriangulo, double alturaTriangulo){
        return (baseTriangulo * alturaTriangulo) / 2.0;
    }
    public static double calculaAreaCirculo(double raio){
        return Math.PI * Math.pow(raio, 2);
    }
    public static double calculaAreaTrapezio(double baseMenor, double baseMaior, double alturaTrapezio){
        return (baseMenor + baseMaior) * alturaTrapezio / 2.0;
    }
}