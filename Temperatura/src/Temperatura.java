public class Temperatura {

    public static void main(String[] args) {
        // (F° - 32) * 5/9.0 = °C

        final double DIFERENÇA = 32;
        final double MULTIPLICADOR = 5/9.0;

        double fahrenheit = 86;
        double celsius = (fahrenheit - DIFERENÇA) * MULTIPLICADOR;
        
        System.out.println("O resultado é " + celsius + "°C.");

        fahrenheit = 150;
        celsius = (fahrenheit - DIFERENÇA) * MULTIPLICADOR;
        System.out.println("O resultado é " + celsius + "°C.");
        
    }
}
