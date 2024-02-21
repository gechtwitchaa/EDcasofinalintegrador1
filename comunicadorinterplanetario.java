public class comunicadorinterplanetario {
    public static int contarVocales(String mensaje) {
        int conteo = 0;
        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                conteo++;
            }
        }
        return conteo;
    }

 