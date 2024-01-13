public class Hucha {
    private double dinero;

    public Hucha() {
        this.dinero = 0; //inicalizar a 0
    }

    public double getDinero() {
        return this.dinero; //accesor para saber cuanto dinero hay en la hucha
    }

    public void meterDinero(double incremento) { //incrementa el dinero de la hucha
        this.dinero += incremento;
    }
    public void sacarDinero (double decremento){
        this.dinero -= decremento;
    }
    public void printdetalles(){
        System.out.println(this.dinero);
    }

}