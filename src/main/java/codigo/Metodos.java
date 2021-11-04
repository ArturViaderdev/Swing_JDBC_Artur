/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import datos.Activity;
import datos.OrderActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase que almacena métodos
 * @author Artur Viader
 */
public class Metodos {
    /**
     * Devuelve la posición de una actividad en una lista de actividades
     * @param actividad
     * @param actividades
     * @return Posición
     */
    public static int dimePosicionActividad(String actividad, ArrayList<Activity> actividades)
    {
        boolean sal = false;
        boolean encontrado = false;
        int cont = 0;
        //Se busca la actividad
        while(!sal)
        {
            if(cont<actividades.size())
            {
                if(actividades.get(cont).getName().equals(actividad))
                {
                    encontrado = true;
                    sal = true;
                }
                else
                {
                    cont++;
                }  
            }
            else
            {
                sal = true;
            }
        }
        if(encontrado)
        {
            //Si se ha encontrado se devuelve la posición en la lista
            return cont;
        }
        else
        {
            //Si no se ha encontrado se devuelve -1
            return -1;
        }
    }
    
    /**
     * Se ordena una lista de actividades con su cantidad de realizadas por el número de realizadas mediante el algoritmo de ordenación de la burbuja
     * @param entrada Lista de actividades con su cantidad de realizadas
     * @return Se devuelve la lista ordenada
     */
    public static ArrayList<OrderActivity> orderActivity(ArrayList<OrderActivity> entrada)
    {
        for (int i = 0; i < entrada.size() - 1; i++) {
            for (int j = 0; j < entrada.size() - 1; j++) {
                if (entrada.get(j).getCantidad()<entrada.get(j + 1).getCantidad()) {
                    Collections.swap(entrada, j + 1, j);
                }
            }
        }
        return entrada;
    }
}
