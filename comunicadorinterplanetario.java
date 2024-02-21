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

    public static String invertirMensaje(String mensaje) {
        StringBuilder mensajeInvertido = new StringBuilder();
        for (int i = mensaje.length() - 1; i >= 0; i--) {
            mensajeInvertido.append(mensaje.charAt(i));
        }
        return mensajeInvertido.toString();
    }

    public static boolean esPalindromo(String mensaje) {
        String mensajeSinEspacios = mensaje.replaceAll("\\s+", "").toLowerCase();
        int longitud = mensajeSinEspacios.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (mensajeSinEspacios.charAt(i) != mensajeSinEspacios.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String mensaje = "Anita lava la tina";


        int vocales = contarVocales(mensaje);
        System.out.println("Número de vocales en el mensaje: " + vocales);


        String mensajeInvertido = invertirMensaje(mensaje);
        System.out.println("Mensaje invertido: " + mensajeInvertido);

        
        boolean esPalindromo = esPalindromo(mensaje);
        System.out.println("¿El mensaje es un palíndromo?: " + esPalindromo);
    }
}
