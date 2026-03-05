import java.util.Scanner;

public class DesafioQuadradoCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        int numero = scanner.nextInt();
        int quadrado = numero * numero;
        int cubo = numero * numero * numero;

        System.out.println("O quadrado de " + numero + " é: " + quadrado);
        System.out.println("O cubo de " + numero + " é: " + cubo);

        scanner.close();
    }
}
