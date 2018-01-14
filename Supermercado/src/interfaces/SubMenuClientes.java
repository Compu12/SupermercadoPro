
package interfaces;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class SubMenuClientes extends javax.swing.JInternalFrame {
   Connection cn;
   CallableStatement cts;
   ResultSet r;
   
    public SubMenuClientes() {
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
     this.JT_TablaClientes.setModel(tabla);
           

        }catch(Exception e){
        
        }         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JTF_ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTF_APELLIDO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTF_TELEFONO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTF_NOMBRE = new javax.swing.JTextField();
        JTF_CORREO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_TablaClientes = new javax.swing.JTable();
        JB_Agregar = new javax.swing.JButton();
        JB_Limpiar = new javax.swing.JButton();
        JB_Salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JB_Buscar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("ID:");

        JTF_ID.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("APELLIDO:");

        JTF_APELLIDO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JTF_APELLIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_APELLIDOActionPerformed(evt);
            }
        });

        jLabel5.setText("TELEFONO: ");

        JTF_TELEFONO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JTF_TELEFONO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_TELEFONOActionPerformed(evt);
            }
        });

        jLabel6.setText("CORREO: ");

        JTF_NOMBRE.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JTF_CORREO.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(JTF_TELEFONO, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_NOMBRE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTF_APELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTF_CORREO)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(JTF_APELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTF_TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(JTF_CORREO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ClientesSuper.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JT_TablaClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JT_TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Telefono", "Apellido", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JT_TablaClientes);

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

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("SISTEMA DE INGRESO DE CLIENTES");

        JB_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search.png"))); // NOI18N
        JB_Buscar.setText("BUSCAR");
        JB_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JB_Agregar)
                                        .addGap(18, 18, 18)
                                        .addComponent(JB_Limpiar)
                                        .addGap(18, 18, 18)
                                        .addComponent(JB_Buscar)
                                        .addGap(26, 26, 26)
                                        .addComponent(JB_Salir))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel7)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_Agregar)
                    .addComponent(JB_Limpiar)
                    .addComponent(JB_Buscar)
                    .addComponent(JB_Salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_TELEFONOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_TELEFONOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_TELEFONOActionPerformed

    private void JB_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AgregarActionPerformed
       
        try {
       String id = this.JTF_ID.getText();
       String nom=this.JTF_NOMBRE.getText();
       int tel=Integer.parseInt(this.JTF_TELEFONO.getText());
       String ape=this.JTF_APELLIDO.getText();
       String cor=this.JTF_CORREO.getText();
        
            cts=cn.prepareCall("{call sp_registrar(?,?,?,?,?)}");
            cts.setString(1, id);
            cts.setString(2, nom);
            cts.setInt(3, tel);
            cts.setString(4, ape);
            cts.setString(5, cor);
            int rpta=cts.executeUpdate();
            if (rpta==1)
                JOptionPane.showMessageDialog(this,"Registrado correctamente!!","Atencion",JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
             
        }
        
    }//GEN-LAST:event_JB_AgregarActionPerformed

    private void JB_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_SalirActionPerformed
        // TODO add your handling code here:
        int opcion=JOptionPane.showConfirmDialog(null,"Realmente deseea Salir","SALIR?",JOptionPane.YES_NO_OPTION);
if(opcion==JOptionPane.YES_NO_OPTION){
this.dispose();
}
    }//GEN-LAST:event_JB_SalirActionPerformed

    private void JB_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BuscarActionPerformed
        // TODO add your handling code here:
        String cod=JOptionPane.showInputDialog("INGRESE EL CODIGO DEL CLIENTE A BUSCAR");
        try {
            cts=cn.prepareCall("{call sp_buscar(?)}");
            cts.setString(1, cod);
            r=cts.executeQuery();
            if (r.next()){
                JOptionPane.showMessageDialog(this,"Cliente Encontrado!!","Aviso",JOptionPane.WARNING_MESSAGE);
                this.JTF_ID.setText(r.getString(1));
                this.JTF_NOMBRE.setText(r.getString(2));
                this.JTF_TELEFONO.setText(r.getString(3));
                this.JTF_APELLIDO.setText(r.getString(4));
                this.JTF_CORREO.setText(r.getString(5));
             }else{

           JOptionPane.showMessageDialog(this,"Cliente  No Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception e) {JOptionPane.showMessageDialog(this, e.toString());
        }    
                
            
    }//GEN-LAST:event_JB_BuscarActionPerformed

    private void JTF_APELLIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_APELLIDOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_APELLIDOActionPerformed

    private void JB_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_LimpiarActionPerformed
        // TODO add your handling code here:
        this.JTF_APELLIDO.setText("");
        this.JTF_CORREO.setText("");
        this.JTF_ID.setText("");
        this.JTF_TELEFONO.setText("");
        this.JTF_NOMBRE.setText("");
    }//GEN-LAST:event_JB_LimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Agregar;
    private javax.swing.JButton JB_Buscar;
    private javax.swing.JButton JB_Limpiar;
    private javax.swing.JButton JB_Salir;
    private javax.swing.JTextField JTF_APELLIDO;
    private javax.swing.JTextField JTF_CORREO;
    private javax.swing.JTextField JTF_ID;
    private javax.swing.JTextField JTF_NOMBRE;
    private javax.swing.JTextField JTF_TELEFONO;
    private javax.swing.JTable JT_TablaClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
