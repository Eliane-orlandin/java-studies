public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)
        // Se os dois trabalhos certos = tv 50' no fds
        // Se apenas um trabalho der certo = tv 32'
        // Ou comprando a Tv de 50' ou a de 32' = tomar sorvete
        // Se nenhum trabalho der certo = ficam em casa

        //variaveis: Tv 50, tv 32, tomou sorvete, ficou mais saudável

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean sorvete = tv50 ^ tv32;
        boolean saudavel = !sorvete;

        System.out.println("Comprou a tv 50'?: " + tv50);
        System.out.println("Comprou a tv 32'?: " + tv32);
        System.out.println("Comprou sorvete?:" + sorvete);
        System.out.println("Mais saudável? : " + saudavel);

        
    }
}
