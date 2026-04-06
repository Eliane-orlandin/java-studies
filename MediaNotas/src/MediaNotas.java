import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
     
        if (media >= 7.0) {
            System.out.println("Média: " + media + " - Aprovado");
        } else if (media > 4.0) {
            System.out.println("Média: " + media + " - Recuperação");
        } else {
            System.out.println("Média: " + media + " - Reprovado");
        }

        scanner.close();
    }
}
