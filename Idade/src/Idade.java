import java.time.OffsetDateTime;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var baseAno = OffsetDateTime.now().getYear();
        
        System.out.println("Qual é seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Qual seu ano de nascimento: ");
        int anoNascimento = scan.nextInt();

        int idade = baseAno - anoNascimento;

        System.out.printf("Olá %s, você tem %d anos.\n", nome,idade);

        scan.close();
        
    }
}
