import java.util.ArrayList;

public class Tablero {
    private int tamano;
    private ArrayList<String> Simbolos = new ArrayList<>();
    private final Carta [] [] cartas;

    public Tablero (int tamano){
        this.tamano = tamano;
        this.cartas = new Carta[tamano][tamano];
        Simbolos.add("A");
        Simbolos.add("A");
        Simbolos.add("B");
        Simbolos.add("B");
        this.initTablero (tamano);
    }

    public int getTamano () {
        return tamano;
    }

    public Carta getCarta (int i, int ii) {
        return this.cartas[i][ii];
    }

    public ArrayList<String> getSimbolos () {
        return Simbolos;
    }

    public void setTamano (int tamano) {
        this.tamano = tamano;
    }


    public void initTablero (int tamano){
        for (int i = 0; i < tamano; i++){
            for (int ii = 0; ii< tamano; ii++ ){
                int simboloRandom = (int) (Math.random())*Simbolos.size();
                this.cartas[i][ii] = new Carta(null);
                this.cartas[i][ii].setSimbolo(Simbolos.get(simboloRandom));
                Simbolos.remove(simboloRandom);
            }
        }
    }

    public void agregarSimbolo (String simbolo) {
        Simbolos.add(simbolo);
        Simbolos.add(simbolo);
    }
}
