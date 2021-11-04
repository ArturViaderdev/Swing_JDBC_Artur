/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Guarda un registro de realización de una actividad para un usuario en una fecha
 * @author Administrador
 */
public class Record {
    private int idrecord;
    private String user;
    private String activity;
    private LocalDateTime date;
    private String comment;
    
    /**
     * Constructor con todos los datos
     * @param idrecord
     * @param user
     * @param activity
     * @param date
     * @param comment 
     */
    public Record(int idrecord, String user, String activity, LocalDateTime date, String comment)
    {
        this.idrecord = idrecord;
        this.user = user;
        this.activity = activity;
        this.date = date;
        this.comment = comment;
    }
    
    /**
     * Constructor sin el id
     * @param user
     * @param activity
     * @param date
     * @param comment 
     */
    public Record(String user, String activity, LocalDateTime date, String comment)
    {
        this.idrecord = 0;
        this.user = user;
        this.activity = activity;
        this.date = date;
        this.comment = comment;
    }
    
    /**
     * Devuelve el id
     * @return 
     */
    public int getIdrecord()
    {
        return idrecord;
    }
    
    /**
     * Devuelve el usuario
     * @return 
     */
    public String getUser()
    {
        return user;
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
     * Devuelve la fecha
     * @return 
     */
    public LocalDateTime getDate()
    {
        return date;
    }
    
    /**
     * Devuelve la fecha como string
     * @return 
     */
    public String getStringDate()
    {
        return date.toLocalDate().toString();
    }
    
    /**
     * Devuelve la hora como string
     * @return 
     */
    public String getStringTime()
    {
        return date.toLocalTime().toString();
    }
    
    /**
     * Devuelve el commentario
     * @return 
     */
    public String getComment()
    {
        return comment;
    }
        
    /**
     * Establece el id
     * @param idrecord 
     */
    public void setIdrecord(int idrecord)
    {
        this.idrecord = idrecord;
    }
    
    /**
     * Establece el usuario
     * @param user 
     */
    public void setUser(String user)
    {
        this.user = user;
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
     * Establece la fecha
     * @param date 
     */
    public void setDate(LocalDateTime date)
    {
        this.date = date;
    }
    
    /**
     * Establece el comentario
     * @param comment 
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }
}
