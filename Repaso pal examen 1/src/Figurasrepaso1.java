import java.util.Scanner;

public class Figurasrepaso1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escriba un numero");
        int n = teclado.nextInt();
        for (int i = 1; i <= n ; i++) {
            for(int k = 1; k <= n - i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print( "*");
            }
            System.out.println();
        }
    }
}
