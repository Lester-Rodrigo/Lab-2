public class Carta {
    private String simbolo;
    private boolean cartaRevelada;
    private boolean parejaEncontarda;

    public Carta (String simbolo, boolean cartaRevelada, boolean parejaEncontarda) {
        this.simbolo = simbolo; 
        this.cartaRevelada = cartaRevelada;
         this.parejaEncontarda = parejaEncontarda;
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
