
/**
 *  @author - 
 *  
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class AppDemoBucles
{

    /**
     *  Punto de entrada a la aplicación. Dentro del main:
     *  - define y crea el teclado  
     *  - define e instancia un objeto DemoBucles
     *  - pide la cantidad tope  máxima de aleatorios a generar
     *  - valida que ese tope esté entre 10 y 15
     *  - muestra los números generados como suma de potencias de 2
     *  
     *  - haz una pausa y borra la pantalla 
     *  
     *  - muestra la figura para 6 escalones de alto = 4 y ancho = 12
     *  
     *  
     */
    public static void main(String[] args)
    {
        System.out.println();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Teclee el valor de la base: ");
        int base1 = teclado.nextInt();
        System.out.println("Teclee el valor del exponente: ");
        int exponente1 = teclado.nextInt();
        Exponencial exponencial1 = new Exponencial(base1, exponente1);
        System.out.println("Teclee el valor de la base: ");
        int base2 = teclado.nextInt();
        System.out.println("Teclee el valor del exponente: ");
        int exponente2 = teclado.nextInt();
        Exponencial exponencial2 = new Exponencial(base2, exponente2);
        while (base1 != base2) {
            System.out.println("Error\nTeclee el valor de la base: ");
            base2 = teclado.nextInt();
            System.out.println("Teclee el valor del exponente: ");
            exponente2 = teclado.nextInt();
            exponencial2 = new Exponencial(base2, exponente2);
        }
        Exponencial producto = exponencial1.multiplicar(exponencial2);
        Exponencial dividir = exponencial1.dividir(exponencial2);
        Exponencial elevar = exponencial1.elevar(7);
        System.out.println("Exponencial 1\n\t" + exponencial1.toString());
        System.out.println("Exponencial 2\n\t" + exponencial2.toString());
        System.out.println("Producto\n\t" + producto.toString());
        System.out.println("Cociente\n\t" + dividir.toString());
        System.out.println("Potencia 7 de número exponencial 1\n\t" + 
                           elevar.toString());
    }
}

