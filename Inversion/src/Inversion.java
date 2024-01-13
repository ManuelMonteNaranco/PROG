public class Inversion {
    private double cantidadInicial;
    private double tipoInteres;

    public Inversion ( double cantidadInicial, double tipoInteres){
        this.cantidadInicial = cantidadInicial;
        this.tipoInteres = tipoInteres;
}

    public double getCantidadInicial() {
        return cantidadInicial;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double despuesDe(int anios){
           double cantidad = this.cantidadInicial;
           for (int i = 0; i < anios; i++){
               cantidad+= cantidad * this.tipoInteres /100;
           }
           return cantidad;

        }
        public int aniosHastaObjetivo(double importeObjetivo){
        int anios = 0;
        while (despuesDe(anios) < importeObjetivo){
            anios++;
        }
            return anios;
        }
        public String tablaDespuesDe(int anios){

        return "Cantidad inical: " + this.cantidadInicial + "\nInteres anual 5.0%\naño"+"       " + "Balance\n" + anios + despuesDe(anios);

        }

}
