/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 * Guarda una actividad con la cantidad de veces que se ha realizado
 * @author Administrador
 */
public class OrderActivity {
    //Actividad
    private Activity activity;
    //Veces que se ha realizado
    private int cantidad;
    
    /**
     * Constructor
     * @param activity
     * @param cantidad 
     */
    public OrderActivity(Activity activity, int cantidad)
    {
        this.activity = activity;
        this.cantidad = cantidad;  
    }
    
    /**
     * Establece la actividad
     * @param activity 
     */
    public void setActivity(Activity activity)
    {
        this.activity = activity;
    }
    
    /**
     * Establece la cantidad
     * @param cantidad 
     */
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }
    
    /**
     * Devuelve la actividad
     * @return 
     */
    public Activity getActivity()
    {
        return activity;
    }
    
    /**
     * Devuelve la cantidad
     * @return 
     */
    public int getCantidad()
    {
        return cantidad;
    }
}
