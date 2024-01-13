
/**
 *  clase FrecuenciaDado 
 *  
 */
public class FrecuenciaDado {
    private Dado dado;
    private int frecuencia;

    /**
     * Constructor de la clase FrecuenciaDado
     */
    public FrecuenciaDado(Dado dado, int frecuencia) {
        this.dado = dado;
        this.frecuencia = frecuencia;
    }

    /**
     * tirar el dado n veces y contabilizar la frecuencia de aparición
     * de la tirada
     */
    public void  tirarDado(int veces) {
        for (int i = 0; i < veces; i++) {
            dado.tirarDado();
        }
    }

    /**
     *  Mostrar las frecuencias
     */
    public void escribirFrecuencia() {
        System.out.println("Cara" + "\n" + dado.getCara());
        System.out.println("Frecuencia" + "\n" + NumeroDevecesque());


    }
    private static  int NumeroDevecesque(){
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;
        Dado dado1 = null;
        if (dado1.getCara() == 1) {
           return contador1++;
        }else
        if (dado1.getCara() == 2) {
            return contador2++;
        }else
        if (dado1.getCara() == 3) {
           return contador3++;
        }else
        if (dado1.getCara() == 4) {
            return contador4++;
        }else
        if (dado1.getCara() == 5) {
            return contador5++;
        }
        return contador6++;
    }
}
