import java.util.Scanner;
import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsusario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      System.out.print("nombre:");
      String nombre = sc.nextLine();

      System.out.print("edad");
      int edad = sc.nextInt();
      sc.nextLine();

      System.out.print("correo:");
      String correo = sc.nextLine();

      boolean correoValido = ProcesadorTexto.esEmailValido(correo);

     if(correoValido){ Usuario usuario = new Usuario(nombre, edad, correo);
     } else {
        if(edad <= 0){ System.out.println("error");
          } else System.out.println("error"); 
    }
    }
     
}
