import java.util.Scanner;

public class Ejercicio2UltimoExamendeRepasdo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("un numero entre el uno y dos: ");
        int numero = teclado.nextInt();
        System.out.println("Escribe un numero ->");
        int a = teclado.nextInt();
        System.out.println("Escribe otro numero ->");
        int b = teclado.nextInt();
        System.out.println("Escribe otro mas numero ->");
        int c = teclado.nextInt();
        if (numero == 1) {
            if (a > b && a > c) {
                if (b > c) {
                    System.out.println(c + ", " + b + ", " + a);
                } else {
                    System.out.println(b + ", " + c + ", " + a);
                }
            } else if (b > a && b > c) {
                if (a > c) {
                    System.out.println(c + ", " + a + ", " + b);
                } else {
                    System.out.println(a + ", " + c + ", " + b);
                }

            } else if (c > a && c > b) {
                if (a > b) {
                    System.out.println(b + ", " + a + ", " + c);
                } else {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }

        } else if (numero == 2) {
            if (a < b && a < c) {
                if (b < c) {
                    System.out.println(c + ", " + b + ", " + a);
                } else {
                    System.out.println(b + ", " + c + ", " + a);
                }
            } else if (b < a && b < c) {
                if (a < c) {
                    System.out.println(c + ", " + a + ", " + b);
                } else {
                    System.out.println(a + ", " + c + ", " + b);
                }

            } else if (c < a && c < b) {
                if (a < b) {
                    System.out.println(b + ", " + a + ", " + c);
                } else {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }

        }else if (numero < 1 || numero > 2){
            System.out.println("Error No es ninguna de las dos opciones");
        }
    }
}
