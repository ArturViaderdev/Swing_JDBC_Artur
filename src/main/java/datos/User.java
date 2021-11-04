/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 * Guarda un usuario
 * @author Artur Viader
 */
public class User {
    //Nombre de usuario
    private String username;
    //Password
    private String password;
    
    /**Constructor con los dos datos
     * 
     * @param username
     * @param password 
     */
    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
    
    /**
     * Establece el nombre de usuario
     * @param username 
     */
    public void setUsername(String username)
    {
        this.username = username;
    }
    
    /**
     * Establece el password
     * @param password 
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    /**
     * Obtiene el nombre de usuario
     * @return 
     */
    public String getUsername()
    {
        return username;
    }
    
    /**
     * Obtiene el password
     * @return 
     */
    public String getPassword()
    {
        return password;
    }
}
