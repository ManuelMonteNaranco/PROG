   import java.util.Scanner;
public class ejerciciodos9 {
    public static void main(String[] args) {
        int FIN_TABLA_MULTIPLICAR = true;
        Scanner t = new Scanner(System.in);
        System.out.println("¿De qué número quieres realizar la tabla de multiplicar?");
        int numero = t.nextInt();
        System.out.println("La tabla de multiplicar del número " + numero + " es: ");

        for (int contador = 1; contador <= 10; ++contador) {
            System.out.printf(" %2d * %d = %d \n", contador, numero, contador * numero);

        }
    }
}
