
package interfaces;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class SubMenuEmpleados extends javax.swing.JInternalFrame {
   Connection cn;
   CallableStatement cts;
   ResultSet r;
   public SubMenuEmpleados() {
        initComponents();
        DefaultTableModel tabla= new DefaultTableModel();
        this.setLocation(350, 100);
        try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          cn=DriverManager.getConnection("jdbc:odbc:conexion");
          
      tabla.addColumn("CODIGO");
      tabla.addColumn("NOMBRE");
      tabla.addColumn ("APELLIDO");
      tabla.addColumn ("CORREO");
      tabla.addColumn ("TELEFONO");
      cts=cn.prepareCall("{call em_mostrar}");
      r=cts.executeQuery();
      while (r.next()){
      Object dato[]= new Object [5];
      for(int i =0;i<5;i++){
      dato[i]=r.getString(i+1);
          }
     tabla.addRow(dato);
      }
        this.JT_TablaEmpleados.setModel(tabla);
        }catch(Exception e){ 
        }  

   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_TablaEmpleados = new javax.swing.JTable();
        JB_AGREGAR = new javax.swing.JButton();
        JBT_Limpiar = new javax.swing.JButton();
        JBT_Buscar = new javax.swing.JButton();
        JBT_Salir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTF_Codigo = new javax.swing.JTextField();
        JTF_Nombre = new javax.swing.JTextField();
        JTF_Apellido = new javax.swing.JTextField();
        JTF_Correo = new javax.swing.JTextField();
        JTF_Telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JT_TablaEmpleados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JT_TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JT_TablaEmpleados);

        JB_AGREGAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yes.png"))); // NOI18N
        JB_AGREGAR.setText("AGREGAR");
        JB_AGREGAR.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JB_AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AGREGARActionPerformed(evt);
            }
        });

        JBT_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete.png"))); // NOI18N
        JBT_Limpiar.setText("LIMPIAR");
        JBT_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_LimpiarActionPerformed(evt);
            }
        });

        JBT_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search.png"))); // NOI18N
        JBT_Buscar.setText("BUSCAR");
        JBT_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_BuscarActionPerformed(evt);
            }
        });

        JBT_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        JBT_Salir.setText("SALIR");
        JBT_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_SalirActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("CODIGO:");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDO:");

        jLabel4.setText("CORREO:");

        jLabel5.setText("TELEFONO:");

        JTF_Codigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JTF_Nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JTF_Apellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JTF_Correo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JTF_Telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(14, 14, 14)
                            .addComponent(JTF_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(JTF_Correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(JTF_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTF_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTF_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(41, 41, 41))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleados.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("SISTEMA DE INGRESO DE EMPLEADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JB_AGREGAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBT_Limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBT_Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBT_Salir)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_AGREGAR)
                    .addComponent(JBT_Limpiar)
                    .addComponent(JBT_Buscar)
                    .addComponent(JBT_Salir))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AGREGARActionPerformed
        try {
       int id=Integer.parseInt(this.JTF_Codigo.getText());
       String nom=this.JTF_Nombre.getText();
       String ape=this.JTF_Apellido.getText();
       String cor=this.JTF_Correo.getText();
       int tel=Integer.parseInt(this.JTF_Telefono.getText()); 
            cts=cn.prepareCall("{call emp_registrar(?,?,?,?,?)}");
            cts.setInt(1, id);
            cts.setString(2, nom);
            cts.setString(3, ape);
            cts.setString(4, cor);
            cts.setInt(5, tel);
            int rpta=cts.executeUpdate();
            if (rpta==1)
                JOptionPane.showMessageDialog(this,"Registrado correctamente!!","Atencion",JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
             
        }
          
    }//GEN-LAST:event_JB_AGREGARActionPerformed

    private void JBT_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_SalirActionPerformed
        // TODO add your handling code here:
        int opcion=JOptionPane.showConfirmDialog(null,"Realmente deseea Salir","SALIR?",JOptionPane.YES_NO_OPTION);
if(opcion==JOptionPane.YES_NO_OPTION){
this.dispose();
    }//GEN-LAST:event_JBT_SalirActionPerformed
 }
    private void JBT_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_BuscarActionPerformed
        // TODO add your handling code here:
        String cod=JOptionPane.showInputDialog("INGRESE EL CODIGO DEL EMPLEADO A BUSCAR");
        try {
            cts=cn.prepareCall("{call em_buscar(?)}");
            cts.setString(1, cod);
            r=cts.executeQuery();
            if (r.next()){
                JOptionPane.showMessageDialog(this,"Empleado Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);
                this.JTF_Codigo.setText(r.getString(1));
                this.JTF_Nombre.setText(r.getString(2));
                this.JTF_Apellido.setText(r.getString(3));
                this.JTF_Correo.setText(r.getString(4));
                this.JTF_Telefono.setText(r.getString(5));
             }else{

           JOptionPane.showMessageDialog(this,"Empleado  No Encontrado!!","Aviso",JOptionPane.INFORMATION_MESSAGE);

            }
        } catch (Exception e) {JOptionPane.showMessageDialog(this, e.toString());
        }    
    }//GEN-LAST:event_JBT_BuscarActionPerformed

    private void JBT_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_LimpiarActionPerformed
        // TODO add your handling code here:
        this.JTF_Apellido.setText("");
        this.JTF_Codigo.setText("");
        this.JTF_Correo.setText("");
        this.JTF_Telefono.setText("");
        this.JTF_Nombre.setText("");
        
    }//GEN-LAST:event_JBT_LimpiarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_Buscar;
    private javax.swing.JButton JBT_Limpiar;
    private javax.swing.JButton JBT_Salir;
    private javax.swing.JButton JB_AGREGAR;
    private javax.swing.JTextField JTF_Apellido;
    private javax.swing.JTextField JTF_Codigo;
    private javax.swing.JTextField JTF_Correo;
    private javax.swing.JTextField JTF_Nombre;
    private javax.swing.JTextField JTF_Telefono;
    private javax.swing.JTable JT_TablaEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
