public class DesafioFor {
    public static void main(String[] args) {
        
        /* NÃO PODE USAR VALOR NUMÉRICO PARA CONTROLAR O LAÇO
        String valor = "#";
        for (int i = 1; i <= 5; i++){
            System.out.println(valor);
            valor += "#";
        }*/
        for (String v = "#"; !v.equals("######"); v += "#"){
            System.out.println(v);
        }
    }
}
