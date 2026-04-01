import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        String texto = "por favor";

        do {
            System.out.println("Você precisa falar " + "\n as palavras mágicas...");
            System.out.println("Quer sair?");
            texto = scanner.nextLine();
            
        } while (!texto.equalsIgnoreCase("por favor")

        );
        System.out.println("Obrigada!");
        scanner.close();
    }
}
