public class Battle {
    public static void initBattle(String pokemon1, String pokemon2) {
        if (pokemon1.getHealt() > pokemon2.getHealt()) {
            if (pokemon1.getHealt() < 0 && pokemon2.getHealt() < 0) {
                System.out.println("Empieza atacando " + pokemon1.getName() + " Contra " + pokemon2.getName());
                pokemon1.setHealt(pokemon1.getHealt() - pokemon2.getStrength());
                pokemon2.setHealt(pokemon2.getHealt() - pokemon1.getStrength());
                System.out.println(pokemon1.getName() + " daña " + pokemon1.getStrength() + " a " + pokemon2.getName() + " y a " + pokemon2.getName()
                        + " le queda " + pokemon2.getHealt() + " vida " + pokemon2.getName() + " daña " + pokemon2.getStrength() + " a " + pokemon1.getName()
                        + " y a " + pokemon1.getName() + " le queda " + pokemon1.getHealt() + " vida.");
            } else {
                System.out.println(pokemon1.getName() + " daña " + pokemon1.getStrength() + " a " + pokemon2.getName() + " y a " + pokemon2.getName()
                        + " le queda " + pokemon2.getHealt() + " vida " + pokemon2.getName() + " daña " + pokemon2.getStrength() + " a " + pokemon1.getName()
                        + " y a " + pokemon1.getName() + " le queda " + pokemon1.getHealt() + " vida.");
            }
        } else {
            if (pokemon1.getHealt() < 0 && pokemon2.getHealt() < 0) {
                System.out.println("Empieza atacando " + pokemon2.getName() + " Contra " + pokemon1.getName());

                pokemon2.setHealt(pokemon2.getHealt() - pokemon1.getStrength());
                pokemon1.setHealt(pokemon1.getHealt() - pokemon2.getStrength());

                System.out.println(pokemon2.getName() + " daña " + pokemon2.getStrength() + " a " + pokemon1.getName() + " y a " + pokemon1.getName()
                        + " le queda " + pokemon1.getHealt() + " vida " + pokemon1.getName() + " daña " + pokemon1.getStrength() + " a " + pokemon2.getName()
                        + " y a " + pokemon2.getName() + " le queda " + pokemon2.getHealt() + " vida.");
            } else {
                System.out.println(pokemon2.getName() + " daña " + pokemon2.getStrength() + " a " + pokemon1.getName() + " y a " + pokemon1.getName()
                        + " le queda " + pokemon1.getHealt() + " vida " + pokemon1.getName() + " daña " + pokemon1.getStrength() + " a " + pokemon2.getName()
                        + " y a " + pokemon2.getName() + " le queda " + pokemon2.getHealt() + " vida.");
            }

        }
    }
}
