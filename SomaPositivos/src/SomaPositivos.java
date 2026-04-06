import java.util.Scanner;

public class SomaPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.println("Digite números positivos para somar. Digite um número negativo para encerrar.");

        // Estrutura while: continua enquanto o número for positivo
        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break; // encerra o loop se for negativo
            }

            soma += numero;
            System.out.println("Soma atual: " + soma);
        }

        System.out.println("Programa encerrado. Soma final: " + soma);

        scanner.close();
    }
}
