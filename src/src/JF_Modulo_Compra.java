/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ANDY ESCOBAR
 */
public class JF_Modulo_Compra extends javax.swing.JFrame {

    /**
     * Creates new form JF_Modulo_Compra
     */
    public JF_Modulo_Compra() {
        initComponents();
        mostrarProveedores();
        selectBotonColor(ltbProveedor);
        this.setLocationRelativeTo(null);
        
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
        jPanel3 = new javax.swing.JPanel();
        ltbProducto = new javax.swing.JLabel();
        ltbProveedor = new javax.swing.JLabel();
        ltbOC = new javax.swing.JLabel();
        ltbDoc = new javax.swing.JLabel();
        ltbRC = new javax.swing.JLabel();
        ltbCC = new javax.swing.JLabel();
        ltbAu = new javax.swing.JLabel();
        panel_ManagerModuloCompra = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        ltbProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ltbProducto.setForeground(new java.awt.Color(255, 255, 255));
        ltbProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ltbProducto.setText("PRODUCTOS");
        ltbProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltbProductoMouseClicked(evt);
            }
        });

        ltbProveedor.setBackground(new java.awt.Color(102, 102, 102));
        ltbProveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ltbProveedor.setForeground(new java.awt.Color(255, 255, 255));
        ltbProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ltbProveedor.setText("PROVEEDORES");
        ltbProveedor.setOpaque(true);
        ltbProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltbProveedorMouseClicked(evt);
            }
        });

        ltbOC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ltbOC.setForeground(new java.awt.Color(255, 255, 255));
        ltbOC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ltbOC.setText("ORDEN COMPRA");
        ltbOC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltbOCMouseClicked(evt);
            }
        });

        ltbDoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ltbDoc.setForeground(new java.awt.Color(255, 255, 255));
        ltbDoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ltbDoc.setText("DOCUMENTOS");
        ltbDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltbDocMouseClicked(evt);
            }
        });

        ltbRC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ltbRC.setForeground(new java.awt.Color(255, 255, 255));
        ltbRC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ltbRC.setText("REGISTRO DE COMPRA");
        ltbRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltbRCMouseClicked(evt);
            }
        });

        ltbCC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ltbCC.setForeground(new java.awt.Color(255, 255, 255));
        ltbCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ltbCC.setText("CUENTA CORRIENTE");
        ltbCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltbCCMouseClicked(evt);
            }
        });

        ltbAu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ltbAu.setForeground(new java.awt.Color(255, 255, 255));
        ltbAu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ltbAu.setText("AUTORIAS");
        ltbAu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltbAuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ltbRC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addComponent(ltbCC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ltbProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ltbProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ltbOC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addComponent(ltbAu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ltbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ltbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ltbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ltbOC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ltbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ltbRC, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ltbCC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ltbAu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 190, 440));

        panel_ManagerModuloCompra.setBackground(new java.awt.Color(255, 255, 255));
        panel_ManagerModuloCompra.setPreferredSize(new java.awt.Dimension(610, 430));

        javax.swing.GroupLayout panel_ManagerModuloCompraLayout = new javax.swing.GroupLayout(panel_ManagerModuloCompra);
        panel_ManagerModuloCompra.setLayout(panel_ManagerModuloCompraLayout);
        panel_ManagerModuloCompraLayout.setHorizontalGroup(
            panel_ManagerModuloCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        panel_ManagerModuloCompraLayout.setVerticalGroup(
            panel_ManagerModuloCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jPanel1.add(panel_ManagerModuloCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 610, 430));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/square_back_icon.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODULO DE COMPRA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        JF_Menu_Administrador menuAdmin=new JF_Menu_Administrador();
        menuAdmin.setVisible(true);
        this.dispose();;
    }//GEN-LAST:event_btnBackMouseClicked

    private void ltbProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltbProveedorMouseClicked
        selectBotonColor(ltbProveedor);
        mostrarProveedores();
    }//GEN-LAST:event_ltbProveedorMouseClicked

    private void ltbProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltbProductoMouseClicked
        selectBotonColor(ltbProducto);
        mostrarProductos();
    }//GEN-LAST:event_ltbProductoMouseClicked

    private void ltbAuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltbAuMouseClicked
        selectBotonColor(ltbAu);
        mostrarAuditorias();
    }//GEN-LAST:event_ltbAuMouseClicked

    private void ltbOCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltbOCMouseClicked
        selectBotonColor(ltbOC);
        mostrarOC();
    }//GEN-LAST:event_ltbOCMouseClicked

    private void ltbDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltbDocMouseClicked
        selectBotonColor(ltbDoc);
        JF_Documento documento=new JF_Documento();
        documento.setVisible(true);
        
        
                
                
    }//GEN-LAST:event_ltbDocMouseClicked

    private void ltbRCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltbRCMouseClicked
        selectBotonColor(ltbRC);
    }//GEN-LAST:event_ltbRCMouseClicked

    private void ltbCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltbCCMouseClicked
        selectBotonColor(ltbCC);
    }//GEN-LAST:event_ltbCCMouseClicked

    
    private void resetColorLateralButtons(){
        Color color=new Color(51,51,51);
        ltbProveedor.setBackground(color);
        ltbProducto.setBackground(color);
        ltbOC.setBackground(color);
        ltbDoc.setBackground(color);
        ltbCC.setBackground(color);
        ltbRC.setBackground(color);
        ltbAu.setBackground(color);
        
    }
    private void selectBotonColor(JLabel lbl){
        lbl.setOpaque(true);
        resetColorLateralButtons();
        lbl.setBackground(new Color(102,102,102));
    }
    
    private void mostrarProveedores(){
        JPanel p =panel_ManagerModuloCompra;
        panel.JP_ModuloCompra_Proveedores pnlProveedores=new panel.JP_ModuloCompra_Proveedores();
        pnlProveedores.setSize(p.getSize());
        pnlProveedores.setLocale(p.getLocale());
        
        panel_ManagerModuloCompra.removeAll();
        panel_ManagerModuloCompra.add(pnlProveedores,BorderLayout.CENTER);
        panel_ManagerModuloCompra.revalidate();
        panel_ManagerModuloCompra.repaint();
    }
    
    private void mostrarOC(){
        JPanel p =panel_ManagerModuloCompra;
        panel.JP_ModuloCompra_OrdenCompra pnlOC=new panel.JP_ModuloCompra_OrdenCompra();
        pnlOC.setSize(p.getSize());
        pnlOC.setLocale(p.getLocale());
        
        panel_ManagerModuloCompra.removeAll();
        panel_ManagerModuloCompra.add(pnlOC,BorderLayout.CENTER);
        panel_ManagerModuloCompra.revalidate();
        panel_ManagerModuloCompra.repaint();
    }
    
    private void mostrarAuditorias(){
        JPanel p= panel_ManagerModuloCompra;
        panel.JP_ModuloCompraAuditoria pnlAuditoria=new panel.JP_ModuloCompraAuditoria();
        pnlAuditoria.setSize(p.getSize());
        pnlAuditoria.setLocale(p.getLocale());
        
        panel_ManagerModuloCompra.removeAll();
        panel_ManagerModuloCompra.add(pnlAuditoria,BorderLayout.CENTER);
        panel_ManagerModuloCompra.revalidate();
        panel_ManagerModuloCompra.repaint();
        
        
        
    }
    private void mostrarProductos(){
        JPanel p= panel_ManagerModuloCompra;
        panel.JP_ModuloCompra_Productos pnlProductos=new panel.JP_ModuloCompra_Productos();
        pnlProductos.setSize(p.getSize());
        pnlProductos.setLocale(p.getLocale());
        
        panel_ManagerModuloCompra.removeAll();
        panel_ManagerModuloCompra.add(pnlProductos,BorderLayout.CENTER);
        panel_ManagerModuloCompra.revalidate();
        panel_ManagerModuloCompra.repaint();
    }
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
            java.util.logging.Logger.getLogger(JF_Modulo_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Modulo_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Modulo_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Modulo_Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Modulo_Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel ltbAu;
    private javax.swing.JLabel ltbCC;
    private javax.swing.JLabel ltbDoc;
    private javax.swing.JLabel ltbOC;
    private javax.swing.JLabel ltbProducto;
    private javax.swing.JLabel ltbProveedor;
    private javax.swing.JLabel ltbRC;
    public javax.swing.JPanel panel_ManagerModuloCompra;
    // End of variables declaration//GEN-END:variables
}
