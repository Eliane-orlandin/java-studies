// O uso é apenas para demonstração, NÃO É RECOMENDÁVEL USAR ELE DESSA MANEIRA    
    public class ContinueRotulado {
    public static void main(String[] args) {
        
        externo: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == 1) {
                    continue externo;
                }
                System.out.printf("[%d %d] ", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim");
    }    
}
