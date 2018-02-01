package VistaApp;

//import VistaApp.Inicio;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class OpcionesEmpleado extends javax.swing.JFrame implements Runnable{
    private static String hora,minutos,segundos,ampm;
    private static String dia,mes,año;
    private static Calendar calendario1;
    private static Thread h1; 
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
    public OpcionesEmpleado() {
        initComponents();
        h1 = new Thread(this);
        h1.start();
        super.setLocationRelativeTo(null);
        lblNombreUser.setText("empleado1");
        lblCargo1.setText("empleado");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        btnAdminLibros = new javax.swing.JToggleButton();
        btnCrearReporte = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
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
        jLabel1.setText("Seleccione una opción");

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

        btnAdminLibros.setBackground(new java.awt.Color(255, 255, 255));
        btnAdminLibros.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btnAdminLibros.setForeground(new java.awt.Color(255, 0, 0));
        btnAdminLibros.setText("Administrar libros");
        btnAdminLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLibrosActionPerformed(evt);
            }
        });

        btnCrearReporte.setBackground(new java.awt.Color(255, 255, 255));
        btnCrearReporte.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btnCrearReporte.setForeground(new java.awt.Color(255, 0, 0));
        btnCrearReporte.setText("Crear reporte");
        btnCrearReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                        .addComponent(btnCerrarSesion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresa)))
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdminLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(lblCargo1))
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdminLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnCrearReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresa)
                        .addGap(126, 126, 126))))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addContainerGap())
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
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnRegresaActionPerformed

    private void btnAdminLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLibrosActionPerformed
        this.dispose();
        this.hide();
        new AdminLib().setVisible(true);
    }//GEN-LAST:event_btnAdminLibrosActionPerformed

    private void btnCrearReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearReporteActionPerformed
        this.dispose();
        this.hide();
        new CrearReporte().setVisible(true);
    }//GEN-LAST:event_btnCrearReporteActionPerformed

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
          //  java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
          //  java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
           // java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
          //  java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OpcionesEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdminLibros;
    private javax.swing.JToggleButton btnCerrarSesion;
    private javax.swing.JToggleButton btnCrearReporte;
    private javax.swing.JToggleButton btnRegresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo1;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblNombreUser;
    // End of variables declaration//GEN-END:variables
}