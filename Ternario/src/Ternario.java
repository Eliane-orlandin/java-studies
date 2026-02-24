public class Ternario {
    public static void main(String[] args) {
        double media = 6.6;

       // String resultadoRecuperacao = media >= 5.0 ? "em recuperação" : "reprovada";
        String resultado = media >= 7.0 ? "aprovada." : media >= 5.0 ? "em recuperação" : "reprovada";

        System.out.println("A aluna está " + resultado);

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultadoFinal = temDesconto ? "Sim" : "Não";

        System.out.println("\nTem desconto: " + resultadoFinal);
    }
}
