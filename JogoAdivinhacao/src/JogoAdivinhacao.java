import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 0 e 100
        int numeroSecreto = random.nextInt(101);

        int tentativas = 10;
        boolean acertou = false;

        System.out.println("Jogo da Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");
        System.out.println("Você tem " + tentativas + " tentativas.");

        while (tentativas > 0 && !acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);
                acertou = true;
            } else {
                tentativas--;
                if (palpite > numeroSecreto) {
                    System.out.println("O número secreto é menor que " + palpite + ".");
                } else {
                    System.out.println("O número secreto é maior que " + palpite + ".");
                }
                System.out.println("Tentativas restantes: " + tentativas);
            }
        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram. O número secreto era: " + numeroSecreto);
        }

        scanner.close();
    }
}
