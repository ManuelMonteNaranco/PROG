import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero ->");
        int a = teclado.nextInt();
        int contador = 0;
        while (contador <= a){
            System.out.print(contador + " ");
            contador ++;
        }
    }
}
