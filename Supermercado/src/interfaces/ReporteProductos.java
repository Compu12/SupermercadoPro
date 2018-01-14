/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Locale;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class ReporteProductos extends javax.swing.JInternalFrame {
   Connection cn;
   CallableStatement cts;
   ResultSet r;
    public ReporteProductos() {
         initComponents();
    DefaultTableModel tabla= new DefaultTableModel();   
    this.setLocation(350, 100);
    try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          cn=DriverManager.getConnection("jdbc:odbc:conexion");
          
      tabla.addColumn("CODIGO");
      tabla.addColumn("NOMBRE");
      tabla.addColumn ("PROVEEDOR");
      tabla.addColumn ("PRECIO");
      cts=cn.prepareCall("{call pro_mostrar}");
      r=cts.executeQuery();
      while (r.next()){
      Object dato[]= new Object [4];
      for(int i =0;i<4;i++){
      dato[i]=r.getString(i+1);
          }
     tabla.addRow(dato);
      }
     this.JT_TablaReporteProductos.setModel(tabla);
           

        }catch(Exception e){
        
        }         
   
   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_TablaReporteProductos = new javax.swing.JTable();
        JBT_Imprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JT_TablaReporteProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JT_TablaReporteProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JT_TablaReporteProductos);

        JBT_Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.png"))); // NOI18N
        JBT_Imprimir.setText("IMPRIMIR");
        JBT_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_ImprimirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("REPORTE DE PRODUCTOS");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBT_Imprimir)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBT_Imprimir)
                    .addComponent(jButton1))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int opcion=JOptionPane.showConfirmDialog(null,"Realmente deseea Salir","SALIR?",JOptionPane.YES_NO_OPTION);
if(opcion==JOptionPane.YES_NO_OPTION){
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void JBT_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_ImprimirActionPerformed
        // TODO add your handling code here:
           try {
        
        cn=DriverManager.getConnection("jdbc:odbc:conexion");
         JasperReport reportes = JasperCompileManager.compileReport("reporteproductos1.jrxml");
        JasperPrint print=JasperFillManager.fillReport(reportes,null,cn);
     JasperViewer visor = new JasperViewer(print,false);
     visor.setVisible(true);
     visor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
     
     }catch(Exception e ){
     }
    }//GEN-LAST:event_JBT_ImprimirActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_Imprimir;
    private javax.swing.JTable JT_TablaReporteProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
