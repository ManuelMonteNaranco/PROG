import java.util.Scanner;

public class Main {
    private static final int NUM_POKEMONS = 5;
    private static Pokemon[] pokemons = new Pokemon[NUM_POKEMONS];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = 0;

        do {
            System.out.println("Eliga una opcion:");
            System.out.println("1. Utilizar pokemons del juego");
            System.out.println("2. Crear los pokemons aleatoriamente");
            System.out.println("3. Salir");
            numero = scanner.nextInt();
        } while (numero<= 3);{
            switch (numero){
                case 1:
                    initPokemons();
                    initCombat();
                case 2:
                    initPokemonsRandomly();
                    initCombat();
                case 3:
                    System.out.println("Adios");

                default:
                    System.out.println("Error");
                    break;
            }
        }

    }

    private static void initPokemons() {
        Pokemon charizard = new Pokemon(100, 50, 50, "charizard");
        pokemons[0] = charizard;
        Pokemon blastoise = new Pokemon(150, 25, 150, "blastoire");
        pokemons[1] = blastoise;
        Pokemon venusaur = new Pokemon(300, 10, 100, "venusaur");
        pokemons[2] = venusaur;
        Pokemon bulbasaur = new Pokemon(250, 20, 180, "bulbasaur");
        pokemons[3] = bulbasaur;
        Pokemon pikachu = new Pokemon(300, 40, 200, "pikachu");
        pokemons[4] = pikachu;
    }
    private  static  void  initPokemonsRandomly(){
        for (int i = 0; i < pokemons.length; i++) {
            System.out.println(pokemons[i].getName());

        }
    }
    private static void showPokemons(){
        for (int i = 0; i < pokemons.length; i++) {
            System.out.println(pokemons[i].getName());
        }
    }
    private   static   void   initCombat(){
        Scanner tcl = new Scanner(System.in);
        String pokemon1 = " ";
        String pokemon2 = " ";
        showPokemons();
        System.out.println("Elige un poquemon a enfrentar->");
        pokemon1 = tcl.next();
        pokemon2 = tcl.next();

        Battle.initBattle((String) pokemon1,(String) pokemon2);

    }


}