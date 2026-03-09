import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapPersonalizado {

    public ArrayList<LinkedList<String>> diccionario = new ArrayList<LinkedList<String>>(); // El diccionario es un ArrayList de LinkedLists
    public int size;
    public HashFunction funcion;

    public HashMapPersonalizado(int size) {
        this.size = size;
    }

    public String get(String modismo) {
        int index = funcion.generarHash(modismo);
        // return diccionario[index];
    }

    public void put(String modismo, String significado) {
        int index = funcion.generarHash(modismo);

        /* 
            if (diccionario[index] == null) {
                diccionario[index] = new Node(String modismo, String significado);
            } else {
                (agregar Nodo al LinkedList que se encuentra en el index)
                }
        */ 
    }
    
}
