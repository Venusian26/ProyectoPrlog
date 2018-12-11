/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author juanramon
 */
public class conexionBD {
  
    private static Connection cnx = null;
   
    
    //Iniciar conexion
    public static Connection obtener() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/alumnos", "root", "");
            System.out.println("Conexion satisfactoria");
         } catch (SQLException ex) {
            throw new SQLException(ex);
           
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         }
      }
      return cnx;
   }//obtener
    
    //cerrar conexion
   public static void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   
       }//cerrar
}



         