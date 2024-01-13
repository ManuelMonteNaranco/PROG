import java.util.Scanner;

public class Ejerciciodos28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        int numero1 = 0;
        int copianumero1 = 0;
        do {
            System.out.println("**************************");
            System.out.println("      Numero actual =    " + numero1 );
            System.out.println("**************************");
            System.out.println("1. Solicitar numero");
            System.out.println("2. Factorial");
            System.out.println("3. Primo");
            System.out.println("4. Contar cifras");
            System.out.println("5. Capicúa");
            System.out.println("6. Salir");
            System.out.println("Introduzca una opccion ---->");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca un numero entero");
                    if (teclado.hasNextInt()) {
                        numero1 = Integer.parseInt(teclado.nextLine());
                    } else {
                        System.out.println("Error Numero no entero ");
                        teclado.nextLine();
                    }
                    break;
                case 2:
                System.out.println("Elegiste factorial");

                    System.out.println("El factorial del nuemro introducido es: " + factorial());
                    break;
                }
                case 3:
                    System.out.println("Elegiste saber si el numero es primo o no");
                {
                    // boolean esPrimo = true;
                    //int 1 = 2;
                    //while (esPrimo && i <= numero /2){
                    // if (numero % i == 0){
                    //esPrimo = false;
                    //}
                    //i++;
                    //{
                    //if (esPrimo){
                    //Sy........8numero+ "es Primo");
                    //{ else {
                    // no es primo;
                    //{
                    int operacion = numero1 % 2;
                    if (operacion != 0) {
                        System.out.println("El numero es primo");
                    } else {
                        System.out.println("No es un numero primo");
                    }
                    break;
                }
                case 4:
                    System.out.println("Elegiste saber el numero de cifras del numero que introduciste");
                {
                    int copiadenuemro1 = numero1;
                    int contadordecifras = 0;
                    while (copiadenuemro1 != 0)
                    {
                        contadordecifras++;
                        copiadenuemro1 /= 10;
                    }
                    System.out.println("El numero: " + numero1 + " tiene las siguientes cifras: " + contadordecifras) ;
                    break;
                }
                case 5:
                    System.out.println("Elegiste saber si es capicua o no");
                {
                    int numeroinvertido = 0;
                    int copiadenumero1 = numero1;
                    while (copiadenumero1 > 0) {
                        numeroinvertido = numeroinvertido * 10 + copiadenumero1 % 10;
                        copiadenumero1 /= 10;
                    }
                    boolean capicua = (numeroinvertido == numero1);
                    System.out.println("El numero: " + numero1 + " es capicua");
                    break;
                }
                    case 6:
                        System.out.println("Eligio salir adios");
                        break;
                    default:
                        System.out.println("Entrada Incorrecta");
                        break;

            }
        while (opcion != 6) ;

}
public static long factorial(int numero) {
    int factorial = 1;
    for (int i= 1; i <= numero; i++){
        factorial *= i;
    }
   return factorial;
    }
public static int sumar (int numero1, int numero2){
        int resultado;
        return numero1 + numero2;
        System.out.println(resultado);
    }


}
