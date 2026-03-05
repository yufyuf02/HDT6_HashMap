public class HashFunction {
    
    public int hashCode(String modismo) {
        
        String result = "";

        for (int i = 0; i < modismo.length(); i++) {
            char ch = modismo.charAt(i);

            if (Character.isLetter(ch)) {
                char initialCharacter = Character.isUpperCase(ch) ?  'A' : 'a';
                result = result.concat(String.valueOf(ch - initialCharacter + 1));
            } else result = result + ch;
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        HashFunction generarHash = new HashFunction();

        int numero = generarHash.hashCode("Hola");
        System.out.println(numero);
    }
}