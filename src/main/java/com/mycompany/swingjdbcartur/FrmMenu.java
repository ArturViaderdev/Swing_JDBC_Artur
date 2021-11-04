/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.swingjdbcartur;

import javax.swing.JFrame;

/**
 * Pantalla del menú
 * @author Artur Viader
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Constructor
     */
    public FrmMenu() {
        super("Menú");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
        setSize(332,289);
                
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bRegistrarActividad = new javax.swing.JButton();
        bRealizarRegistro = new javax.swing.JButton();
        bModificaBorraRegistro = new javax.swing.JButton();
        bConsultaActividades = new javax.swing.JButton();
        bConsultarFecha = new javax.swing.JButton();
        bConsultarTiposActividad = new javax.swing.JButton();
        bCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bRegistrarActividad.setText("Registrar nueva actividad");
        bRegistrarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActividadActionPerformed(evt);
            }
        });

        bRealizarRegistro.setText("Realizar un registro");
        bRealizarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizarRegistroActionPerformed(evt);
            }
        });

        bModificaBorraRegistro.setText("Modificar / Borrar registros");
        bModificaBorraRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificaBorraRegistroActionPerformed(evt);
            }
        });

        bConsultaActividades.setText("Consultar tus actividades");
        bConsultaActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultaActividadesActionPerformed(evt);
            }
        });

        bConsultarFecha.setText("Consultar actividades por fecha");
        bConsultarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarFechaActionPerformed(evt);
            }
        });

        bConsultarTiposActividad.setText("Consultar tipos de actividad");
        bConsultarTiposActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarTiposActividadActionPerformed(evt);
            }
        });

        bCerrar.setText("Cerrar");
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bRegistrarActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bRealizarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bModificaBorraRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bConsultaActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bConsultarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bConsultarTiposActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCerrar)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bRegistrarActividad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRealizarRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bModificaBorraRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bConsultaActividades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bConsultarFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bConsultarTiposActividad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botón de cerrar
     * @param evt 
     */
    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCerrarActionPerformed

    /**
     * Botón que redirige a la pantalla de registrar actividad
     * @param evt 
     */
    private void bRegistrarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActividadActionPerformed
        FrmNuevaActividad frmnuevaactividad;
        frmnuevaactividad = new FrmNuevaActividad(null,true);
        frmnuevaactividad.setLocationRelativeTo(null);
        frmnuevaactividad.setVisible(true);
    }//GEN-LAST:event_bRegistrarActividadActionPerformed

    /**
     * Realizar registro
     * @param evt 
     */
    private void bRealizarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizarRegistroActionPerformed
        FrmRealizarRegistro frmrealizaregistro;
        frmrealizaregistro = new FrmRealizarRegistro(null,true,false,null);
        frmrealizaregistro.setLocationRelativeTo(null);
        frmrealizaregistro.setVisible(true);                                     
    }//GEN-LAST:event_bRealizarRegistroActionPerformed

    /**
     * Modificar registro
     * @param evt 
     */
    private void bModificaBorraRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificaBorraRegistroActionPerformed
        FrmModificaBorraRegistro frmmodiborrareg;
        frmmodiborrareg = new FrmModificaBorraRegistro(null,true);
        frmmodiborrareg.setLocationRelativeTo(null);
        frmmodiborrareg.setVisible(true);        
    }//GEN-LAST:event_bModificaBorraRegistroActionPerformed

    /**
     * Consultar actividades
     * @param evt 
     */
    private void bConsultaActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultaActividadesActionPerformed
        FrmConsultarActividades frmconsultaractividades;
        frmconsultaractividades = new FrmConsultarActividades(null,true);
        frmconsultaractividades.setLocationRelativeTo(null);
        frmconsultaractividades.setVisible(true);  
    }//GEN-LAST:event_bConsultaActividadesActionPerformed

    /**
     * Consultar tipos de actividad
     * @param evt 
     */
    private void bConsultarTiposActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarTiposActividadActionPerformed
        FrmConsultarTiposActividad frmconsultartiposactividad;
        frmconsultartiposactividad = new FrmConsultarTiposActividad(null,true);
        frmconsultartiposactividad.setLocationRelativeTo(null);
        frmconsultartiposactividad.setVisible(true); 
    }//GEN-LAST:event_bConsultarTiposActividadActionPerformed

    /**
     * Consultar actividades por fecha
     * @param evt 
     */
    private void bConsultarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarFechaActionPerformed
        FrmConsultarActividadesFecha frmconsultaractividadesfecha;
        frmconsultaractividadesfecha = new FrmConsultarActividadesFecha(null,true);
        frmconsultaractividadesfecha.setLocationRelativeTo(null);
        frmconsultaractividadesfecha.setVisible(true); 
    }//GEN-LAST:event_bConsultarFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bConsultaActividades;
    private javax.swing.JButton bConsultarFecha;
    private javax.swing.JButton bConsultarTiposActividad;
    private javax.swing.JButton bModificaBorraRegistro;
    private javax.swing.JButton bRealizarRegistro;
    private javax.swing.JButton bRegistrarActividad;
    // End of variables declaration//GEN-END:variables
}
