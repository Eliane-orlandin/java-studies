import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro nome: ");
        String nome1 = scan.nextLine();
        System.out.println("Digite a primeira idade: ");
        int idade1 = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite o segundo nome: ");
        String nome2 = scan.nextLine();
        System.out.println("Digite a primeira idade: ");
        int idade2 = scan.nextInt();

        if (idade1 > idade2) {
            System.out.printf("%s é mais velha(o) que %s por %d anos.\n", nome1, nome2, idade1 - idade2);
        } else if (idade2 > idade1) {
            System.out.printf("%s é mais velha(o) que %s por %d anos.\n", nome2, nome1, idade2 - idade1);
        } else {
            System.out.printf("%s e %s têm a mesma idade (%d anos).\n", nome1, nome2, idade1);
        }
        scan.close();

    }
}

/*
escreva um código que receba o nome e idade de duas pessoas e imprima a diferença
*/