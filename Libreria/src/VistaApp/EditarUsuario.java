package VistaApp;

//import VistaApp.Inicio;
import ControladoresBD.DAO_usuario;
import Modelo.modeloUsuario;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class EditarUsuario extends javax.swing.JFrame implements Runnable{
    private static String hora,minutos,segundos,ampm;
    private static String dia,mes,año;
    private static Calendar calendario1;
    private static Thread h1; 
    private modeloUsuario mUser;
    @Override
    @SuppressWarnings("SleepWhileInLoop")
        public void run(){
            Thread ct = Thread.currentThread();
            while(ct == h1) {
                calcula();
                lblFechaHora.setText(dia+"/"+mes+"/"+año+"\n    "+hora + ":" + minutos + ":" + segundos + " "+ampm+" ");
                try {
                Thread.sleep(1000);
                }catch(InterruptedException e) {}
            }
        }
        
    public void calcula () {
        Calendar calendar = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendar.setTime(fechaHoraActual);
        ampm = calendar.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        if(ampm.equals("PM")){
            int h = calendar.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?""+h:"0"+h;
        }else{
            hora = calendar.get(Calendar.HOUR_OF_DAY)>9?""+calendar.get(Calendar.HOUR_OF_DAY):"0"+calendar.get(Calendar.HOUR_OF_DAY); }
            minutos = calendar.get(Calendar.MINUTE)>9?""+calendar.get(Calendar.MINUTE):"0"+calendar.get(Calendar.MINUTE);
            segundos = calendar.get(Calendar.SECOND)>9?""+calendar.get(Calendar.SECOND):"0"+calendar.get(Calendar.SECOND);
            dia = calendar.get(Calendar.DAY_OF_MONTH)>9?""+calendar.get(Calendar.DAY_OF_MONTH):"0"+calendar.get(Calendar.DAY_OF_MONTH);
            mes = (calendar.get(Calendar.MONTH)+1)>9?""+(calendar.get(Calendar.MONTH)+1):"0"+(calendar.get(Calendar.MONTH)+1);
            año = calendar.get(Calendar.YEAR)>9?""+calendar.get(Calendar.YEAR):"0"+calendar.get(Calendar.YEAR);
    }
    @SuppressWarnings("CallToThreadStartDuringObjectConstruction")
    
    public EditarUsuario() {
        initComponents();
        h1 = new Thread(this);
        h1.start();
        super.setLocationRelativeTo(null);
        iniciTxtArea();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblCargo1 = new javax.swing.JLabel();
        lblNombreUser = new javax.swing.JLabel();
        lblFechaHora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegresa = new javax.swing.JToggleButton();
        btnCerrarSesion = new javax.swing.JToggleButton();
        lblNombreUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblCargo2 = new javax.swing.JLabel();
        txtNombreUsuario2 = new javax.swing.JTextField();
        txtpasword = new javax.swing.JPasswordField();
        cBoxTipoUser = new javax.swing.JComboBox<>();
        lblTipoUsuario = new javax.swing.JLabel();
        btnGuardarCambios = new javax.swing.JButton();
        lblNombreUsuario1 = new javax.swing.JLabel();
        txtNombrePasado = new javax.swing.JTextField();
        lbResult = new javax.swing.JLabel();
        txtArea = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cBoxCargo = new javax.swing.JComboBox<>();
        btnEliminarUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar usuario");
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        setForeground(new java.awt.Color(255, 0, 0));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);

        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 650));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre del usuario:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cargo:");

        lblCargo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCargo1.setText("blanco");
        lblCargo1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNombreUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreUser.setText("blanco");
        lblNombreUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblFechaHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFechaHora.setText("Fecha y hora");
        lblFechaHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos a editar:");

        btnRegresa.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresa.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        btnRegresa.setText("REGRESAR");
        btnRegresa.setAutoscrolls(true);
        btnRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresaActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(204, 0, 0));
        btnCerrarSesion.setText("CERRAR SESIÓN");
        btnCerrarSesion.setAutoscrolls(true);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        lblNombreUsuario.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        lblNombreUsuario.setText("Nombre de usuario:");

        lblCargo.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        lblCargo.setText("Contraseña:");

        lblCargo2.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        lblCargo2.setText("Cargo:");

        txtNombreUsuario2.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N

        txtpasword.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        cBoxTipoUser.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        cBoxTipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "empleado" }));

        lblTipoUsuario.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        lblTipoUsuario.setText("Tipo de usuario:");

        btnGuardarCambios.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 0, 0));
        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        lblNombreUsuario1.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        lblNombreUsuario1.setText("id_Usuario a editar:");

        txtNombrePasado.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        txtNombrePasado.setToolTipText("id");

        lbResult.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lbResult.setForeground(new java.awt.Color(255, 0, 0));
        lbResult.setText("-");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        txtArea.setViewportView(jTextArea1);

        cBoxCargo.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        cBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dueno", "asesor" }));
        cBoxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxCargoActionPerformed(evt);
            }
        });

        btnEliminarUser.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        btnEliminarUser.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarUser.setText("Eliminar usuario");
        btnEliminarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNombreUsuario)
                                    .addComponent(lblCargo)
                                    .addComponent(lblCargo2)
                                    .addComponent(lblTipoUsuario))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtpasword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                            .addComponent(txtNombreUsuario2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cBoxTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRegresa)
                                        .addGap(55, 55, 55))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCargo1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNombreUser)
                                .addGap(119, 119, 119)
                                .addComponent(lblFechaHora)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrarSesion)))
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lblNombreUsuario1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombrePasado, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnEliminarUser))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addComponent(btnGuardarCambios)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblNombreUser)
                            .addComponent(lblFechaHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblCargo1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreUsuario1)
                    .addComponent(txtNombrePasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUser))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreUsuario)
                            .addComponent(txtNombreUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo2)
                    .addComponent(cBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo)
                    .addComponent(txtpasword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoUsuario)
                            .addComponent(cBoxTipoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresa)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarCambios))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbResult, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(185, 185, 185))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        this.hide();
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresaActionPerformed
        this.dispose();
        this.hide();
        AdminUsuarios au = new AdminUsuarios();
        au.setmUser(mUser);
        au.setVisible(true); 
    }//GEN-LAST:event_btnRegresaActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        DAO_usuario dauser = new DAO_usuario();
        String id = txtNombrePasado.getText();
        String nom = txtNombreUsuario2.getText();
        String cargo = cBoxCargo.getSelectedItem().toString();
        String contra = txtpasword.getText();
        String tipo = cBoxTipoUser.getSelectedItem().toString();
        try 
        {
            lbResult.setText(dauser.updateUser(Integer.parseInt(id),nom, cargo, contra, tipo));
        }
         catch(Exception ex)
        {
            System.out.println("¡ERROR! " /*+ ex.getMessage()*/);
            lbResult.setText("¡ERROR!");
        }
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void cBoxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxCargoActionPerformed

    private void btnEliminarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarUserActionPerformed

    public void iniciTxtArea()
    {
         DAO_usuario lu = new DAO_usuario();
         String dat1 = ""; 
          List<modeloUsuario> c = lu.todosUsers();
              Iterator iteraC = c.iterator();
             
                    while (iteraC.hasNext()) 
                { 
                  Object[] tuple = (Object[])iteraC.next(); 
                  dat1 += tuple[0] + " / " + (String)tuple[1] + " / " +  (String)tuple[2]  + " / " + (String)tuple[3] + " / " +  (String)tuple[4] + "\n";
                } 
                    System.out.println("-----\n" + dat1 + "-----");
            jTextArea1.append(dat1);
            jTextArea1.setEditable(false);
    }
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
           // java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
           // java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
           // java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           // java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EditarUsuario().setVisible(true);
            }
        });
    }

    public void setmUser(modeloUsuario mUser) {
        this.mUser = mUser;
        lblNombreUser.setText(mUser.nombre);
        lblCargo1.setText(mUser.cargo);        
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCerrarSesion;
    private javax.swing.JButton btnEliminarUser;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JToggleButton btnRegresa;
    private javax.swing.JComboBox<String> cBoxCargo;
    private javax.swing.JComboBox<String> cBoxTipoUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbResult;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCargo1;
    private javax.swing.JLabel lblCargo2;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblNombreUser;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblNombreUsuario1;
    private javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JScrollPane txtArea;
    private javax.swing.JTextField txtNombrePasado;
    private javax.swing.JTextField txtNombreUsuario2;
    private javax.swing.JPasswordField txtpasword;
    // End of variables declaration//GEN-END:variables
}
