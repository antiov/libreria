package VistaApp;

//import VistaApp.Inicio;
import ControladoresBD.DAO_libro;
import ControladoresBD.DAO_usuario;
import Modelo.modeloLibro;
import Modelo.modeloUsuario;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

public class ConsultaLib extends javax.swing.JFrame implements Runnable{
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
    public ConsultaLib() {
        initComponents();
        h1 = new Thread(this);
        h1.start();
        super.setLocationRelativeTo(null);
        lblNombreUser.setText("admin");
        lblCargo1.setText("dueño");
        cmbOpciones.setEnabled(true);
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
        btnRegresa = new javax.swing.JToggleButton();
        btnCerrarSesion = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        cmbOpciones = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtParam = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JToggleButton();
        btnLimpiarLibro = new javax.swing.JToggleButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de libros");
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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Elija parámetros de búsqueda:");

        cmbOpciones.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        cmbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "isbn", "titulo", "autores", "editorial" }));
        cmbOpciones.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Ingrese parámetro:");

        txtParam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParamActionPerformed(evt);
            }
        });
        txtParam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtParamKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtParamKeyTyped(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultar.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnLimpiarLibro.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarLibro.setFont(new java.awt.Font("Cambria Math", 1, 13)); // NOI18N
        btnLimpiarLibro.setText("LIMPIAR");
        btnLimpiarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarLibroActionPerformed(evt);
            }
        });

        lblResult.setForeground(new java.awt.Color(255, 0, 0));
        lblResult.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombreUser)
                        .addGap(119, 119, 119)
                        .addComponent(lblFechaHora))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCargo1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addGap(140, 140, 140))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresa)
                .addGap(215, 215, 215))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(cmbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtParam, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(lblResult)))
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
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblCargo1))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(lblResult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnLimpiarLibro))
                .addGap(38, 38, 38)
                .addComponent(btnRegresa)
                .addGap(276, 276, 276))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarLibroActionPerformed
        txtParam.setText("");
        txtParam.setEnabled(true);
        txtParam.setEditable(true);
        btnConsultar.setEnabled(true);
        //tablaT= new DefaultTableModel(encabezado,0);
        //tbLibro.setModel(tablaT);
        //i=0;
    }//GEN-LAST:event_btnLimpiarLibroActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        String row = cmbOpciones.getSelectedItem().toString();
        String param = txtParam.getText();
        try
        {
        DAO_libro alib = new DAO_libro();
        /////////////////////////////////
         String dat1 = " "; 
         modeloLibro mLib = new modeloLibro();
          List<modeloLibro> c = alib.buscaLibros(row, param);
              Iterator iteraC = c.iterator();
             
            if(!c.isEmpty())
            {
                while (iteraC.hasNext()) 
                { 
                  Object[] tuple = (Object[])iteraC.next();
               //   mLib = (modeloLibro)iteraC.next();
                   mLib.setIsbn((String)tuple[0]);
                   mLib.setTitulo((String)tuple[1]);
                   mLib.setAutores((String)tuple[2]);
                   mLib.setEditorial((String)tuple[3]);
                   mLib.setLugar_impresion((String)tuple[4]);
                   mLib.setNum_pag(Integer.parseUnsignedInt(tuple[5].toString()));
                   mLib.setIdioma((String)tuple[6]);
                   mLib.setPrecio(Integer.parseUnsignedInt(tuple[7].toString()));
                   mLib.setEjemplares_disponibles(Integer.parseUnsignedInt(tuple[8].toString()));
                  dat1 += tuple[0] + " " + (String)tuple[1] + " " +  (String)tuple[2]  + " " + (String)tuple[3] + " " +  (String)tuple[4] + "\n";
                }
            }
            else
            {
                System.out.println("La busqueda no obtuvo resultados");
            }
        ////////////////////////////////
        this.dispose();
        
        this.hide();
        new InfoLib(mLib).setVisible(true);
        }
         catch(Exception ex)
        {
            System.out.println("Error query " + ex.getMessage());
            //lblResult.setText("No se encuentra el libro");
        }
       
        
        
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtParamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParamKeyTyped
        /*if(rbnIsbn.isSelected())
        {
            validarNum(evt);
            if(txtISBN.getText().length()>12)
            evt.consume();
        }*/
    }//GEN-LAST:event_txtParamKeyTyped

    private void txtParamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtParamKeyPressed

    }//GEN-LAST:event_txtParamKeyPressed

    private void txtParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParamActionPerformed
        //consultar();
    }//GEN-LAST:event_txtParamActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        this.hide();
        new Inicio().setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresaActionPerformed
        this.dispose();
        this.hide();
        new AdminLib().setVisible(true);
    }//GEN-LAST:event_btnRegresaActionPerformed

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
                new ConsultaLib().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCerrarSesion;
    private javax.swing.JToggleButton btnConsultar;
    private javax.swing.JToggleButton btnLimpiarLibro;
    private javax.swing.JToggleButton btnRegresa;
    private javax.swing.JComboBox<String> cmbOpciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo1;
    private javax.swing.JLabel lblFechaHora;
    private javax.swing.JLabel lblNombreUser;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtParam;
    // End of variables declaration//GEN-END:variables
}
