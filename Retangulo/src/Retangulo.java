import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a base do retângulo:");
        int base = scan.nextInt();

        System.out.println("Digite a altura do retângulo: ");
        int altura = scan.nextInt();

        int area = altura * base;

        System.out.printf("A área do retangulo é: %d.\n", area);

        scan.close();
    }
}
