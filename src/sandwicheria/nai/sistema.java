/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwicheria.nai;

//import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alumno
 */
public class sistema extends javax.swing.JFrame {

    /**
     * Creates new form sistema
     */
    public sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.tabladecompras.setModel(modelo);
        this.modelo.addColumn("Número de pedido");
        this.modelo.addColumn("Nombre");
        this.modelo.addColumn("Dirección");
        this.modelo.addColumn("Teléfono");
        this.modelo.addColumn("Forma de pago");
        this.modelo.addColumn("Pedido");
        this.modelo.addColumn("Precio");
        this.modelo.addColumn("Cantidad");
        this.modelo.addColumn("Total a pagar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    DefaultTableModel modelo=new DefaultTableModel ();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        pedido = new javax.swing.JComboBox<>();
        cantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladecompras = new javax.swing.JTable();
        limpiar = new javax.swing.JButton();
        quitar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        tarjeta = new javax.swing.JRadioButton();
        efectivo = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        totalp = new javax.swing.JLabel();
        np = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA NAI");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Sandwicheria NAI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Direccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 74, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 132, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Pedido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 132, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Cantidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 132, -1, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 71, 57, -1));
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 71, 170, -1));

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 129, 57, -1));

        pedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Lomito", "Lomito c/papas", "Mila", "Mila c/papas", "Hamburguesa", "Hamburguesa c/papas", "Napolitana", "Napolitana 2 pers.", "Napolitana 3 pers." }));
        pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoActionPerformed(evt);
            }
        });
        getContentPane().add(pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 129, -1, -1));

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 129, 56, 29));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("N° de pedido:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 14, -1, -1));

        tabladecompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabladecompras.setToolTipText("");
        jScrollPane1.setViewportView(tabladecompras);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 209, 749, 230));

        limpiar.setText("Limpiar tabla");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 359, 110, -1));

        quitar.setText("Quitar compra");
        quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarActionPerformed(evt);
            }
        });
        getContentPane().add(quitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 325, 107, -1));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 393, 110, -1));

        guardar.setText("Guardar pedido");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 291, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Precio");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 74, -1, -1));
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 71, 59, -1));

        buttonGroup1.add(tarjeta);
        tarjeta.setText("Tarjeta nai");
        getContentPane().add(tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 70, -1, -1));

        buttonGroup1.add(efectivo);
        efectivo.setText("Efectivo");
        getContentPane().add(efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 135, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Forma de pago");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, -1));
        getContentPane().add(totalp, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 209, 107, 32));
        getContentPane().add(np, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 11, 20, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("D:\\Mis Cosas\\Mis imágenes\\67683598-fondo-de-la-comida-rápida-modelo-inconsútil-con-los-iconos-planos-de-vectores-de-la-hamburguesa-pizza-burr.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed
public void descuento_tarjetanai(){
    double precio1,cantidad1,totaal,desc=15;
    if (this.tarjeta.isSelected ()) {
         precio1 = Double.parseDouble(this.precio.getText());
         cantidad1 = Double.parseDouble(this.cantidad.getText());
         totaal = ((precio1*cantidad1) - (precio1 * desc / 100));
         this.totalp.setText(String.valueOf("Total: $" + totaal));
    }
}
public void descuento_efectivo(){
    double precio2,cantidad2,totaaal,desc2=10;
    if (this.efectivo.isSelected ()) {
         precio2 = Double.parseDouble(this.precio.getText());
         cantidad2 = Double.parseDouble(this.cantidad.getText());
         totaaal = ((precio2*cantidad2) - (precio2 * desc2 / 100));
         this.totalp.setText(String.valueOf("Total: $" + totaaal));
    }
}
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pedidoActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
        /*String res,p;
        res="s";
        while(equals(this.cantidad.getText())) {
            p=JOptionPane.showInputDialog("Desea ingresar otro pedido(S/N)");
            res="s";
            this.pedido.setSelectedIndex(0);
            this.precio.setText("");
            this.cantidad.setText("");            
            
        }*/
    }//GEN-LAST:event_cantidadActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        descuento_tarjetanai();
        descuento_efectivo();
        //TARJETA
        if (tarjeta.isSelected()) {
            if (pedido.getSelectedIndex() == 1) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"lomito",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    }//GEN-LAST:event_guardarActionPerformed
 if (tarjeta.isSelected()) {
            if (pedido.getSelectedIndex() == 2) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"lomito c/papas",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    } 
         if (tarjeta.isSelected()) {
            if (pedido.getSelectedIndex() == 3) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"mila",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    } 
         if (tarjeta.isSelected()) {
            if (pedido.getSelectedIndex() == 4) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"mila c/papas",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    } 
                 if (tarjeta.isSelected()) {
            if (pedido.getSelectedIndex() == 5) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"hambuerguesa",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    } 
                         if (tarjeta.isSelected()) {
            if (pedido.getSelectedIndex() == 6) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"hamburguesa c/papas",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    } 
            if (tarjeta.isSelected()) {
            if (pedido.getSelectedIndex() == 7) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"napo",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    } 
           if (tarjeta.isSelected()) {
            if (pedido.getSelectedIndex() == 8) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"napo 2pers.",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    } 
           if (tarjeta.isSelected()) {
            if (pedido.getSelectedIndex() == 9) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"napo 3pers.",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    } 
           
           //EFECTIVO
        if (efectivo.isSelected()) {
            if (pedido.getSelectedIndex() == 1) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"lomito",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }    
    }
         if (efectivo.isSelected()) {
            if (pedido.getSelectedIndex() == 2) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"lomito c/papas",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    }
     if (efectivo.isSelected()) {
            if (pedido.getSelectedIndex() == 3) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"mila",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    }
             if (efectivo.isSelected()) {
            if (pedido.getSelectedIndex() == 4) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"mila c/papas",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    }
      if (efectivo.isSelected()) {
            if (pedido.getSelectedIndex() == 5) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"hambuerguesa",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    }
      if (efectivo.isSelected()) {
            if (pedido.getSelectedIndex() == 6) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"hamburguesa c/papas",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    } 
            if (efectivo.isSelected()) {
            if (pedido.getSelectedIndex() == 7) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"napo",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    } 
           if (efectivo.isSelected()) {
            if (pedido.getSelectedIndex() == 8) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"napo 2pers.",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }
    } 
           if (efectivo.isSelected()) {
            if (pedido.getSelectedIndex() == 9) {
                this.modelo.addRow(new Object[]{this.np.getText(),this.nombre.getText(),this.direccion.getText(),this.telefono.getText(),"napo 3pers.",this.precio.getText(),this.cantidad.getText(),"tarjeta nai", this.totalp.getText()
                });
            }  
    }
        this.pedido.setSelectedIndex(0);
        if (tarjeta.isSelected()) {

        }
        if (efectivo.isSelected()) {

        }
        this.np.setText("");
        this.nombre.setText("");
        this.direccion.setText("");
        this.telefono.setText("");
        this.precio.setText("");
        this.cantidad.setText("");
    }
    private void quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarActionPerformed
        // TODO add your handling code here:
         modelo.removeRow(this.tabladecompras.getSelectedRow());
    }//GEN-LAST:event_quitarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        int a = this.modelo.getColumnCount();
        for (int i = 0; i <= a; i++) {
            this.modelo.removeRow(0);
        }
    }//GEN-LAST:event_limpiarActionPerformed
           
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField direccion;
    private javax.swing.JRadioButton efectivo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField np;
    private javax.swing.JComboBox<String> pedido;
    private javax.swing.JTextField precio;
    private javax.swing.JButton quitar;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabladecompras;
    private javax.swing.JRadioButton tarjeta;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel totalp;
    // End of variables declaration//GEN-END:variables
}
