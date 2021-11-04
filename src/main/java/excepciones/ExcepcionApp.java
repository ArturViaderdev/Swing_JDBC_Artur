/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Arrays;
import java.util.List;

/**
 * Clase que controla las excepciones.
 * @author alu2017363
 */
public class ExcepcionApp extends Exception{
    //Lista de excepciones y sus mensajes

    public static final int LOGININCORRECTO =0;
    public static final int RELLENARCAMPOS = 1;
    public static final int CONFIRMAPASSWORD = 2;
    public static final int USUARIOEXISTE = 3;
    public static final int ACTIVIDADEXISTE = 4;
    
    private int code;
    
     private final List<String> messages = Arrays.asList(
       "Username or password is incorrect",
       "Debes rellenar todos los campos",
       "Confirmación de password incorrecta",
       "El usuario ya existe en la base de datos",
       "La actividad ya existe"
     );

     /**
      * Constructor
      * @param code Código de excepción 
      */
    public ExcepcionApp(int code) {
        this.code = code;
    }

    /**
     * Devuelve el mensaje de la excepción correspondiente al código
     * @return Mensaje
     */
    @Override
    public String getMessage() {
        return messages.get(code);
    }
}
