/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumera los tipos de actividad que existen
 * @author Artur Viader
 */
public enum TipoActividad {
    FISICO(1), ESTUDIO(2), JUEGO(3), CULTURA(4);

    private int value;

    private static Map map = new HashMap<>();

    private TipoActividad(int value) {
	this.value = value;
    }

    static {
	for (TipoActividad tipo : TipoActividad.values()) {
	    map.put(tipo.value, tipo);
	}
    }

    public static TipoActividad valueOf(int tipo) {
	return (TipoActividad) map.get(tipo);
    }

    /**Devuelve el valor
     * 
     * @return 
     */
    public int getValue() {
	return value;
    }

}
