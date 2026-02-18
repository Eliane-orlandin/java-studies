import java.util.Scanner;
import java.util.Locale;

public class DesafioConversao {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        
        Locale localBrasil = Locale.of("pt", "BR");
        
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(localBrasil);
        

        System.out.println("Digite o primeiro valor: ");
        String sal1 = teclado.nextLine().replace("," , ".");
        double salario1 = Double.parseDouble(sal1);

        System.out.println("Digite o segundo valor: ");
        String sal2 = teclado.nextLine().replace("," , ".");
        double salario2 = Double.parseDouble(sal2);

        System.out.println("Digite o terceiro valor: ");
        String sal3 = teclado.nextLine().replace("," , ".");
        double salario3 = Double.parseDouble(sal3);

        double mediaSalarial = (salario1 + salario2 + salario3) / 3;

        System.out.printf("\nA média salarial é R$ %.2f%n", mediaSalarial);

        teclado.close();
    }
}

