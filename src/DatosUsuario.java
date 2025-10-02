import java.util.Scanner;
import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuario {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("nombre:");
    String nombre = sc.nextLine();

    System.out.print("edad:");
    int edad = sc.nextInt();
    sc.nextLine();

    System.out.print("correo:");
    String correo = sc.nextLine();

    boolean correoValido = ProcesadorTexto.esEmailValido(correo);
    boolean edadValida = edad < 0 || edad > 120;

    if (correoValido && edadValida) {
      Usuario usuario = new Usuario(nombre, edad, correo);

    } else {
      System.out.println("El usuario no puede ser creado porque el email introducido no es válido");
      // No se si esto era lo que pedia con la edad

      String name = "samuel";
      System.out.println("El nombre es: " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());

    }
    sc.close();
  }
}
