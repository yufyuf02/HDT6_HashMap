import java.util.HashMap;

public class Controlador {

    private HashMapPersonalizado diccionario;

    public Controlador(){
        diccionario = new HashMapPersonalizado(50);
        palabrasIniciales();
    }

    // Cargar las palabras iniciales
    private void palabrasIniciales() {
        diccionario.put("shute", "Alguien entrometido.");
        diccionario.put("pisto", "Dinero.");
        diccionario.put("patojo", "Un niño o alguien jóven.");
    }

    /**
     * Busca un modismo
     * @return La definición si encuentra la palabra.
     */
    public String buscar(String modismo){
        return diccionario.get(modismo.trim());
    }


    /**
     * Crea un modismo
     */
    public void agregar(String modismo, String significado){
        diccionario.put(modismo.trim(), significado.trim());
    }
}