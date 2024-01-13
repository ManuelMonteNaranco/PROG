
public class Tarea5 {
    private final char ESPACIO = ' ';

    public static void main(String[] args) {
        Tarea5 tarea5 = new Tarea5();
        tarea5.impares();
        tarea5.multiplos(1000);
       //System.out.println( tarea5.producto(4, 8));
        tarea5.dividirRestando(15, 2);
        tarea5.mediaAleatorios();
        tarea5.esPerfecto(496);
        tarea5.esPerfecto(871);
        System.out.println(tarea5.esPrimo(33));
        System.out.println(tarea5.esPrimo(89));
        //tarea5.imprimirPrimos(100);
        tarea5.generarSerie();
        tarea5.generarSerieCuadrados();
        tarea5.mostrarTrianguloNumeros(8);
    }

    /**
     * Escribe los impares entre 1 y 100 (con un for).
     * <p>
     * Escribe en cada linea 8
     * numeros con una separacion de una tabulacion entre ellos
     */
    public void impares() {
        int i = 0;
        for (int numero = 1; numero <= 100; numero ++){
            int contador = 0;
           int operacion;
           operacion = numero % 2;
           if (operacion !=0 ){
               System.out.print("\t" + numero);
               i++;
               if (i == 8){
                   System.out.println();
                   i = 0;
               }
              }
           }
        System.out.println();
        }



    /**
     * Escribe los 10 primeros multiplos de n (con for).
     */
    public void multiplos(int n) {

        for (int contador = 1; contador <= 10; contador++) {
            int operacion = n * contador;
            System.out.print(operacion + " ");
        }
        System.out.println();
    }

    /**
     * Calcula y devuelve el producto de a y b mediante sumas.
     * <p>
     * Con while
     */
    public int producto(int a, int b) {
        while(a > 0){
 for(int operacion = a+a; operacion <=b; operacion++){
     System.out.println(operacion);
 }
 break;
        }
        return 0;
    }


    /**
     * calcula y visualiza en pantalla el cociente entero y el resto de dividir a
     * entre b. Se asume que a y b son ambos > 0 y a > b. Si a = 15 y b = 2 entonces
     * cociente = 7 y resto = 1, se calcula mediante restas sucesivas
     */
    public void dividirRestando(int a, int b) {
        if (a > 0 == true && b > 0 == true) {
            if (a > b == true) {
                int operacion1 = a / b;
                int operacion2 = a % b;
                System.out.println("cociente = " + operacion1 + " y resto = " + operacion2);
            } else {
                System.out.println(false);
            }
        } else {
            System.out.println(false);
        }
    }

    /**
     * Genera aleatorios (con Math.random()) entre 10 y 50 (inclusive). Calcula y
     * escribe la media de todos ellos formateada a 2 decimales El proceso termina
     * cuando sale el 50
     * <p>
     * Con while
     */
    public void mediaAleatorios() {
  int aleatorio = 0;
        int suma = 0;
      double contador = 0;
        while (aleatorio != 50){
            aleatorio = (int) (Math.random() * 50 + 10);
            suma += aleatorio;
            contador++;

        }
        System.out.println("La media sera = " + suma / contador);
        System.out.println(" ");
    }


    /**
     * Detecta si un numero es o no perfecto Un numero es perfecto si la suma de sus
     * divisores excepto el mismo es igual al propio numero.
     * <p>
     * Con for
     * <p>
     * Ejemplo - el 6 es perfecto (1 + 2 + 3)
     * <p>
     * 496 es perfecto ( 1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 + 248)
     */
    public boolean esPerfecto(int n) {
     int suma = 1;
        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0){
                suma += i;
            }
        }
        return suma == n;
    }

    /**
     * Detecta si n es un numero primo.
     * <p>
     * Hazlo con un for.
     * <p>
     * En cuanto detectes que el numero no es primo sal del bucle con un return
     * El 1 no es un numero primo.
     */
    public boolean esPrimo(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Escribe los n primeros numeros primos a partir de 2.
     * <p>
     * Usa el metodo anterior esPrimo()
     * <p>
     * Si n = 7 entonces 2 3 5 7 11 13 17
     * <p>
     * Con while
     */
    public void imprimirPrimos(int n) {
        if (n >= 2 ) {
            int operacion = n % 2;
            if (operacion == 0) {
                for(int contador = 2; contador < n; contador++){
                    System.out.print(contador);
                    //revisar
                }
            }
        }

    }

    /**
     * Genera y escribe en pantalla los 15 primeros terminos de la serie:
     * <p>
     * 1 2 4 7 11 16 22 29 .......
     */
    public void generarSerie() {
        int incremento = 1;
        for (int i = 0; i < 15 ; i++) {
            System.out.print( i + incremento + " " );
            incremento+= i;
        }
        System.out.println();
    }

    /**
     * genera y escribe los 20 primeros terminos de la serie indicada.
     * Cada termino es el cuadrado de la posicion que ocupa.
     * <p>
     * Por ejemplo, el termino quinto es 25 (5*5),
     * el termino septimo es 49 (7 * 7).
     * <p>
     * 1 4 9 16 25 36 49 64 81 100 121....
     * <p>
     * En cada fila escribe 8 terminos.
     */
    public void generarSerieCuadrados() {
        for (int i = 0; i <= 20; i++) {
                System.out.print(i * i + " ");
            if ( i % 8 == 0 ){
        System.out.println();
        }
        }
        System.out.println();
        }

    /**
     * Escribe la siguiente figura para el numero de filas indicado
     * como parametro. Deja dos espacios en blanco entre cada numero.
     * <p>
     * Para n = 8 la figura es:
     * <p>
     * 1
     * 3  3  3
     * 5  5  5  5  5
     * 7  7  7  7  7  7  7
     * 9  9  9  9  9  9  9  9  9
     * 11 11 11 11 11 11 11 11 11 11 11
     * 13 13 13 13 13 13 13 13 13 13 13 13 13
     * 15 15 15 15 15 15 15 15 15 15 15 15 15 15 15
     * <p>
     * Haz uso del método escribirEspacios()
     */
    public void mostrarTrianguloNumeros(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < (2 * i - 1); j++) {
                //escribirEspacios(n - i);
                System.out.print(i * 2 - 1 + " ");
            }
            System.out.println();
        }
        }

    /**
     * escribe n espacios en la misma linea (con for).
     */
    public void escribirEspacios(int n) {

    }

}
