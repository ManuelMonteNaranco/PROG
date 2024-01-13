public class TresNumeros {

    private int numero1;
    private int numero2;
    private int numero3;

    public TresNumeros(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int getMaximo() {
        return numero1Mayor();

    }
    public int numero1Mayor() {
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                return numero1;
            } else {
                return numero3;
            }
        }
        return numero2Mayor();
    }
        public int numero2Mayor() {
           if(numero2>numero1){
               if (numero2 > numero3){
                   return numero2;
               } else {
                   return numero3;
               }
            }
           return numero3;
        }

    public int getMinimo() {
        if (numero1 < numero2 && numero1 < numero3) {
            return numero1;
        } else if (numero2 < numero2 && numero2 < numero3) {
            return numero2;
        }
        return numero3;
    }

    public boolean sonIguales() {
        if (this.numero1 == this.numero2 && this.numero1 == this.numero3) {
            return true;
        }
        return false;
    }
    private boolean esPar(int numero){
        return numero % 2==0;
    }

    public int cuntosPares() {
 int cuantosPares = 0;

 if (esPar(this.numero1)){
     cuantosPares++;
 }
 if (esPar(this.numero2)) {
            cuantosPares++;
        }
 if (esPar(this.numero3)) {
     cuantosPares++;
 }
 return cuantosPares;
    }
    public int cuntosAcabanEnSiete() {
        int operacion1 = numero1 % 10;
        int operacion2 = numero2 % 10;
        int operacion3 = numero3 % 10;
        if (operacion1 == 7 && operacion2 == 7 && operacion3 == 7) {
            return 3;
        } else if (operacion1 == 7 && operacion2 == 7 ||operacion1 == 7 && operacion3 == 7||operacion2 == 7 && operacion3 == 7) {
            return 2;
        }else if (operacion1 == 7 || operacion2 == 7 || operacion3 == 7) {
            return 1;
        }
        return 0;
    }
    public void ordenar() {
        int cetrarl = this.numero1 + this.numero2 + this.numero3 - getMaximo() - getMinimo();
        this.numero1 = getMinimo();
        this.numero3 = getMaximo();
        this.numero2 = cetrarl;
    }
}

