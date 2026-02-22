public class Relacionais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a'; // não faz sentido colocar o caractere correspondente ao número, o ideal é colocar o literal mesmo
        
        System.out.println(a == b);

        System.out.println(3 > 4); //  false
        System.out.println(3 >= 3); // true
        System.out.println(3 < 7); // true
        System.out.println(30 <= 7); // false
        System.out.println(30 != 7); // true

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);
    }
}
