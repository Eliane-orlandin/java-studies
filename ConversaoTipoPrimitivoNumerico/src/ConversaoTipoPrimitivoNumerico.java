public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {
        
        double a = 1; // implícita
        System.out.println(a);

        float b = (float) 1.123456788888; // explícita (Cast)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // explícita (Cast)
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e;
        System.out.println(f);

    }
}

/*
****Conversão implícita (type casting automático)
Também chamada de widening (alargamento).****

Ocorre quando você converte de um tipo menor para um tipo maior, sem risco de perda de dados.
O compilador faz isso automaticamente.

***Conversão explícita (type casting manual)
Também chamada de narrowing (estreitamento).***

Ocorre quando você converte de um tipo maior para um tipo menor, podendo haver perda de dados.
O programador precisa indicar a conversão com (tipo) antes do valor.

*/