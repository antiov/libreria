package VistaApp;

import Modelo.modeloLibro;
import VistaApp.Inicio;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;


public class InfoLib extends javax.swing.JFrame implements Runnable{
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
    public InfoLib() {
        initComponents();
        h1 = new Thread(this);
        h1.start();
        super.setLocationRelativeTo(null);
        lblNombreUser.setText("admin");
        lblCargo1.setText("dueño");
    }
    
    public InfoLib(modeloLibro mLib) {
        initComponents();
        h1 = new Thread(this);
        h1.start();
        super.setLocationRelativeTo(null);
        lblNombreUser.setText("admin");
        lblCargo1.setText("dueño");
        
        txtISBN1.setText(mLib.getIsbn());
        txtISBN1.setEditable(false);
        txtTitulo.setText(mLib.getTitulo());
        txtTitulo.setEditable(false);
        txtAutores.setText(mLib.getAutores());
        txtAutores.setEditable(false);
        txtEditorial.setText(mLib.getEditorial());
        txtEditorial.setEditable(false);
        txtLugarImp.setText(mLib.getLugar_impresion());
        txtLugarImp.setEditable(false);
        txtNumPag.setText(""+mLib.getNum_pag());
        txtNumPag.setEditable(false);
        txtIdioma.setText(mLib.getIdioma());
        txtIdioma.setEditable(false);
        txtPrecio.setText(""+mLib.getPrecio());
        txtPrecio.setEditable(false);
        txtEjempDisp.setText(""+mLib.getEjemplares_disponibles());
        txtEjempDisp.setEditable(false);
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
        lblInfoDeLibro = new javax.swing.JLabel();
        btnRegresa = new javax.swing.JToggleButton();
        btnCerrarSesion = new javax.swing.JToggleButton();
        lblTitulo = new javax.swing.JLabel();
        lblAutores = new javax.swing.JLabel();
        lblEditorial = new javax.swing.JLabel();
        lblLugarImp = new javax.swing.JLabel();
        lblNumPag = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblEjempDisp = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblISBN = new javax.swing.JLabel();
        txtISBN1 = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtAutores = new javax.swing.JTextField();
        txtLugarImp = new javax.swing.JTextField();
        txtNumPag = new javax.swing.JTextField();
        txtIdioma = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtEjempDisp = new javax.swing.JTextField();
        lblPesos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Información del libro");
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

        lblFechaHora.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblFechaHora.setText("Fecha y hora");
        lblFechaHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblInfoDeLibro.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lblInfoDeLibro.setForeground(new java.awt.Color(0, 0, 102));
        lblInfoDeLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoDeLibro.setText("Información del libro:");

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

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTitulo.setText("Título:");

        lblAutores.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblAutores.setText("Autor(es):");

        lblEditorial.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEditorial.setText("Editorial:");

        lblLugarImp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblLugarImp.setText("Lugar de impresion:");

        lblNumPag.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNumPag.setText("Número de páginas:");

        lblIdioma.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblIdioma.setText("Idioma:");

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPrecio.setText("Precio:");

        lblEjempDisp.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblEjempDisp.setText("Ejemplares disponibles:");

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        lblISBN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblISBN.setText("ISBN:");

        txtISBN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISBN1ActionPerformed(evt);
            }
        });

        txtEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialActionPerformed(evt);
            }
        });

        txtAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutoresActionPerformed(evt);
            }
        });

        txtLugarImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarImpActionPerformed(evt);
            }
        });

        txtNumPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumPagActionPerformed(evt);
            }
        });

        txtIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdiomaActionPerformed(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        txtEjempDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEjempDispActionPerformed(evt);
            }
        });

        lblPesos.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPesos.setText("pesos");

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
                        .addComponent(btnRegresa))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEjempDisp)
                                    .addComponent(lblIdioma)
                                    .addComponent(lblPrecio)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNumPag)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblEditorial)
                                            .addComponent(lblLugarImp)
                                            .addComponent(lblAutores)
                                            .addComponent(lblISBN)))))
                            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtISBN1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumPag, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtIdioma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtLugarImp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEditorial, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEjempDisp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPesos)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(lblInfoDeLibro)
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
                        .addGap(21, 21, 21)
                        .addComponent(lblInfoDeLibro)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblISBN)
                            .addComponent(txtISBN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAutores)
                            .addComponent(txtAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEditorial)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLugarImp)
                            .addComponent(txtLugarImp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumPag)
                            .addComponent(txtNumPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdioma)
                            .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecio)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPesos))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEjempDisp)
                            .addComponent(txtEjempDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(283, 283, 283))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresa)
                        .addGap(240, 240, 240))))
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
        new  ConsultaLib().setVisible(true);
    }//GEN-LAST:event_btnRegresaActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtISBN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISBN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBN1ActionPerformed

    private void txtEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialActionPerformed

    private void txtAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutoresActionPerformed

    private void txtLugarImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarImpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarImpActionPerformed

    private void txtNumPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumPagActionPerformed

    private void txtIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdiomaActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtEjempDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEjempDispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEjempDispActionPerformed

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
           // java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InfoLib().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCerrarSesion;
    private javax.swing.JToggleButton btnRegresa;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutores;
    private javax.swing.JLabel lblCargo1;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblEjempDisp;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblInfoDeLibro;
    private javax.swing.JLabel lblLugarImp;
    private javax.swing.JLabel lblNombreUser;
    private javax.swing.JLabel lblNumPag;
    private javax.swing.JLabel lblPesos;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAutores;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEjempDisp;
    private javax.swing.JTextField txtISBN1;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtLugarImp;
    private javax.swing.JTextField txtNumPag;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
