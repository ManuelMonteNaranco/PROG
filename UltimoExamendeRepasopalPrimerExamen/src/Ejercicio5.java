import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Escribe un numero");
        int n = teclado.nextInt();
        int suma = 0;
        for (int i = 1; i < n-1 ; i++) {
            if (n % i == 0){
                suma = suma+ i;
            }

        }
        if (suma == n){
            System.out.println("True");
        } else {
            System.out.printf("False");
        }
    }
}
