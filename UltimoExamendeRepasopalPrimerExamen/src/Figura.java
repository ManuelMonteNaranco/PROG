import java.util.Scanner;

public class Figura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 5;
        int numeros = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(2 * numeros - 1);
            }
            numeros++;
            System.out.println("");
            piramide(5);
        }
    }

    public static void piramide(int n) {
        int numeros = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(2 * numeros - 1);
            }
            numeros++;
            System.out.println("");
//repasar
        }
    }
}
