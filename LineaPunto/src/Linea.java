public class Linea {
    private Punto punto1;
    private Punto punto2;

    public Linea(){
        punto1 = new Punto(0, 0);
        punto2 = new Punto(0,0);
    }
    public Linea(int x, int y){
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    public void moverDerecha(int distancia){
       this.punto1.despalza(distancia,0);
       this.punto2.despalza(distancia,0);

    }
    public void moverIzquierda(int distancia){
        this.punto1.despalza(distancia*-1,0);
        this.punto2.despalza(distancia*-1,0);
    }

    public void moverArriba(int distancia){
        this.punto1.despalza(0,distancia);
        this.punto2.despalza(0,distancia);
    }
    public void moverAbajo(int distancia) {
        this.punto1.despalza(distancia,0);
        this.punto2.despalza(distancia,0);
    }

    public Punto getPunto1() {
        return punto1;
    }
    public Punto getPunto2(){
        return punto2;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
    public void printLinea(){
        System.out.println(this);
    }

    public String toString() {
        StringBuilder resutado =new StringBuilder();


        resutado.append("Punto1 - ");
        resutado.append(this.punto1);
        resutado.append("Punto2 - ");
        resutado.append(this.punto2);

        return resutado.toString();
    }
}
