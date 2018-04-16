/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.protectora.gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.protectora.model.*;

/**
 *
 * @author Jorge Anjel/ Sergio Herrera/ Javier Vergara
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public Conexion con;

    public App() {
        initComponents();
        setTitle("VeteriSoft v0.1.1");
        setLocationRelativeTo(null);
        pnlNumero.setVisible(false);

        cboSexo.removeAllItems();
        cboSexo.addItem("Macho");
        cboSexo.addItem("Hembra");

        try {
            con = new Conexion("localhost", "bd_veterinaria", "root", "");
            System.out.println("Todo OK");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpCastrado = new javax.swing.ButtonGroup();
        grpAdoptado = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblMicrochip = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        sprSeparador = new javax.swing.JSeparator();
        lblRaza = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblNacimiento = new javax.swing.JLabel();
        lblCastrado = new javax.swing.JLabel();
        lblAdoptado = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        opEsterilizado = new javax.swing.JRadioButton();
        opNoEsterilizado = new javax.swing.JRadioButton();
        cboSexo = new javax.swing.JComboBox<>();
        chkAdoptado = new javax.swing.JCheckBox();
        txtMeses = new javax.swing.JTextField();
        pnlNumero = new javax.swing.JPanel();
        txtMicrochip = new javax.swing.JTextField();
        chkMicrochip = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        miRegistro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblTitulo.setText("Registro de Animales");

        lblNombre.setText("Nombre:");

        lblMicrochip.setText("Microchip:");

        lblEspecie.setText("Especie:");

        lblSexo.setText("Sexo:");

        lblRaza.setText("Raza:");

        lblColor.setText("Color:");

        lblNacimiento.setText("Meses:");

        lblCastrado.setText("Estado reproductivo:");

        lblAdoptado.setText("Adoptado:");

        btnRegistro.setText("Registrar");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        grpCastrado.add(opEsterilizado);
        opEsterilizado.setSelected(true);
        opEsterilizado.setText("Esterilizado");

        grpCastrado.add(opNoEsterilizado);
        opNoEsterilizado.setText("No Esterilizado");

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        chkAdoptado.setText("Sí");

        pnlNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("numero"));

        javax.swing.GroupLayout pnlNumeroLayout = new javax.swing.GroupLayout(pnlNumero);
        pnlNumero.setLayout(pnlNumeroLayout);
        pnlNumeroLayout.setHorizontalGroup(
            pnlNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMicrochip, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlNumeroLayout.setVerticalGroup(
            pnlNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNumeroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMicrochip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        chkMicrochip.setText("Si");
        chkMicrochip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMicrochipActionPerformed(evt);
            }
        });

        menu.setText("Archivo");

        miRegistro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        miRegistro.setText("Ver animales registrados");
        miRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistroActionPerformed(evt);
            }
        });
        menu.add(miRegistro);
        menu.add(jSeparator1);

        miAcercaDe.setText("Acerca de...");
        miAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAcercaDeActionPerformed(evt);
            }
        });
        menu.add(miAcercaDe);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLimpiar)
                                .addGap(123, 123, 123)
                                .addComponent(btnRegistro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAdoptado)
                                .addGap(39, 39, 39)
                                .addComponent(chkAdoptado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMicrochip)
                                            .addComponent(lblNombre)
                                            .addComponent(lblEspecie)
                                            .addComponent(lblSexo)
                                            .addComponent(lblRaza)
                                            .addComponent(lblColor)
                                            .addComponent(lblNacimiento))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMeses)
                                            .addComponent(txtColor)
                                            .addComponent(txtRaza)
                                            .addComponent(cboSexo, 0, 162, Short.MAX_VALUE)
                                            .addComponent(txtEspecie)
                                            .addComponent(txtNombre)
                                            .addComponent(pnlNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(chkMicrochip)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCastrado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(opEsterilizado)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opNoEsterilizado)))))
                .addContainerGap())
            .addComponent(sprSeparador)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sprSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMicrochip)
                    .addComponent(chkMicrochip))
                .addGap(17, 17, 17)
                .addComponent(pnlNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEspecie)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRaza)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColor)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNacimiento)
                            .addComponent(txtMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCastrado)
                            .addComponent(opEsterilizado)
                            .addComponent(opNoEsterilizado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdoptado)
                            .addComponent(chkAdoptado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnRegistro))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSexo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        String nombre,
                especie,
                sexo,
                raza,
                color;
        long microchip = 0;
        int meses = 0;
        boolean esterilizado = false;
        boolean adoptado = false;

        nombre = txtNombre.getText();

        try {
            if (chkMicrochip.isSelected()) {
                microchip = Long.parseLong(txtMicrochip.getText());
            } else {
                microchip = 0;
            }
        } catch (Exception ex) {
            int tipo = JOptionPane.ERROR_MESSAGE;
            String titulo = "Ingreso inválido";
            String mensaje = "El microchip debe contener sólo números.";

            JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);

            txtMicrochip.setText(null);
            txtMicrochip.requestFocus();

            return;
        }

        especie = txtEspecie.getText();
        sexo = cboSexo.getSelectedItem().toString();
        raza = txtRaza.getText();
        color = txtColor.getText();

        try {
            meses = Integer.parseInt(txtMeses.getText());
        } catch (Exception ex) {
            int tipo = JOptionPane.ERROR_MESSAGE;
            String mensaje = "El número de meses debe contener sólo números.";
            String titulo = "Ingreso inválido";

            JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);

            txtMeses.setText(null);
            txtMeses.requestFocus();

            return;
        }

        if (opEsterilizado.isSelected()) {
            esterilizado = true;
        }

        if (chkAdoptado.isSelected()) {
            adoptado = true;
        }

        String consulta = "INSERT INTO animal VALUES(NULL,'"
                + nombre + "',"
                + microchip + ",'"
                + especie + "','"
                + sexo + "','"
                + raza + "','"
                + color + "',"
                + meses + ","
                + esterilizado + ","
                + adoptado + ");";

        try {
            con.ejecutar(consulta);

            txtNombre.setText(null);
            txtMicrochip.setText(null);
            txtEspecie.setText(null);
            cboSexo.setSelectedIndex(0);
            txtRaza.setText(null);
            txtColor.setText(null);
            txtMeses.setText(null);
            opEsterilizado.setSelected(true);
            chkAdoptado.setSelected(false);

            txtNombre.requestFocus();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText(null);
        txtMicrochip.setText(null);
        txtEspecie.setText(null);
        cboSexo.setSelectedIndex(0);
        txtRaza.setText(null);
        txtColor.setText(null);
        txtMeses.setText(null);
        opEsterilizado.setSelected(true);
        chkAdoptado.setSelected(false);

        txtNombre.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void chkMicrochipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMicrochipActionPerformed
        if (chkMicrochip.isSelected()) {
            pnlNumero.setVisible(true);
        } else {
            pnlNumero.setVisible(false);
        }
    }//GEN-LAST:event_chkMicrochipActionPerformed

    private void miRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistroActionPerformed
        Tabla t = null;
        try {
            t = new Tabla();

            t.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.setVisible(true);

        App a = new App();

        a.setVisible(false);
    }//GEN-LAST:event_miRegistroActionPerformed

    private void miAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAcercaDeActionPerformed
        int tipo = JOptionPane.INFORMATION_MESSAGE;
        String mensaje = "Creado por Jorge Anjel, Sergio Herrera y Javier Vergara.\n\n"
                + "2018";
        String titulo = "Acerca de...";

        JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);
    }//GEN-LAST:event_miAcercaDeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        App ap = new App();
        ap.setVisible(true);
        ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //</editor-fold>

    /* Create and display the form */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cboSexo;
    private javax.swing.JCheckBox chkAdoptado;
    private javax.swing.JCheckBox chkMicrochip;
    private javax.swing.ButtonGroup grpAdoptado;
    private javax.swing.ButtonGroup grpCastrado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblAdoptado;
    private javax.swing.JLabel lblCastrado;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblMicrochip;
    private javax.swing.JLabel lblNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem miAcercaDe;
    private javax.swing.JMenuItem miRegistro;
    private javax.swing.JRadioButton opEsterilizado;
    private javax.swing.JRadioButton opNoEsterilizado;
    private javax.swing.JPanel pnlNumero;
    private javax.swing.JSeparator sprSeparador;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtMeses;
    private javax.swing.JTextField txtMicrochip;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
