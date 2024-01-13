import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int fila = 1;

    Scanner teclado = new Scanner (System.in);
    System.out.println("Escriba un numero");
    int n = teclado.nextInt();
    while(fila <=  n){
        int columna = 1;
        while (columna <= fila){
            System.out.print(fila + "  ");
            columna++;
        }
        fila ++;
        System.out.println();
    }

    }
}
