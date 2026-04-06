import java.util.Scanner;

public class NumeroPrimoSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean primo = true;

        switch (numero) {
            case 0:
            case 1:
                primo = false; // 0 e 1 não são primos
                break;
            case 2:
            case 3:
                primo = true; // 2 e 3 são primos
                break;
            default:
                // Verificação para números maiores que 3
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
        }

        if (primo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        scanner.close();
    }
}
