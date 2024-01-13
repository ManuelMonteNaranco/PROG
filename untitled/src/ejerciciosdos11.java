import java.util.Scanner;
public class ejerciciosdos11 {
    public static void main(String[] args) {
        int numero = 1;
        int suma=0;
    while (numero !=0 ){
        Scanner teclado =new Scanner(System.in);
        System.out.println("Diga un numero >");
        numero = teclado.nextInt();
        suma += numero;
    }
    System.out.println("La suma de los numeros es: " + suma);
    }
}
