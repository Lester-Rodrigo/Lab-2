public class Jugador {
    private String nombre;
    private int puntos;
    private int juegosGanados;
    
    public Jugador (String nombre, int puntos, int juegosGanados) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.juegosGanados = juegosGanados;
    }

    public String getNombre () {
        return nombre;
    }

    public int getPuntos () {
        return puntos;
    }

    public int getJuegosGanados() {
        return juegosGanados;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos (int puntos) {
        this.puntos = puntos;
    }

    public void setJuegosGanados (int juegosGanados) {
        this.juegosGanados = juegosGanados;
    }
}