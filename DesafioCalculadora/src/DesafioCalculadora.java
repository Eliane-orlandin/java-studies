import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("----Calculadora inteligente----");
        
        System.out.println("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();

        System.out.println("Digite o segundo número: \n");
        double num2 = teclado.nextDouble();
        teclado.nextLine(); // Para limpar o buffer

        System.out.println("Qual operação deseja  calcular: [ + , - , * , / , % ]");
        
        String operacao = teclado.nextLine().trim();

        String resultado =
            operacao.equals("+") ? "A soma é: " + (num1 + num2) :
            
            operacao.equals("-") ? "A subtração é: " + (num1 - num2) :
            
            operacao.equals("*") ? "A multiplicação é: " + (num1 * num2) :
            
            operacao.equals("/") ? (num2 != 0 ? "A divisão é: " + (num1 / num2) : "Erro: Divisão por zero!") :
            
            operacao.equals("%") ? "O modulo é: " + (num1 % num2) : "Operação inválida";
    
        System.out.println(resultado);

    teclado.close();
    }
} 

/* 

// Resposta do professor:

//Lógica
        String operacao = teclado.next();

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
        teclado.close();

    }
}

*/

