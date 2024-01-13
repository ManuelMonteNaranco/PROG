public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean esBisiesto() {
        if ((this.anio % 4 == 0 && this.anio % 100 != 0) || (this.anio % 100 == 0 && this.anio % 400 == 0)) {
            return true;
        }
        return false;
    }

    public int diasMes() {
        int dias = 0;
        switch (mes) {
            case 2:
                if (esBisiesto())
                    dias = 29;
                else
                    dias = 28;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
        }
        return dias;
    }

    public void printCorta() {
        System.out.println(this.dia + "-" + this.mes + "-" + this.anio);
    }

    public void printLarga() {
        String stringMes = "";
        switch (mes) {
            case 1:
                stringMes = "Enero";
                break;
            case 2:
                stringMes = "Febrero";
                break;
            case 3:
                stringMes = "Marzo";
                break;
            case 4:
                stringMes = "Abril";
                break;
            case 5:
                stringMes = "Mayo";
                break;
            case 6:
                stringMes = "Junio";
                break;
            case 7:
                stringMes = "Julio";
                break;
            case 8:
                stringMes = "Agosto";
                break;
            case 9:
                stringMes = "Septiembre";
                break;
            case 10:
                stringMes = "Octubre";
                break;
            case 11:
                stringMes = "Noviembre";
                break;
            case 12:
                stringMes = "Diciembre";
                break;
        }
        System.out.println(this.dia + " de " + stringMes + " de " + this.anio);
    }

    public boolean esCorrecta() {
       boolean diaCorrecto = (this.dia >=1 && this.dia <= diasMes());
       boolean mesCorrecto = this.mes >= 1 && this.mes<=12;

    return diaCorrecto && mesCorrecto;
    }
    public boolean precedeA(int queDia, int queMes, int queAnio){
        boolean resultado = true;

        if (this.anio > queAnio){
            resultado = false;
        }else  if (this.anio == queAnio){
            if (this.mes > queMes){
                resultado = false;
            } else if (this.mes == queMes) {
                resultado = this.dia > queDia;
            }
        }
        return resultado;
    }
}

