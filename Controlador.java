public class Controlador {
    private Tablero tablero;

    public Controlador (){
    }

    public String jugar (String nombreJ1, String nombreJ2, int tamano) {
        if ((int) Math.pow(2, tamano) <= tablero.getSimbolos().size()) {
            this.tablero = new Tablero((int) Math.pow(2, tamano)); 
            tablero.initTablero((int) Math.pow(2, tamano));
            tablero.getCarta(tamano, tamano);
            for (int i = 0; i < tamano; i++){
            for (int ii = 0; ii< tamano; ii++ ){
                tablero.getCarta(i, ii);
            }
        }
        }
        else {

        }
        return (" Carta " + tablero.getCarta(0, 0));
    } 

    public String AgregarSimbolo (String simbolo){
        tablero.agregarSimbolo(simbolo);
        return "Simbolo ingresado correctamente";
    }
}
