import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
            System.out.println("O número está entre 0 e 10 e é par.");
        } else {
            System.out.println("O número não atende aos critérios.");
        }

        scanner.close();
    }
}
