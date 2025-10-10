import java.util.Scanner;
import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("nombre: ");
        String nombre = sc.nextLine();

<<<<<<< Updated upstream:src/DatosUsuario.java
        System.out.print("edad: ");
=======
        System.out.print("edad:");
>>>>>>> Stashed changes:src/DatosUsusario.java
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("correo: ");
        String correo = sc.nextLine();

        boolean correoValido = ProcesadorTexto.esEmailValido(correo);
<<<<<<< Updated upstream:src/DatosUsuario.java
        boolean edadValida = edad < 0 || edad > 120;
        boolean nombreValido = nombre.length() < 2 && nombre.length() > 20;

        if (correoValido && edadValida && nombreValido) {
=======
        boolean edadValida = edad > 0 || edad < 120;
        boolean nombreValido = nombre.length() < 2 && nombre.length() >20;

        if (correoValido && edadValida && correoValido) {
>>>>>>> Stashed changes:src/DatosUsusario.java
            Usuario usuario = new Usuario(nombre, edad, correo);
        } else {
            System.out.println("error, esuario no es valido");

        }
        sc.close();
    }

}
