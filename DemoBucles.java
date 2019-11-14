import java.util.Random;
/**
 *    @author - Eunate Ibarrola Santesteban 
 */
public class DemoBucles
{
    private final char ASTERISCO = '*';
    private final char ESPACIO = ' ';
    private Random generador;

    /**
     * Constructor  
     */
    public DemoBucles()
    {
        generador = new Random();
    }

    /**
     * Calcular la mayor potencia de 2 que es menor o igual a numero
     * Asumimos numero > 0
     * 
     * Si numero = 7 devuelve 4             numero = 8 devuelve 8
     *    numero = 19 devuelve 16           numero = 32 devuelve 32
     *    numero = 74 devuelve 64           numero = 1 devuelve 1
     *    numero = 190 devuelve 128
     *    
     *  Usa bucles while
     */
    public int mayorPotencia2(int numero) {
        int i = 1;
        while (i * 2 < numero) {
            i *= 2;
        }
        return i;
    }

    /**
     * Escribir numero como suma de potencias de 2 
     * tal como indica el enunciado (Se asume numero > 0)
     * 
     * Todos los valores se muestran en pantalla fomateados a 6 posiciones 
     * y ajustados a la derecha
     * 
     * Hay que usar el método anterior - 
     * Utiliza bucles while
     * 
     *  77 =    64     8     4     1
     * 215 =   128    64    16     4     2     1
     *  18 =    16     2
     *  64 =    64
     */
    public void escribirSumaPotencias(int numero) {        
        int aux = numero;
        String str = String.format("%6d = %6d", numero, mayorPotencia2(aux));
        mayorPotencia2(aux);
        while (aux != mayorPotencia2(aux)){
            aux -= mayorPotencia2(aux);
            str = str + String.format("%6d", mayorPotencia2(aux));
        }
        System.out.println(str);
    }

    /**
     * Generar aleatorios entre 0 y 255
     * y escribir cada aleatorio como suma de potencias de 2
     * Parar al salir el 255 o despues de generar n aleatorios
     * (ver enunciado)
     * 
     * Hay que usar el método anterior
     * 
     * Utiliza bucles while
     * 
     */
    public void generarAleatorios(int n) {
        System.out.println("Nºs aleatorios como suma de potencias de 2: \n");
        int aux = generador.nextInt(256);
        int i = 1;
        while (aux != 0 && i <= n) {            
            escribirSumaPotencias(aux);
            if (aux == 0) {
                System.out.println("Bucle terminado porque el numero del aleatorio es 0");
            }
            aux = generador.nextInt(256); 
            i++;
        }
        System.out.println("Bucle terminado porque se han generado ya " + n + " aleatorios"); 
    }

    /**
     *  Escribe en pantalla caracter n veces en la misma línes
     *  
     *  Usa bucles for
     */
    public void escribirCaracter(int n, char caracter)
    {
        for (int c = 1; c <= n; c++){
            System.out.print(caracter);        
        }
    }

    /**
     *  Genera la figura tal como muestra el enunciado 
     *  con ayuda del método anterior
     *  
     *   Usa bucles for
     */
    public  void mostrarEscalera(int escalones, int alto, int ancho) {
        System.out.println();
        for (int es = 1; es <= escalones; es++) {
            int auxEspacio = 0;
            int espacios = 0;
            for (int aux = 1; aux <= alto; aux++) {
                escribirCaracter(ancho, ASTERISCO);
                escribirCaracter(espacios, ESPACIO);
                System.out.println();
                auxEspacio++;
            } 
            espacios = auxEspacio + ancho;
        }
    }
}

