import java.util.Scanner;

public class Forpiramide {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int n = teclado.nextInt();
        int contadorNumeros = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(contadorNumeros);
                if (contadorNumeros < 11){

                }
            }
            contadorNumeros += 2 ;
            System.out.println("");
        }
    }
}
