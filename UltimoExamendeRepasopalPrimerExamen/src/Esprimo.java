public class Esprimo {
    public static void main(String[] args) {
        int n = 7;
        int i = 2;
        int contador = 1;
        int contador2 = 1;
        while (contador <= n) {
            if (i % contador != 1) {
                System.out.print(i + " ");
                contador++;
            }
            i++;
        } // regular
    }
}
