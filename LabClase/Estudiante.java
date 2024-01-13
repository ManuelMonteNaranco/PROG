
/**
 * The Estudiante class represents a Estudiante in a Estudiante administration system.
 * It holds the Estudiante details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 */
public class Estudiante
{
    // the Estudiante's full name
    private String name;
    // the Estudiante ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;

    /**
     * Create a new Estudiante with a given name and ID number.
     */
    public Estudiante(String fullName, String EstudianteID)
    {
        name = fullName;
        id = EstudianteID;
        credits = 0;
    }

    /**
     * Return the full name of this Estudiante.
     */
    public String getNombre()
    {
        return name;
    }

    /**
     * Set a new name for this Estudiante.
     */
    public void cambiarNombre(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the Estudiante ID of this Estudiante.
     */
    public String getEstudianteID()
    {
        return id;
    }

    /**
     * Add some credit points to the Estudiante's accumulated credits.
     */
    public void anadirCreditos(int additionalPoints)
    {
        credits += additionalPoints;
    }

    /**
     * Return the number of credit points this Estudiante has accumulated.
     */
    public int getCreditos()
    {
        return credits;
    }

    /**
     * Return the login name of this Estudiante. The login name is a combination
     * of the first four characters of the Estudiante's name and the first three
     * characters of the Estudiante's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * escribir the Estudiante's name and ID number to the output terminal.
     */
    public void escribir()
    {
        System.out.println(name + ", Estudiante ID: " + id + ", credits: " + credits);
    }
}
