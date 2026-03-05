public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));
        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Eliane";
        var sobrenome = "Orlandin";
        var idade = 44;
        var empresa = "Banco do Brasil";
        var salario = 8_720.00;

        System.out.println("Nome: " + nome + " \nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nEmpresa: " + empresa + "\nSalario: RS " + salario + "\n\n" );

        System.out.printf("A senhora %s %s tem %d anos, trabalha no %s e ganha R$ %.2f. ", nome, sobrenome, idade, empresa, salario);

        String frase = String.format("\nA senhora %s %s tem %d anos, trabalha no %s e ganha R$ %.2f. ", nome, sobrenome, idade, empresa, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 8));
    }
}
