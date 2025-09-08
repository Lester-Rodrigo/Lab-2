import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Atributos para permitir recorrer el programa
    Scanner input = new Scanner(System.in);
    int pagina;
    // Atributos para el jugador
    String nombreJ1;
    String nombreJ2;
    // Atributos para crear el tablero
    int tamano;

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
                    System.out.println("Ingrese el tamaño del tablero: ");
                    tamano = datos.nextInt();
                    break;
            
                case 2:
                    datos = new Scanner(System.in);
                    System.out.println("Ingrese el nuevo simbolo: ");
                    nombreJ1 = datos.nextLine();
                    break;

                case 3:
                    System.exit(0);
                    break;    
            }
        } while (pagina != 2 );
    }
}
