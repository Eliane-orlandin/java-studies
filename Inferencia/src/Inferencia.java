public class Inferencia {
    public static void main(String[] args) {
        
        double a = 4.5; // declaração e inicialização
        System.out.println(a);

        // a = "..." -> já foi inicializada como double, então não pode ser de outro tipo. 
        
        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        // c = 4.5; -> já foi inicializada como double, então não pode ser de outro tipo. 
        
        double d; // variável foi declarada
        d = 123.65; // variável foi inicializada
        System.out.println(d); // variável usada
    }
}
