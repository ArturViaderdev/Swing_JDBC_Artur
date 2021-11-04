/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 * Clase singleton que almacena el usuario que ha iniciado sesión
 * @author Artur Viader
 */
public class Memoria {
    private static Memoria instancia = new Memoria();
    //Usuario que ha iniciado sesión
    private String usuario;
    /**
     * Constructor singleton
     */
    private Memoria()
    {
        
    }
    
    /**
     * Establece el usuario
     * @param usuario 
     */
    public void setUsuario(String usuario)
    {
        this.usuario = usuario;
    }
    
    /**
     * Devuelve el usuario
     * @return 
     */
    public String getUsuario()
    {
        return usuario;
    }
    
    /**
     * Devuelve la instancia del singleton
     * @return 
     */
    public static Memoria getInstancia()
    {
        return instancia;
    }
}
