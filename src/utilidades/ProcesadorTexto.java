package utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProcesadorTexto {

    public static int contarPalabras(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }

    public static boolean contienePalabra(String texto, String palabra) {
        int index = texto.toLowerCase().indexOf(palabra.toLowerCase());
        return index > 0;
    }

    public static String repetirTexto(String texto, int veces) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            sb.append(texto);
            if (i < veces - 1)
                sb.append(" | "); // separador
        }
        return sb.toString();
    }

    public static boolean esEmailValido(String email) {
        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}

