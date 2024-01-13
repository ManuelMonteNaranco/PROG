public class Ejercicio4pto12 {
    private int diasMes;

    public Ejercicio4pto12(){
        this.diasMes =  30;
        this.diasMes = 31;
        this.diasMes = 28;
        this.diasMes = 29;
    }
    public int contadrDias(int dias, int mes, int anio){
        int sumaTotalDias= 0;
        if (esBisiesto(anio) == true) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                int sumadiascondiasmes = dias + (31 * mes);
                sumaTotalDias = sumadiascondiasmes;

            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                int sumadiascondiasmes = dias + (30 * mes);
                sumaTotalDias = sumadiascondiasmes;
            } else if (mes == 2) {
                int sumadiascondiasmes = dias + (28 * mes);
                sumaTotalDias = sumadiascondiasmes;
            }
        } else  if (esBisiesto(anio) == false){
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                int sumadiascondiasmes = dias + (31 * mes);
                sumaTotalDias = sumadiascondiasmes;

            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                int sumadiascondiasmes = dias + (30 * mes);
                sumaTotalDias = sumadiascondiasmes;
            } else if (mes == 2) {
                int sumadiascondiasmes = dias + (29 * mes);
                sumaTotalDias = sumadiascondiasmes;
            }

        }
        return sumaTotalDias;
    }
    public boolean esBisiesto (int anio){
        if (anio % 4 == 0){
            return true;
        }
        return false;
    }


}
