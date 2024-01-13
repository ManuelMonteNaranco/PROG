import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero ->");
        int a = teclado.nextInt();
        System.out.println("Escribe otro numero ->");
        int b = teclado.nextInt();
        System.out.println("Escribe otro mas numero ->");
        int c = teclado.nextInt();
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0){
            System.out.println("Son pares los 3");
        } else if (a % 2 == 0 && b % 2 == 0 || a % 2 == 0 && c % 2 == 0||c % 2 == 0 && b % 2 == 0) {
            System.out.println("Son pares solo dos");
        }else if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0){
            System.out.println("Son pares solo uno");
        } else {
            System.out.println("No es ninguno par");
        }
    }
}