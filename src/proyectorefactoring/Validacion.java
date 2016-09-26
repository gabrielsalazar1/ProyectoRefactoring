/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorefactoring;

/**
 *
 * @author Administrator
 */
public class Validacion {
    
    public static boolean validarNombre(String nombre){
        if(nombre == null){
            return false;
        }
        return true;
    }
}
