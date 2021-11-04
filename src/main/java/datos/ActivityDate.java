/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Almacena una actividad con su tipo y la fecha en que se ha realizado
 * @author Administrador
 */
public class ActivityDate {
    //Actividad
    private String activity;
    //Tipo de actividad
    private String type;
    //Fecha
    private LocalTime date;
    
    /**
     * Constructor
     * @param activity
     * @param type
     * @param date 
     */
    public ActivityDate(String activity, String type, LocalTime date)
    {
        this.activity = activity;
        this.type = type;
        this.date = date;
    }
    
    /**
     * Devuelve la actividad
     * @return 
     */
    public String getActivity()
    {
        return activity;
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
     * Devuelve la fecha
     * @return 
     */
    public LocalTime getDate()
    {
        return date;
    }
    
    /**
     * Establece la actividad
     * @param activity 
     */
    public void setActivity(String activity)
    {
        this.activity = activity;
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
     * Establece la fecha
     * @param date 
     */
    public void setDate(LocalTime date)
    {
        this.date = date;
    }
}
