import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Atributos para permitir recorrer el programa
    Scanner input = new Scanner(System.in);
    int pagina;
    // Atributos para el jugador
    String nombreJ1;
    String nombreJ2;
    // Atributos para el jugador
    String simboloNuevo;
    // Atributos para crear el tablero
    int tamano;
    // Controlador
    Controlador control = new Controlador();

        do {
            do{
                System.out.println("1. Iniciar juego: ");
                System.out.println("2. Agregar simbolos: ");
                System.out.println("3. Salir: ");
                System.out.println("Ingrese alguna opción (Del 1 al 3): ");
                pagina = input.nextInt();
            }while (pagina < 1 && pagina > 3 );
            switch (pagina) {

                case 1:
                    Scanner datos = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del jugador 1: ");
                    nombreJ1 = datos.nextLine();
                    System.out.println("Ingrese el nombre del jugador 2: ");
                    nombreJ2 = datos.nextLine();
                    System.out.println("Ingrese el tamaño del tablero (osea la cantidad de parejas): ");
                    tamano = datos.nextInt();
                    control.jugar(nombreJ1, nombreJ2, tamano);
                    break;
            
                case 2:
                    datos = new Scanner(System.in);
                    System.out.println("Ingrese el nuevo simbolo: ");
                    simboloNuevo = datos.nextLine();
                    control.AgregarSimbolo(simboloNuevo);
                    break;

                case 3:
                    System.exit(0);
                    break;    
            }
        } while (pagina != 2 );
    }
}
