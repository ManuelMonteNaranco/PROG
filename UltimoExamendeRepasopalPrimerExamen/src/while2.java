import java.util.Scanner;

public class while2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero ->");
        int a = teclado.nextInt();
        int contador = 1;
        while (contador <= a) {
            int p = 2 * contador - 2;
                System.out.print(p + " ");
            contador++;
        }
    }
}

