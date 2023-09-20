/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio.pkg5;

/**
 *
 * @author Proyector
 */
public class FrameEstudiante extends javax.swing.JFrame {

    FrameEstudiantes padre;
    Estudiante estudianteSelec;
    
    
    /**
     * Creates new form FrameEstudiante
     */
    public FrameEstudiante() {
        initComponents();
    }
    
     public FrameEstudiante(FrameEstudiantes padre) {
        initComponents();
        this.padre = padre;
        
    }
     //sobrecargar el costructor
       public FrameEstudiante(FrameEstudiantes padre, Estudiante estudiante) {
        initComponents();
        this.padre = padre;
        this.estudianteSelec= estudiante;
        txtnombre.setText(this.estudianteSelec.getNombre());
        txtapellido.setText(this.estudianteSelec.getApellido());
        txtcodigo.setText(this.estudianteSelec.getCodigo());
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_cancelar = new javax.swing.JLabel();
        lbl_guardar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtapellido = new javax.swing.JTextField();
        imgapellido = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtnombre = new javax.swing.JTextField();
        imgnombre = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtcodigo = new javax.swing.JTextField();
        imgcodigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lbl_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Group 10.png"))); // NOI18N
        lbl_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_cancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_cancelarMouseExited(evt);
            }
        });

        lbl_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Group 9.png"))); // NOI18N
        lbl_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_guardarMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Nombre_.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Codigo_.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Apellido_.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtapellido.setBackground(new java.awt.Color(0, 0, 0));
        txtapellido.setForeground(new java.awt.Color(255, 255, 255));
        txtapellido.setBorder(null);
        txtapellido.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 20));

        imgapellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Rectangle 15.png"))); // NOI18N
        jPanel2.add(imgapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 60));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnombre.setBackground(new java.awt.Color(0, 0, 0));
        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.setBorder(null);
        txtnombre.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 30));

        imgnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Rectangle 15.png"))); // NOI18N
        jPanel3.add(imgnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 50));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcodigo.setBackground(new java.awt.Color(0, 0, 0));
        txtcodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtcodigo.setBorder(null);
        txtcodigo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        jPanel4.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 16, 170, 20));

        imgcodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Rectangle 15.png"))); // NOI18N
        jPanel4.add(imgcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Estudiante.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lbl_guardar)
                .addGap(18, 18, 18)
                .addComponent(lbl_cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(585, 585, 585))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_guardarMouseEntered
        // TODO add your handling code here:
       lbl_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Group 5.png"))); // NOI18N
    }//GEN-LAST:event_lbl_guardarMouseEntered

    private void lbl_guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_guardarMouseExited
        // TODO add your handling code here:
        lbl_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Group 9.png"))); // NOI18N
    }//GEN-LAST:event_lbl_guardarMouseExited

    private void lbl_cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cancelarMouseEntered
        // TODO add your handling code here:
         lbl_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Group 6.png"))); // NOI18N
    }//GEN-LAST:event_lbl_cancelarMouseEntered

    private void lbl_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cancelarMouseExited
        // TODO add your handling code here:
        lbl_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio/pkg5/Group 10.png"))); // NOI18N
    }//GEN-LAST:event_lbl_cancelarMouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseExited

    private void lbl_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cancelarMouseClicked
        // TODO add your handling code here:
     
        this.padre.setVisible(true);//muestra el padre y sea visible
        this.dispose();//y cierro este formulario
    }//GEN-LAST:event_lbl_cancelarMouseClicked

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed


    private void lbl_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_guardarMouseClicked
   
    if (estudianteSelec != null) {
        // Actualizar el estudiante existente
        estudianteSelec.setNombre(txtnombre.getText());
        estudianteSelec.setApellido(txtapellido.getText());
        estudianteSelec.setCodigo(txtcodigo.getText());
        
        // Llama a un método en FrameEstudiantes para actualizar el modelo del JList.
        this.padre.actualizarEstudiante(estudianteSelec);
    } else {
        // Crear un nuevo estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(txtnombre.getText());
        estudiante.setApellido(txtapellido.getText());
        estudiante.setCodigo(txtcodigo.getText());
        
        // Llama a un método en FrameEstudiantes para agregar el nuevo estudiante al modelo del JList.
        this.padre.agregarEstudiante(estudiante);
    }
    
    // Mostrar FrameEstudiantes nuevamente y cerrar FrameEstudiante
    this.padre.setVisible(true);
    this.dispose();    
        
    }//GEN-LAST:event_lbl_guardarMouseClicked

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
            java.util.logging.Logger.getLogger(FrameEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgapellido;
    private javax.swing.JLabel imgcodigo;
    private javax.swing.JLabel imgnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_cancelar;
    private javax.swing.JLabel lbl_guardar;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
