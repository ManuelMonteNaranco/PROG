import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        int p;
        int conador = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero ->");
        int n = teclado.nextInt();
        while (n > 0){
            p = n % 10;
            n = n/ 10;
            conador++;
        }
        System.out.printf(conador + " ");
    }
}
