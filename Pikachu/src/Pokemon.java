public class Pokemon {
    private int healt;
    private int strength;
    private int speed;
    private String name;

    private final int INITIAL_HEALTH = 301;
    private final int INITIAL_STRENGTH = 51;
    private final int INITIAL_SPEED = 201;

    public Pokemon(int constante) {
        int numero;
        numero = (int) Math.random()*constante;
        this.healt = numero ;
        this.strength = numero;
        this.speed = numero;
        this.name = "  ";
    }

    public Pokemon(int healt, int strength, int speed, String name) {
        this.healt = healt;
        this.strength = strength;
        this.speed = speed;
        this.name = name;
    }

    public int getHealt() {
        return healt;
    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public void setName(String name) {
        this.name = name;
    }
}
