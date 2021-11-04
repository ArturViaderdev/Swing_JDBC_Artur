/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swingjdbcartur;

import codigo.DAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase principal en la que el programa se inicia
 * @author Administrador
 */
public class Principal {
    /**
     * Método main principal
     * @param args 
     */
    public static void main(String[] args) {
        if (DAO.getInstancia()!=null)
        {
             //Se abre la pantalla de iniciar sesión
            FrmIniciaSesion frmlogin;
            frmlogin = new FrmIniciaSesion(null,true);
            frmlogin.setLocationRelativeTo(null);
            frmlogin.setVisible(true);
        }  
    }
}
