

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ventana extends javax.swing.JFrame {

Validaciones validar = new Validaciones();
    public ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
 
        try {
            llenarTabla(conexionBD.obtener());
            
        } catch (SQLException ex) {
            Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    
    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtNumeroControl() {
        return txtNumeroControl;
    }

    public void setTxtNumeroControl(JTextField txtNumeroControl) {
        this.txtNumeroControl = txtNumeroControl;
    }

    public JTextArea getTxtDatosFiltrados() {
        return txtReduce;
    }

    public void setTxtDatosFiltrados(JTextArea txtDatosFiltrados) {
        this.txtReduce = txtDatosFiltrados;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        txtNumeroControl = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDatosFiltrados = new javax.swing.JTextArea();
        btnReduce = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtReduce = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        txtNumeroControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroControlActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumeroControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Log de Operaciones");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 0));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setText("Registrar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setOpaque(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Obtener Pares e Impares");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Numero Control"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 350, 130));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrar Alumnos");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        btnReset.setBackground(new java.awt.Color(255, 255, 0));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setText("Resetear Datos");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.setOpaque(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        txtLog.setEditable(false);
        txtLog.setBackground(new java.awt.Color(0, 0, 0));
        txtLog.setColumns(20);
        txtLog.setForeground(new java.awt.Color(51, 255, 51));
        txtLog.setRows(5);
        jScrollPane3.setViewportView(txtLog);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 340, 70));

        txtDatosFiltrados.setEditable(false);
        txtDatosFiltrados.setColumns(20);
        txtDatosFiltrados.setRows(5);
        jScrollPane4.setViewportView(txtDatosFiltrados);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 350, -1));

        btnReduce.setBackground(new java.awt.Color(255, 255, 0));
        btnReduce.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReduce.setText("Reduce");
        btnReduce.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReduce.setOpaque(false);
        btnReduce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReduceActionPerformed(evt);
            }
        });
        getContentPane().add(btnReduce, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        txtReduce.setColumns(20);
        txtReduce.setRows(5);
        jScrollPane5.setViewportView(txtReduce);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 340, 60));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Alumnos registrados en la base de datos");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 10, 620));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Numero de Control");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Datos Filtrados");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre Màs Largo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("MAP, FILTER Y REDUCE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sin títu2w-2.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    //Este metodo es para llenar la tabla de datos
    public void llenarTabla(Connection conexion)throws SQLException{
     
     DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
     Object [] fila=new Object[2];
     
     try{
     PreparedStatement consulta = conexion.prepareStatement("SELECT Nombre, Numero_Control FROM " + tabla );
      ResultSet resultado = consulta.executeQuery();
      
      
       while(resultado.next()){
           fila[1]=resultado.getString("Numero_Control");
           fila[0]=resultado.getString("Nombre");
           modelo.addRow(fila);
       }
      tblDatos.setModel(modelo);

     }catch(SQLException ex){
         
     }
     
 }
    public void actualizarTabla(Connection conexion)throws SQLException{
     
     DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
     Object [] fila=new Object[2];
     
     try{
        txtLog.setText(">Tabla Actualizada!");
     PreparedStatement consulta = conexion.prepareStatement("select nombre, Numero_Control from alumnos where id =(SELECT MAX(id) FROM alumnos)" );
      ResultSet resultado = consulta.executeQuery();
      while(resultado.next()){
           fila[1]=resultado.getString("Numero_Control");
           fila[0]=resultado.getString("Nombre");
           modelo.addRow(fila);
       }
      tblDatos.setModel(modelo);
      System.out.println("Nombre:"+fila[0]+"NumeroControl:"+fila[1]);
     
     }catch(SQLException ex){
         
     }
     
 }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        try {
            //despues de registrar alumnos llenara la tabla nuevamente
            String numeroC = txtNumeroControl.getText();
            String nombreA = txtNombre.getText();
            
            validar.validarNombre(nombreA);       
            validar.validarNumeroControl(numeroC);
            if(validar.validado==true){
                guardarAlumnos(conexionBD.obtener());
                actualizarTabla(conexionBD.obtener());
                 txtLog.setText(">Nuevo registro creado!");
            }else{
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try {
            MapFilter(conexionBD.obtener());
        } catch (SQLException ex) {
            Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        try {
            resetearTabla(conexionBD.obtener());
            limpiarTabla();
            txtReduce.setText("");
            txtDatosFiltrados.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnReduceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReduceActionPerformed
      try {
            Reduce(conexionBD.obtener());
        } catch (SQLException ex) {
            Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReduceActionPerformed

    private void txtNumeroControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroControlActionPerformed
public void limpiarTabla(){
DefaultTableModel dt=new DefaultTableModel();
tblDatos.setModel(dt);
 
//Y para borrar basta con un for de atras hacia adelante.
 
for (int i = dt.getRowCount() -1; i >= 0; i--)
     {
            dt.removeRow(i);
      }
tblDatos.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

    },
    new String [] {
        "Nombre", "Numero Control"}));
txtLog.setText(">Base de datos reestablecida");
}//
   
    /**
     * @param args the command line arguments
     */
    
    //METODOPARA GUARDAR ALUMNOS EN LA BASE DE DATOS
      String tabla = "alumnos";
 
    public void guardarAlumnos(Connection conexion)throws SQLException{
            String nombre=txtNombre.getText();
            int numeroControl=Integer.parseInt(txtNumeroControl.getText());
            
            try{
           PreparedStatement insert;
               //---------
               insert = conexion.prepareStatement("INSERT INTO "+ tabla + "(Nombre,Numero_Control) VALUES(?,?)");
              
               insert.setString(1, nombre);
               insert.setInt(2, numeroControl);
           
             
                insert.execute();
               showMessageDialog(this,"Datos guardados");
              
            }catch(SQLException ex){
                 showMessageDialog(this,"ERROR:"+ex);
                 
            }
    }
    //Guardar
    
    public void MapFilter(Connection conexion)throws SQLException{
        
        ArrayList<String> numeroControl = new ArrayList<String>();
         List<Integer> par = null;
         List<Integer> impar = null;
        try{
        PreparedStatement consulta = conexion.prepareStatement("SELECT nombre, Numero_Control FROM " + tabla );
        ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             
            numeroControl.add(resultado.getString("Numero_Control")); 
   
             par = numeroControl.stream() .map(s -> Integer.valueOf(s)) .filter(number -> number % 2 == 0) .collect(Collectors.toList());
             impar = numeroControl.stream() .map(s -> Integer.valueOf(s)) .filter(number -> number % 2 != 0) .collect(Collectors.toList());
             
              txtDatosFiltrados.setText("Numeros de control PARES:"+"\n"+ par+"\n"+
              "Numero Control IMPARES"+"\n"+impar);
               txtLog.setText(">Map y Filter aplicado!");
            }
           
            //recorrer el ArrayList por cada alemento
       /* Iterator<String> it = numeroControl.iterator();
        String numControl="";
        while (it.hasNext()){
            numControl += it.next()+"\n";
            
            txtDatosFiltrados.setText(numControl);
             
        }
           //showMessageDialog(this,"Datos:"+numeroControl +"\n"+"PARES:"+even);
          */ 
      }catch(SQLException ex){
          showMessageDialog(this,"ERROR:"+ex);
      }
  
    }
   
   public void Reduce(Connection conexion)throws SQLException{
        
        ArrayList<String> Nombre = new ArrayList<String>();
    
        String nombre = "";
        try{
        PreparedStatement consulta = conexion.prepareStatement("SELECT nombre, Numero_Control FROM " + tabla );
        ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             
            Nombre.add(resultado.getString("nombre")); 
   
                  /*Iterator<String> it = Nombre.iterator();
                          while(it.hasNext()){
                            nombre += it.next();
                          }
                   txtReduce.setText(nombre+"\n");*/
                  
                  
                 Optional<String> nombreLargo = Nombre.stream() 
                                   .reduce((word1, word2) 
                             -> word1.length() > word2.length() 
                                           ? word1 : word2);
                 
                  txtReduce.setText(nombreLargo+"");
                 txtLog.setText(">Aplicado Reduce!");
            }
    
      }catch(SQLException ex){
          showMessageDialog(this,"ERROR:"+ex);
      }
  
    }
     //metodo para resetear la tabla
    public void resetearTabla(Connection conexion)throws SQLException{
        try{
        PreparedStatement query = conexion.prepareStatement("TRUNCATE alumnos" );
        query.execute();

        
        showMessageDialog(this,"Datos reseteados");
       
        }catch(SQLException ex){
            showMessageDialog(this,"ERROR:"+ex);
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReduce;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextArea txtDatosFiltrados;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroControl;
    private javax.swing.JTextArea txtReduce;
    // End of variables declaration//GEN-END:variables
}
