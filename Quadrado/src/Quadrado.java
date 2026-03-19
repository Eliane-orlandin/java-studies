import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado:");
        int lado = scan.nextInt();
        int area = lado * lado;

        System.out.printf("A área do quadrado é: %d\n", area);

        scan.close();
    }
}
