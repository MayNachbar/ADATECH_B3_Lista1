import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo(a) a sua nova missão!");
        System.out.println("Preciso que responda algumas perguntas! Vamos lá?\n");

        /**
        Módulo 01 - Controle de tempo x funcionários:
        Memória disponível: 3 bytes
        Requisitos: Armazenar o ano atual da missão (max 9999), quantidade de funcionários envolvidos (max 100).
        **/
        System.out.println("-------------------------Módulo 01-------------------------");

        short ano; //Tipo short: 2 bytes | -32.768 a 32.767
        do {
            System.out.println("Qual o ano atual da missão? (Input válido de 0 a 9999)");
            while (!input.hasNextShort()) {
                System.out.println("Por favor, insira um valor numérico válido.");
                input.next();
            }
            ano = input.nextShort();

            if (ano < 0 || ano > 9999) {
                System.out.println("Ano inválido! Insira o ano novamente.");
            }
        } while (ano < 0 || ano > 9999);

        byte quantidadeDeFuncionarios; //Tipo byte: 1 byte | -128 a 127
        do {
            System.out.println("Qual a quantidade de funcionários envolvidos? (Input válido de 0 a 100)");
            while (!input.hasNextByte()) {
                System.out.println("Por favor, insira um valor numérico válido.");
                input.next();
            }
            quantidadeDeFuncionarios = input.nextByte();

            if (quantidadeDeFuncionarios <= 0 || quantidadeDeFuncionarios > 100) {
                System.out.println("Número inválido! Insira um número novamente.");
            }
        } while (quantidadeDeFuncionarios <= 0 || quantidadeDeFuncionarios > 100);

        System.out.println("Ano da missão: " + ano + " - Tipo short: 2 bytes | -32.768 a 32.767");
        System.out.println("Quantidade de funcionários: " + quantidadeDeFuncionarios + " - Tipo byte: 1 byte | -128 a 127");

        System.out.println("Total de bytes utilizado no módulo 01: 3 bytes\n" );

        /**
        Móludo 02 - Controle de distância x velocidade:
        Memória disponível: 6 bytes
        Requisitos: Armazenar distancia que o satélite ficará da terra (max 2 milhões), velocidade máxima (max 30.000 km/h)
        **/
        System.out.println("-------------------------Módulo 02-------------------------");

        int distancia; //Tipo int: 4 bytes | -2.147.483.648 a 2.147.483.647
        do {
            System.out.println("Qual a distância que o satélite ficará da terra? (Input válido de 0 a 2 milhões)");
            while (!input.hasNextInt()) {
                System.out.println("Por favor, insira um valor numérico válido.");
                input.next();
            }
            distancia = input.nextInt();

            if (distancia < 0 || distancia > 2000000) {
                System.out.println("Distânicia inválida! Insira uma distância novamente.");
            }
        } while (distancia < 0 || distancia > 2000000);

        short velocidadeMax; //Tipo short: 2 bytes | -32.768 a 32.767
        do {
            System.out.println("Qual a velocidade máxima em km/h? (Input válido de 0 a 30.000)");
            while (!input.hasNextShort()) {
                System.out.println("Por favor, insira um valor numérico válido.");
                input.next();
            }
            velocidadeMax = input.nextShort();

            if (velocidadeMax < 0 || velocidadeMax > 30000) {
                System.out.println("Velocidade máxima inválida! Insira uma velocidade máxima novamente.");
            }
        } while (velocidadeMax < 0 || velocidadeMax > 30000);

        System.out.println("Distância que o satélite ficará da terra: " + distancia + " - Tipo int: 4 bytes | -2.147.483.648 a 2.147.483.647");
        System.out.println("Velocidade máxima: " + velocidadeMax + " Km/h - Tipo short: 2 bytes | -32.768 a 32.767");

        System.out.println("Total de bytes utilizado no módulo 02: 6 bytes\n" );

        /**
        Módulo 03 - Status da missão:
        Memória disponível: 17 bytes
        Requisitos: Armazenar o estado da missão (se já iniciou ou não), distância que será percorrida durante a missão em km (max 3 bilhões de km)
                    e calibragem das antenas (número racional com precisão de no mínimo 14 casa decimais).
        **/
        System.out.println("-------------------------Módulo 03-------------------------");

        boolean estadoDaMissão; //Tipo boolean: 1 byte | True or False
        System.out.println("Qual o estado da missão? (Já iniciou = true | Não iniciou = false)");
        while (!input.hasNextBoolean()) {
            System.out.println("Por favor, insira um valor válido: true ou false.");
            input.next();
        }
        estadoDaMissão = input.nextBoolean();

        long distanciaPercorrida; // Tipo long: 8 bytes | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        do {
            System.out.println("Qual a distância que será percorrida durante a missão em km? (Input válido de 0 a 3 bilhões)");
            while (!input.hasNextLong()) {
                System.out.println("Por favor, insira um valor numérico válido.");
                input.next();
            }
            distanciaPercorrida = input.nextLong();

            if (distanciaPercorrida < 0 || distanciaPercorrida > 3_000_000_000L) {
                System.out.println("Distância inválida! Insira uma distância novamente.");
            }
        } while (distanciaPercorrida < 0 || distanciaPercorrida > 3_000_000_000L);

        double calibragemDasAntenas; //Tipo double: 8 bytes | 15 dígitos decimais significativos
        do {
            System.out.println("Qual a calibragem das antenas? Input 0 a 999.99999999999999 (número racional com precisão de no mínimo 14 casa decimais)");
            while (!input.hasNextDouble()) {
                System.out.println("Por favor, insira um valor numérico válido.");
                input.next();
            }
            calibragemDasAntenas = input.nextDouble();

            if (calibragemDasAntenas < 0 || calibragemDasAntenas > 999.99999999999999){
                System.out.println("Valor de calibragem das antenas inválido! Insira outro valor.");
            }
        } while (calibragemDasAntenas < 0 || calibragemDasAntenas > 999.99999999999999);

        System.out.println("O estado da missão é: " + estadoDaMissão + " - Tipo boolean: 1 byte | True or False");
        System.out.println("A distância que será percorrida durante a missão é: " + distanciaPercorrida + " Km - Tipo long: 8 bytes | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807");
        System.out.println("Valor de calibragem das antenas: " + calibragemDasAntenas + " - Tipo double: 8 bytes | 15 dígitos decimais significativos");

        System.out.println("Total de bytes utilizado no módulo 03: 17 bytes" );

        input.close();
    }
}
