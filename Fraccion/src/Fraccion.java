public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion() {
        this.numerador = 0;
        this.denominador = 0;

    }

    public Fraccion(int numerador , int denominador) {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }

    public int getNumerador() {
        return this.numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion otra) {
        if (this.denominador == otra.denominador) {
            return new Fraccion(this.numerador + otra.numerador,
                    this.denominador);
        } else {
            int denominador = this.denominador * otra.denominador;
            int numerador1 = denominador / this.denominador * this.numerador;
            int numerador2 = denominador / otra.denominador * otra.numerador;
            return new Fraccion(numerador1 - numerador2, denominador);
        }

    }

    public int mcm(int numero1, int numero2) {
        if (numero1 == numero2) {
            return numero1;
        }

        int max = numero2;
        if (numero1 > numero2) {
            max = numero1;
        }
        int minimo = numero1 + numero2 - max;
        int mcm = max;

        boolean encontrado = false;
        while (!encontrado) { // apuntes manu no hacer caso si no se cumpel eta entrando todo el rato y comprobvando hasta que se cumpla y en ses caso pondra true y comprabara el if para ver entre que numero se pude dibidir el minimo y sea de resto o
            if (mcm % minimo == 0) {
                encontrado = true;
            } else {
                mcm = max + max;
            }

        }
        return mcm;
    }
    public Fraccion multiplicar (Fraccion otra){
        return new Fraccion(
                this.numerador* otra.numerador,
                this.denominador * otra.denominador);
    }
    public Fraccion dividir (Fraccion otra){
        return new Fraccion(
                this.numerador* otra.denominador,
                this.denominador * otra.numerador);
    }

    public boolean igualQue(Fraccion otra){
        return  this.numerador == otra.numerador &&
                this.denominador == otra.denominador;
    }
    public boolean igualOEquivalenteQue(Fraccion otra){ //dividen y comparan resultados
        return  this.numerador / (double) this.denominador ==
                otra.numerador / (double) otra.denominador;
    }

    public boolean menorQue(Fraccion otra) {
            return  this.numerador / (double) this.denominador <
                    otra.numerador / (double) otra.denominador;

    }
    public Fraccion clonar (){
        return new Fraccion(this.numerador, this.denominador);
    }
    private void  simplificar(){ //apuntes de manu sirve para ir simplificando los numeradores y los denominadores ya que aqui hace que el numero1 sea el numerador y el numero2 el denominador
        int simplificador = mcd(numerador, denominador);
        numerador/= simplificador;
        denominador /= simplificador;

    }
    private int mcd(int numero1, int numero2){ // apuntes manu introduce dos valores el bucle comprueba si denomindaro o el segundo numero  ye difernte de 0 luego salta y dice el numero dos llamase a hora acumulador
        // luego el numero dos coge otro resultado que es del resto de dividir numero1 entre numero2 y ese resultado pasaria a ser ahora numero 2 luego el numero uno pasaria a ser el antuguo resultado de numero2 asi asta que
       //numero2 sea == 0 y entonces escribira el ultimo numero que es numero1
        while (numero2 != 0){
            int acumulador = numero2;
            numero2 = numero1 % numero2;
            numero1 = acumulador;
        }

         return numero1;
    }

    public String toString() {
        return new StringBuilder(this.numerador).append("/")
                .append(this.denominador).toString();
    }
}
