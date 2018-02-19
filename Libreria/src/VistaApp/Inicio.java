package VistaApp;

import ControladoresBD.DAO_libro;
import ControladoresBD.DAO_usuario;
import Modelo.modeloUsuario;
import java.awt.Color;
import java.awt.Image;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;



public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        //super.setExtendedState(JFrame.MAXIMIZED_BOTH);
        super.setLocationRelativeTo(null);
        super.setLayout(null);    
        super.getContentPane().setBackground(Color.white);
        ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/img/libro.jpg"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(200,200,Image.SCALE_SMOOTH));
        jLabel5.setIcon(iconoEscalado);
        lbCargando.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JToggleButton();
        txtPassw = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lbresultado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbCargando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenidos a la Librería América");
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        setForeground(new java.awt.Color(255, 0, 0));
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 204));
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        txtPassw.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtPassw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel4.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel3.setText("Usuario:");

        txtUser.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        lbresultado.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lbresultado.setText("Introduzca sus datos");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 28)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 1, 35)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BIENVENIDOS A LA LIBRERÍA AMÉRICA");

        lbCargando.setForeground(new java.awt.Color(255, 0, 0));
        lbCargando.setText("Consultando datos . . .");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassw, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(lbresultado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(lbCargando))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbresultado)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCargando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPasswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswActionPerformed

     modeloUsuario mUser = null; // iniciamos el objeto usuario
     OpcionesAdmin opAdmin = null; //iniciamos la pantalla de admin
     OpcionesEmpleado opEmpleado = null; //iniciamos la pantalla de empleado
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
             btnIngresar.setEnabled(false);
             lbCargando.setVisible(true);
          String nom = txtUser.getText(); //tomamos datos de la caja de texto
          String pass = txtPassw.getText();
          mUser = new modeloUsuario();
         
          try
          {
              DAO_usuario lb = new DAO_usuario();       
              // Iterator iterador = lb.VerUsuario(nom,pass).listIterator();
              List<?> b = lb.VerUsuario(nom,pass);
              Iterator iterador = b.iterator();

             if(b.size() == 1) //si la lista trae resultados
             {                                
                while (iterador.hasNext()) 
                { 
                  Object[] tuple = (Object[])iterador.next(); 
                  //dat1 += tuple[0] + " " + (String)tuple[1] + " " +  (String)tuple[2]  + " " + (String)tuple[3] + " " +  (String)tuple[4] + "\n";
                  mUser.setNombre((String)tuple[1]);
                  mUser.setCargo((String)tuple[2]);
                  mUser.setTipo_usuario((String)tuple[4]);
                  System.out.println("tipo_usuario = " + mUser.getTipo_usuario()); 
                } 
                 System.out.println("Datos VALIDOS");
                 lbresultado.setText("Bienvenido " + mUser.getTipo_usuario() );
                
                if(mUser.getTipo_usuario().equals("Admin"))
                {
                      opAdmin = new OpcionesAdmin();
                      opAdmin.setmUser(mUser);
                      opAdmin.setVisible(true);
                      this.dispose();
                      this.setVisible(false);
                }
                else
                {
                     opEmpleado = new OpcionesEmpleado();
                     opEmpleado.setmUser(mUser);
                     opEmpleado.setVisible(true);
                      this.dispose();
                      this.setVisible(false);
                }
             }
             else
             {
                  System.out.println("DATOS NO VALIDOS");
                 lbresultado.setText("DATOS NO VALIDOS");
             }
              btnIngresar.setEnabled(true);
             lbCargando.setVisible(false);
        }
        catch(Exception ex) {  System.out.println("Error: " + ex.getMessage()); }     
    }//GEN-LAST:event_btnIngresarActionPerformed

    
    
    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnIngresar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCargando;
    private javax.swing.JLabel lbresultado;
    private javax.swing.JPasswordField txtPassw;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
