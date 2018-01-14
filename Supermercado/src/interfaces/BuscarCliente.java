
package interfaces;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
public class BuscarCliente extends javax.swing.JInternalFrame {

   Connection cn;
   CallableStatement cts;
   ResultSet r;
   ListSelectionModel lsClientes;
    public BuscarCliente() {
        initComponents();
     DefaultTableModel tabla= new DefaultTableModel();
    this.setLocation(350, 100);
    try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          cn=DriverManager.getConnection("jdbc:odbc:conexion");
           tabla.addColumn("CODIGO");
      tabla.addColumn("NOMBRE");
      tabla.addColumn ("TELEFONO");
      tabla.addColumn ("APELLIDO");
      tabla.addColumn ("CORREO");
      cts=cn.prepareCall("{call sp_mostrar}");
      r=cts.executeQuery();
      while (r.next()){
      Object dato[]= new Object [5];
      for(int i =0;i<5;i++){
      dato[i]=r.getString(i+1);
          }
     tabla.addRow(dato);
      }
     this.JT_TablaBuscarCliente.setModel(tabla);
           }catch(Exception e){
        
        } 
    }
        private void SelecionaCLiente(){
        int row=this.JT_TablaBuscarCliente.getSelectedRow();
        String id=this.JT_TablaBuscarCliente.getValueAt(row, 0).toString();
         String nom=this.JT_TablaBuscarCliente.getValueAt(row, 1).toString();
        String tel =this.JT_TablaBuscarCliente.getValueAt(row, 2).toString();
         String ape=this.JT_TablaBuscarCliente.getValueAt(row, 3).toString();
        String corr=this.JT_TablaBuscarCliente.getValueAt(row, 4).toString();
         
        Facturas.JTF_FacturaCodigo.setText(id);
        Facturas.JTF_FacturaNombre.setText(nom);
        Facturas.JTF_FacturaTelefono.setText(tel);
        Facturas.JTF_FacturaApellifo.setText(ape);
        Facturas.JTF_FacturaCorreo.setText(corr);
        
        this.dispose();
       
        
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_TablaBuscarCliente = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem3.setText("Agregar Cliente a Factura");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);
        jMenuItem3.getAccessibleContext().setAccessibleName("Agregar a la factura");

        setClosable(true);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        jButton2.setText("REGISTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Busqueda de clientes");

        JT_TablaBuscarCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        JT_TablaBuscarCliente.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(JT_TablaBuscarCliente);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Si el cliente no se encuetra en esta tabla, favor registrar uno nuevo precionando el boton registrar: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SubMenuClientes cli=new SubMenuClientes();
        MenuPrincipal.JDP_MenuPrincipal.add(cli);
        cli.toFront();
        cli.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        SelecionaCLiente();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
    }    
     private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        SelecionaCLiente();
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JT_TablaBuscarCliente;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
