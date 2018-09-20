
package Servidor.UI;

import General.Reloj;
import Servidor.BackEnd.Server_socket;
import java.net.ConnectException;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

	public boolean mod_maestro;
	public int mod_hrs;
	public int mod_min;
	public int port = 8888;
	
	public Main() {
		initComponents();
	}
	
	public void setHora(int hrs, int min, int seg){
		label_hrs_maestro.setText(Integer.toString(hrs));
		label_min_maestro.setText(Integer.toString(min));
		label_seg_maestro.setText(Integer.toString(seg));
	}
	public void setHoraPrincipal(int hrs, int min, int seg){
		label_hrs_principal.setText(Integer.toString(hrs));
		label_min_principal.setText(Integer.toString(min));
		label_seg_principal.setText(Integer.toString(seg));
	}
	public void setHoraSecu1(int hrs,int min, int seg){
		label_hrs_secu1.setText(Integer.toString(hrs));
		label_min_secu1.setText(Integer.toString(min));
		label_seg_secu1.setText(Integer.toString(seg));
	}
	public void setHoraSecu2(int hrs,int min, int seg){
		label_hrs_secu2.setText(Integer.toString(hrs));
		label_min_secu2.setText(Integer.toString(min));
		label_seg_secu2.setText(Integer.toString(seg));
	}	

	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    label_hrs_maestro = new javax.swing.JLabel();
    label_min_maestro = new javax.swing.JLabel();
    label_seg_maestro = new javax.swing.JLabel();
    txtfield_hrs = new javax.swing.JTextField();
    button_modificar = new javax.swing.JButton();
    txtfield_min = new javax.swing.JTextField();
    button_enviar = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    label_hrs_principal = new javax.swing.JLabel();
    label_min_principal = new javax.swing.JLabel();
    label_seg_principal = new javax.swing.JLabel();
    label_seg_secu1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    label_hrs_secu1 = new javax.swing.JLabel();
    label_min_secu1 = new javax.swing.JLabel();
    label_seg_secu2 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    label_hrs_secu2 = new javax.swing.JLabel();
    label_min_secu2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Reloj Maestro");

    label_hrs_maestro.setText("hrs");

    label_min_maestro.setText("min");

    label_seg_maestro.setText("seg");

    txtfield_hrs.setText("hrs");

    button_modificar.setText("Modificar");
    button_modificar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        button_modificarActionPerformed(evt);
      }
    });

    txtfield_min.setText("min");

    button_enviar.setText("Enviar");
    button_enviar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        button_enviarActionPerformed(evt);
      }
    });

    jLabel2.setText("Reloj Principal");

    label_hrs_principal.setText("hrs");

    label_min_principal.setText("min");

    label_seg_principal.setText("seg");

    label_seg_secu1.setText("seg");

    jLabel3.setText("Reloj Secundario 1");

    label_hrs_secu1.setText("hrs");

    label_min_secu1.setText("min");

    label_seg_secu2.setText("seg");

    jLabel4.setText("Reloj Secundario 2");

    label_hrs_secu2.setText("hrs");

    label_min_secu2.setText("min");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_hrs_secu1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_min_secu1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_seg_secu1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(label_hrs_secu2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_min_secu2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_seg_secu2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4))))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(label_hrs_maestro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addComponent(label_min_maestro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(txtfield_hrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(button_enviar)
                      .addComponent(txtfield_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(label_seg_maestro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(button_modificar))))
              .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel2))
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(label_hrs_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addComponent(label_min_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)
                    .addComponent(label_seg_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(36, 36, 36)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(label_hrs_maestro)
          .addComponent(label_min_maestro)
          .addComponent(label_seg_maestro))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtfield_hrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(button_modificar)
          .addComponent(txtfield_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(button_enviar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel2)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(label_hrs_principal)
              .addComponent(label_min_principal)
              .addComponent(label_seg_principal))
            .addGap(27, 27, 27)
            .addComponent(jLabel3)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(label_hrs_secu1)
              .addComponent(label_min_secu1)
              .addComponent(label_seg_secu1)))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(label_hrs_secu2)
              .addComponent(label_min_secu2)
              .addComponent(label_seg_secu2))))
        .addContainerGap(41, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void button_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modificarActionPerformed
	try{
		mod_hrs = Integer.parseInt(txtfield_hrs.getText());
		mod_min = Integer.parseInt(txtfield_min.getText());
	
		if(mod_hrs>=24 || mod_hrs<0)
			JOptionPane.showMessageDialog(null, "Número de horas no válido reloj 1");
		else if(mod_min>=60 || mod_min<0)
			JOptionPane.showMessageDialog(null, "Número de minutos no válido reloj 1");
		else
			mod_maestro = true;
		
		try{Thread.currentThread().sleep(1000);}catch(InterruptedException ie){;}
		mod_maestro = false;
	}catch(NumberFormatException nfe){
		JOptionPane.showMessageDialog(null, "Escribe números para editar el reloj 1");
	}
  }//GEN-LAST:event_button_modificarActionPerformed

  private void button_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_enviarActionPerformed
		int pto = port;
		
		Reloj r = new Reloj(Integer.parseInt(label_hrs_principal.getText()),Integer.parseInt(label_min_principal.getText()),Integer.parseInt(label_seg_principal.getText()),1000);
		Server_socket ss = new Server_socket(pto++,"localhost",r);
		ss.start();
		
		Reloj r1 = new Reloj(Integer.parseInt(label_hrs_secu1.getText()),Integer.parseInt(label_min_secu1.getText()),Integer.parseInt(label_seg_secu1.getText()),1000);
		Server_socket ss1 = new Server_socket(pto++,"localhost",r1);
		ss1.start();
		
		Reloj r2 = new Reloj(Integer.parseInt(label_hrs_secu2.getText()),Integer.parseInt(label_min_secu2.getText()),Integer.parseInt(label_seg_secu2.getText()),1000);
		Server_socket ss2 = new Server_socket(pto,"localhost",r2);
		ss2.start();
		
  }//GEN-LAST:event_button_enviarActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton button_enviar;
  private javax.swing.JButton button_modificar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel label_hrs_maestro;
  private javax.swing.JLabel label_hrs_principal;
  private javax.swing.JLabel label_hrs_secu1;
  private javax.swing.JLabel label_hrs_secu2;
  private javax.swing.JLabel label_min_maestro;
  private javax.swing.JLabel label_min_principal;
  private javax.swing.JLabel label_min_secu1;
  private javax.swing.JLabel label_min_secu2;
  private javax.swing.JLabel label_seg_maestro;
  private javax.swing.JLabel label_seg_principal;
  private javax.swing.JLabel label_seg_secu1;
  private javax.swing.JLabel label_seg_secu2;
  private javax.swing.JTextField txtfield_hrs;
  private javax.swing.JTextField txtfield_min;
  // End of variables declaration//GEN-END:variables
}
