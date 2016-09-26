package proyectorefactoring;

import java.util.Date;

public class ProyectoRefactoring {

    public static void main(String[] args) {
        
        //Ejemplo Long parameter list
        
        String nombre = "Alejandro";
        String apellido = "Arevalo";
        String nombreUsuario = "Alemu";
        long dni = 70480255;
        Date fechaNac = new Date(1995, 8, 5);
        String universidad = "Universidad de Lima";
        String contraseña = "alemu$%&/()";
        long telefono = 999565242;
        String direccion = "Av. Javier Prado Oeste 105";
        String distrito = "San Miguel";
        
        Usuario usuario1 = new Usuario(nombre, apellido, nombreUsuario, dni, fechaNac, universidad, contraseña, telefono, direccion, distrito);
        
        GestorUsuario generarUsuario = new GestorUsuario();
        
        generarUsuario.registrarUsuario(usuario1);
        
        
        
        
        
        
      
    }
    
}
