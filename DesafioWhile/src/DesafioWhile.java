import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNotas = 0;
        double total = 0; 
        double nota = 0;

        while (nota != -1) {
            System.out.println("Informe a nota: (ou -1 para sair)");
            nota = scanner.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeNotas++;
            } else if (nota != -1) {
                System.out.println("Nota inválida!");
            }
        }

        double media = total / quantidadeNotas;
        System.out.printf("Média= %.1f\n",  media);

        scanner.close();
    }


}

// usuário vai digitar uma nota <= 0 a <=10
// se o usuário digitar uma nota válida, será armazenado em uma variável chamada total (soma de todas as notas)
// sempre que uma nova nota for digitada, ela será acrescentada na variável total 
// outra variável com quantas notas validas foram digitadas
// no final vai ter a média
// quando o usuário digitar -1 sair do programa