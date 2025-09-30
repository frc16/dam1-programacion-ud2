import java.util.Scanner;
import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        sc.nextLine();
        String correo = sc.nextLine();
        sc.nextLine();
        boolean emailValido = ProcesadorTexto.esEmailValido(correo);
        if (emailValido) {

            Usuario usuario = new Usuario(nombre, edad, correo);
            usuario.mostrarInformacion();

        } else {

            System.out.println("El usuario no puede ser creado porque el email introducido no es valido");

        }

        sc.close();
    }
}
