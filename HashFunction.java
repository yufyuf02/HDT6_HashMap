public class HashFunction {
    
    public int generarHash(String modismo) {
        
        String result = "";

        for (int i = 0; i < modismo.length(); i++) {
            char ch = modismo.charAt(i);

            if (Character.isLetter(ch)) {
                char initialCharacter = Character.isUpperCase(ch) ?  'A' : 'a';
                result = result.concat(String.valueOf(ch - initialCharacter + 1));
            } else result = result + ch;
        } 

        return modismo.length() * Integer.parseInt(result); // El resultado es el producto de la longitud del modismo con la concatenación de los valores de las letras (A=1, B=2, ...)
    }

}