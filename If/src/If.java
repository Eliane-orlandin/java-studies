import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a média: ");
        double media = scanner.nextDouble();

        // Se tiver várias expressões, o ideal é quebrar em variáveis para facilitar a leitura do código
      
        boolean criterioAprovacao = media <= 10 && media >= 7.0;
        if (criterioAprovacao) {
            System.out.println("Aluno aprovado!");
            System.out.println("Parabéns!");
        }
        boolean criterioRecuperacao = media < 7 && media >= 4.5;
        if (criterioRecuperacao){
            System.out.println("Aluno em recuperação!");
        }
        
        boolean criterioReprovacao = media < 4.5 && media >= 0;
        if (criterioReprovacao){
            System.out.println("Aluno reprovado!");
        }
        
        scanner.close();
    }
}
