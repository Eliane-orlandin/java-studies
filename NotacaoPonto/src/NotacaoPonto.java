public class NotacaoPonto {

    public static void main(String[] args) {
        
        String s = "Bom dia X";
        s = s.replace ("X", "Senhora");
        s = s.toUpperCase(); // Transforma a palavra em letras maiúscula.
        s = s.concat("!!!");

        System.out.println(s);

        System.out.println("Eliane".toUpperCase());

        String e = "Eliane".toUpperCase();
        System.out.println(e);

        String y = "Bom dia Vini".replace("Vini", "Vinicius") .toUpperCase() .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."

    }
}
