
package interfaces;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
 
public class SubMenuProductos extends javax.swing.JInternalFrame {
   Connection cn;
   CallableStatement cts;
   ResultSet r;
   public SubMenuProductos() {
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
     this.JT_TablaProductos.setModel(tabla);
           

        }catch(Exception e){
        
        }         
   
   
   
   }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTF_Codigo = new javax.swing.JTextField();
        JTF_NombreProducto = new javax.swing.JTextField();
        JTF_Proveedor = new javax.swing.JTextField();
        JTF_PrecioTienda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_TablaProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        JB_Buscar = new javax.swing.JButton();
        JB_Agregar = new javax.swing.JButton();
        JB_Limpiar = new javax.swing.JButton();
        JB_Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("CODIGO:");

        jLabel3.setText("NOMBRE PRODUCTO:");

        jLabel4.setText("PROVEEDOR:");

        jLabel5.setText("PRECIO EN TIENDA:");

        JTF_Codigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JTF_NombreProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JTF_Proveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JTF_PrecioTienda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(JTF_PrecioTienda, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTF_NombreProducto)
                            .addComponent(JTF_Proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(JTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTF_NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTF_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTF_PrecioTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        JT_TablaProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JT_TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JT_TablaProductos);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JB_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search.png"))); // NOI18N
        JB_Buscar.setText("BUSCAR");
        JB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BuscarActionPerformed(evt);
            }
        });

        JB_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yes.png"))); // NOI18N
        JB_Agregar.setText("AGREGAR");
        JB_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AgregarActionPerformed(evt);
            }
        });

        JB_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete.png"))); // NOI18N
        JB_Limpiar.setText("LIMPIAR");
        JB_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_LimpiarActionPerformed(evt);
            }
        });

        JB_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        JB_Salir.setText("SALIR");
        JB_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JB_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JB_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addComponent(JB_Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addComponent(JB_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(JB_Agregar)
                    .addGap(18, 18, 18)
                    .addComponent(JB_Buscar)
                    .addGap(18, 18, 18)
                    .addComponent(JB_Limpiar)
                    .addGap(18, 18, 18)
                    .addComponent(JB_Salir)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("SISTEMA DE INGRESO DE PRODUCTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(106, 106, 106)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_SalirActionPerformed
        // TODO add your handling code here:
        int opcion=JOptionPane.showConfirmDialog(null,"Realmente desea Salir","SALIR?",JOptionPane.YES_NO_OPTION);
        if(opcion==JOptionPane.YES_NO_OPTION){
        this.dispose();
        }
    }//GEN-LAST:event_JB_SalirActionPerformed

    private void JB_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AgregarActionPerformed
        // TODO add your handling code here:
        try {
       int id=Integer.parseInt(this.JTF_Codigo.getText());
       String nom=this.JTF_NombreProducto.getText();
       String pro=this.JTF_Proveedor.getText();
       int pre=Integer.parseInt(this.JTF_PrecioTienda.getText());
       
        
            cts=cn.prepareCall("{call pro_registrar(?,?,?,?)}");
            cts.setInt(1, id);
            cts.setString(2, nom);
            cts.setString(3, pro);
            cts.setInt(4, pre);
            int rpta=cts.executeUpdate();
            if (rpta==1)
                JOptionPane.showMessageDialog(this,"Registrado correctamente!!","Atencion",JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
             
        }
        
          
    }//GEN-LAST:event_JB_AgregarActionPerformed

    private void JB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BuscarActionPerformed
        // TODO add your handling code here:
        String cod=JOptionPane.showInputDialog("INGRESE EL CODIGO DEL PRODUCTO  A BUSCAR");
        try {
            cts=cn.prepareCall("{call produc_buscar(?)}");
            cts.setString(1, cod);
            r=cts.executeQuery();
            if (r.next()){
                JOptionPane.showMessageDialog(this,"Producto Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.JTF_Codigo.setText(r.getString(1));
                this.JTF_NombreProducto.setText(r.getString(2));
                this.JTF_Proveedor.setText(r.getString(3));
                this.JTF_PrecioTienda.setText(r.getString(4));
                
             }else{

           JOptionPane.showMessageDialog(this,"Lo sentimos no se encontro el producto!!","Aviso",JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception e) {JOptionPane.showMessageDialog(this, e.toString());
        }    
    }//GEN-LAST:event_JB_BuscarActionPerformed

    private void JB_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_LimpiarActionPerformed
        // TODO add your handling code here:
        this.JTF_Codigo.setText("");
        this.JTF_NombreProducto.setText("");
        this.JTF_Proveedor.setText("");
        this.JTF_PrecioTienda.setText("");
    }//GEN-LAST:event_JB_LimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Agregar;
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JButton JB_Limpiar;
    private javax.swing.JButton JB_Salir;
    private javax.swing.JTextField JTF_Codigo;
    private javax.swing.JTextField JTF_NombreProducto;
    private javax.swing.JTextField JTF_PrecioTienda;
    private javax.swing.JTextField JTF_Proveedor;
    private javax.swing.JTable JT_TablaProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
