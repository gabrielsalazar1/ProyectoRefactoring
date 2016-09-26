package proyectorefactoring;

import java.util.Date;

public class GestorUsuario {
    
    
    //Ejemplo Long parameter list 
    public void registrarUsuario(Usuario usuario){
        //Ejemplo Divergent Change       
        if (Validacion.validarUsuario(usuario)){
            System.out.println("Se guardó el usuario");                    
        }      
        else{
            System.out.println("error de validacion");
        }
        
    }
    
    

    
    
    
    
    
    
    
}
