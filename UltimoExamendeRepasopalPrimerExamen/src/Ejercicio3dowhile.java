import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Ejercicio3dowhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
    do {
        System.out.println("********************************************");
        System.out.println("Buenas que opcion quiere escojer");
        System.out.println("********************************************");
        System.out.println("Entrar al juego");
        System.out.println("Entrar a edicion de armas");
        System.out.println("Entrar a la edicion");
        System.out.println("Editar Skin");
        System.out.println("Opciones");
        System.out.println("Salir");
        System.out.println("un numero entre el 1-6");
        numero = teclado.nextInt();
    }
    while (numero <=6);{
    switch (numero){
        case 1:
            System.out.println("A elejido entrar al juego");
            break;
        case 2:
            System.out.println("A elejido edicion de armas");
            break;
        case 3:
            System.out.println("A elejido ir a la tienda");
            break;
        case 4:
            System.out.println("A elejido Editar Skin");
            break;
        case 5:
            System.out.println("Escogio opciones");
            break;
        case 6:
            System.out.println(" Escocgio salir adios");
            break;
        default:
            System.out.println("error");
            break;
    }
        }
        System.out.println();
    }
}
