/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
public class BuscarArticulos extends javax.swing.JInternalFrame {
   Connection cn;
   CallableStatement cts;
   ResultSet r;
    public BuscarArticulos() {
        initComponents();
        DefaultTableModel tabla= new DefaultTableModel();   
    this.setLocation(350, 100);
    try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          cn=DriverManager.getConnection("jdbc:odbc:conexion");
           
            tabla.addColumn("CODIGO");
            tabla.addColumn("PRODUCTO");
            tabla.addColumn("PROVEEDOR");
            tabla.addColumn("PRECIO");
            cts=cn.prepareCall("{call pro_mostrar}");
            r=cts.executeQuery();
            while (r.next()){
                Object dato[]=new  Object[4];
                for (int i=0; i<4; i++){
                    dato[i]=r.getString(i+1);
                     }
     tabla.addRow(dato);
      }
     this.JT_TablaBuscarProducto.setModel(tabla);
           

        }catch(Exception e){
        
        } 

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_TablaBuscarProducto = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        JBT_REGISTRAR = new javax.swing.JButton();

        jMenuItem1.setText("Seleccionar Producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Busqueda de Productos");

        JT_TablaBuscarProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        JT_TablaBuscarProducto.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(JT_TablaBuscarProducto);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Si el producto no se encuetra en esta tabla, favor registrar uno nuevo precionando el boton registrar: ");

        JBT_REGISTRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        JBT_REGISTRAR.setText("REGISTRAR");
        JBT_REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_REGISTRARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JBT_REGISTRAR))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(JBT_REGISTRAR)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void Selecionaarticulo(){
       
         DefaultTableModel modelo = (DefaultTableModel) Facturas.JTB_TablaDetalle.getModel();
        int row=JT_TablaBuscarProducto.getSelectedRow();
        String id=JT_TablaBuscarProducto.getValueAt(row, 0).toString();
        String nom=JT_TablaBuscarProducto.getValueAt(row, 1).toString();
        String pro=JT_TablaBuscarProducto.getValueAt(row, 2).toString();
         String pre=JT_TablaBuscarProducto.getValueAt(row, 3).toString();
          
         int i=0; 
         i=i+1;
         Object[]  dato=new Object[4];
         
            dato[0]=id;
            dato[1]=nom;
            dato[2]="";
            dato[3]=pre.toString();
            
            modelo.addRow(dato);
            Facturas.JTB_TablaDetalle.setModel(modelo);
           Facturas.JTB_TablaDetalle.editCellAt(row, 2);
            this.dispose();
           

         
       
 }
    private void JBT_REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_REGISTRARActionPerformed
        SubMenuProductos pro=new SubMenuProductos();
        MenuPrincipal.JDP_MenuPrincipal.add(pro);
        pro.toFront();
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBT_REGISTRARActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   Selecionaarticulo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_REGISTRAR;
    private javax.swing.JTable JT_TablaBuscarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
