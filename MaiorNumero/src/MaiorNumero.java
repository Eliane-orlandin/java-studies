import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE; // inicializa com o menor valor possível

        System.out.println("Digite 10 números:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero; // atualiza se encontrar um número maior
            }
        }

        System.out.println("O maior número digitado foi: " + maior);

        scanner.close();
    }
}

