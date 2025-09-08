import java.util.ArrayList;

public class Tablero {
    private int tamano;
    private ArrayList<Carta> Baraja = new ArrayList<>();
    private ArrayList<String> Simbolos = new ArrayList<>();
    private final Carta [] [] cartas;

    public Tablero (int tamano){
        this.tamano = tamano;
        this.cartas = new Carta[tamano][tamano];
        this.initTablero (tamano);
    }

    public void initTablero (int tamano){
        for (int i = 0; i < tamano; i++){
            for (int ii = 0; ii< tamano; ii++ ){
                this.cartas[i][ii] = new Carta(null, false, false);
                Baraja.add(this.cartas[i][ii]);
            }
        }
    }



}
