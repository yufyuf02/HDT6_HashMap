public class Palabra {

    private String modismo;
    private String significado;

    public Palabra(String modismo, String significado) {
        this.modismo = modismo;
        this.significado = significado;
    }

    public String getModismo() {
        return modismo;
    }

    public String getSignificado() {
        return significado;
    }

    public void setModismo(String modismo) {
        this.modismo = modismo;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }
    
}
