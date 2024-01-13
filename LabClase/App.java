public class App {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Adolf", "3333333");
        Estudiante e2 = new Estudiante("Rafa Nadal", "3030330330330");
        Estudiante e3 = new Estudiante("Pablo Motos", "373430894587530");
        Estudiante e4 = new Estudiante("Adolf", "3333333");
        Estudiante e5 = new Estudiante("Rafa Nadal", "3030330330330");
        Estudiante e6 = new Estudiante("Pablo Motos", "373430894587530");



        Laboratorio lab = new Laboratorio(5);


        System.out.println(e1.getLoginName());//4 primeros caracteres del nombre y otros 3 primeros de el segundo pero si es menos de 4 peta


        e1.anadirCreditos(60);
        e2.anadirCreditos(100);
        e3.anadirCreditos(200);


        e1.escribir(); //va a donde esta escribir e imprime
        e2.escribir();
        e3.escribir();


        lab.matricularEstudiante(e1);
        lab.matricularEstudiante(e2);
        lab.matricularEstudiante(e3);
        lab.matricularEstudiante(e4);
        lab.matricularEstudiante(e5);
        lab.matricularEstudiante(e6);



        lab.escribirLista();
    }
}
