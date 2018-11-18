
package Client;

import General.Client_RMI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UI extends javax.swing.JFrame {
    
    ArrayList<String> dirs = new ArrayList<>();
    String dir;
    public UI() throws IOException {
        initComponents();
        leerIps();
    }
    
    public void leerIps() throws IOException{
        String cadena;
        FileReader f = new FileReader("ip.txt");
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            dirs.add(cadena);
        }
        b.close();
    }
    
    public void elegirip(){
        dir = dirs.get(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtField_user = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_pedirCarta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_pedirCarta.setText("Pedir Carta");
        btn_pedirCarta.setEnabled(false);
        btn_pedirCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedirCartaActionPerformed(evt);
            }
        });

        jLabel1.setText("Pide una carta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btn_pedirCarta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtField_user, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(btn_registrar)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar))
                .addGap(29, 29, 29)
                .addComponent(btn_pedirCarta)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        if(txtField_user.getText().length() != 0){
            
            elegirip();
            System.out.println(dir);
            Client_RMI crmi = new Client_RMI(dir,"Server");
            
            try {
                crmi.setConexion();
                crmi.regJugador(txtField_user.getText(), "192.168.0.1", txtField_user.getText(), 1);
            } catch (RemoteException | NotBoundException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            txtField_user.setEnabled(false);
            btn_registrar.setEnabled(false);
            btn_pedirCarta.setEnabled(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Pon algo en el txtField");
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_pedirCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedirCartaActionPerformed
        elegirip();
        System.out.println(dir);
        Client_RMI crmi = new Client_RMI(dir,"Server");
        try {
            crmi.setConexion();
            
            ArrayList<String> a = crmi.pedirCarta();
            int idcart = Integer.parseInt(a.get(0));
            String nombrecart = a.get(1);
            
            jLabel1.setText(nombrecart);
            
            Calendar calendario = Calendar.getInstance();
            int hrs_act =calendario.get(Calendar.HOUR_OF_DAY);
            int min_act = calendario.get(Calendar.MINUTE);
            int seg_act = calendario.get(Calendar.SECOND);

            String hora = hrs_act+":"+min_act+":"+seg_act;
            
            crmi.regTirada(hora, idcart, txtField_user.getText(), 1);
            
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_pedirCartaActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pedirCarta;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtField_user;
    // End of variables declaration//GEN-END:variables
}
