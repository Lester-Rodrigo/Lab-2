public class Carta {
    private String simbolo;
    private boolean cartaRevelada;
    private boolean parejaEncontarda;

    public Carta (String simbolo) {
        this.simbolo = simbolo; 
        this.cartaRevelada = false;
         this.parejaEncontarda = false;
    }

    public String getSimbolo () {
        return simbolo;
    }

    public boolean getCartaRevelada () {
        return cartaRevelada;
    }

    public boolean getParejaEncontarda () {
        return parejaEncontarda;
    }

    public void setSimbolo (String simbolo) {
        this.simbolo = simbolo;
    }
    public void setCartaRevelada (boolean cartaRevelada) {
        this.cartaRevelada = true;
    }

    public void setParejaEncontarda (boolean parejaEncontarda) {
        this.parejaEncontarda = true;
    }
}
