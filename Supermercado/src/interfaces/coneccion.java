/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class coneccion {

    java.sql.Connection connect;

    // metodo para conectar
    public java.sql.Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // parametros para conectar a la base de datos y servidor
            connect = DriverManager.getConnection("jdbc:mysql://localhost/supermercado", "root", "");
//            JOptionPane.showMessageDialog(null,"CONECCION CORRECTA");
            //JOptionPane.showMessageDialog(null, "Listo OK");
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex);
            JOptionPane.showMessageDialog(null, "FALLO LA CONECCION INTENTALO MAS TARDE");

        }
        return connect;
    }

}
