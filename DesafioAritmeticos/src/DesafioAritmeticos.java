public class DesafioAritmeticos {

    public static void main(String[] args) {
        
        double numA = Math.pow (6 * (3 + 2), 2);
        double denA = 3 * 2;

        double numB = (1 - 5) * (2 - 7);
        double denB = 2;
        
        double superiorA = numA / denA;
        double superiorB = Math.pow(numB / denB, 2);

        double superior = Math.pow (superiorA - superiorB, 3);
        double inferior = Math.pow(10, 3);

        double resultado = superior / inferior;

        System.out.println("O resultado é " + resultado);
    }
}

/*
        int a = 6;
        int b = 3;
        int c = 2;
        int d = 1;
        int e = 5;
        int f = 2;
        int g = 7;
        // 1° equação
        int abc = a * (b + c);
        int qua = (int) Math.pow(abc, 2);
        int div = qua / (3 * 2);

        // 2° equaçao
        int de = d - e;
        int fg = f - g;
        int defg = de * fg / 2;
        int qua1 = (int) Math.pow(defg, 2);

        int tot = div - qua1;
        int total = (int) Math.pow(tot, 3);

        int result = total / (int) Math.pow(10, 3);

        System.out.println(result);
    }*/