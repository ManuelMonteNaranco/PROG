import java.util.*;

/**
 * The Laboratorio class represents an enrolment list for one lab class. It stores
 * the time, room and participants of the lab, as well as the instructor's name.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 */
public class Laboratorio
{
    private String instructor;
    private String room;
    private String timeAndDay;
    private ArrayList<Estudiante> students;
    private int capacity;
    
    /**
     * Create a Laboratorio with a maximum number of enrolments. All other details
     * are set to default values.
     */
    public Laboratorio(int maxnumeroEstudiantes)
    {
        instructor = "unknown";
        room = "unknown";
        timeAndDay = "unknown";
        students = new ArrayList<Estudiante>();
        capacity = maxnumeroEstudiantes;
    }

    /**
     * Add a student to this Laboratorio.
     */
    public void matricularEstudiante(Estudiante newStudent)
    {
        if(students.size() == capacity) {
            System.out.println("The class is full, you cannot enrol.");
        }
        else {
            students.add(newStudent);
            //add=añade a una lista
        }
    }
    
    /**
     * Return the number of students currently enrolled in this Laboratorio.
     */
    public int numeroEstudiantes()
    {
        //donde se esta guardando los estudidantes para las listas se necesita el .size
        return students.size();
    }
    
    /**
     * Set the room number for this Laboratorio.
     */
    public void setRoom(String roomNumber)
    {
        room = roomNumber;
    }
    
    /**
     * Set the time for this Laboratorio. The parameter should define the day
     * and the time of day, such as "Friday, 10am".
     */
    public void setTime(String timeAndDayString)
    {
        timeAndDay = timeAndDayString;
    }
    
    /**
     * Set the name of the instructor for this Laboratorio.
     */
    public void setInstructor(String instructorName)
    {
        instructor = instructorName;
    }
    
    /**
     * Print out a class list with other Laboratorio details to the standard
     * terminal.
     */
    public void escribirLista()
    {
        System.out.println("Lab class " + timeAndDay);
        System.out.println("Instructor: " + instructor + "   Room: " + room);
        System.out.println("Class list:");
        for(Estudiante student : students) {
            student.escribir();
        }
        System.out.println("Number of students: " + numeroEstudiantes());
    }
}
