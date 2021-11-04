/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 * Almacena una actividad
 * @author Artur Viader
 */
public class Activity {
    //Nombre de actividad
    private String name;
    //Tipo de actividad
    private String type;
    //Usuario creador de actividad
    private String founder;
    
    /**
     * Constructor
     * @param name
     * @param type
     * @param founder 
     */
    public Activity(String name, String type, String founder)
    {
        this.name = name;
        this.type = type;
        this.founder = founder;
    }
    
    /**
     * Devuelve el nombre
     * @return 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Devuelve el tipo
     * @return 
     */
    public String getType()
    {
        return type;
    }
    
    /**
     * Devuelve el usuario
     * @return 
     */
    public String getFounder()
    {
        return founder;
    }
    
    /**
     * Establece el nombre
     * @param name 
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Establece el tipo
     * @param type 
     */
    public void setType(String type)
    {
        this.type = type;
    }
    
    /**
     * Establece el usuario fundador
     * @param founder 
     */
    public void setFounder(String founder)
    {
        this.founder = founder;
    }
}
