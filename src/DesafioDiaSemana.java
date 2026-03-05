import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diaDaSemana = scanner.nextInt();

        if (diaDaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaDaSemana == 2) {
            System.out.println("Segunda-feira");
        } else if (diaDaSemana == 3) {
            System.out.println("Terça-feira");
        } else if (diaDaSemana == 4) {
            System.out.println("Quarta-feira");
        } else if (diaDaSemana == 5) {
            System.out.println("Quinta-feira");
        } else if (diaDaSemana == 6) {
            System.out.println("Sexta-feira");
        } else if (diaDaSemana == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Número inválido. Por favor, insira um número entre 1 e 7.");
        }

        scanner.close();

    }
}
