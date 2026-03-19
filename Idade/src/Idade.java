import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual é seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Qual é sua idade: ");
        int idade = scan.nextInt();

        System.out.printf("Seu nome é %s e você tem %d anos\n", nome, idade);


        scan.close();
        
    }
}
