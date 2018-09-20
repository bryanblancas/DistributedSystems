
package Client.UI;

import Client.Back.SendRequest;
import General.Request;

public class UI extends javax.swing.JFrame {
	
	public UI() {
		initComponents();
	}
	
	public void setName(String name){
		label_name.setText(name);
	}
	
	public void setHora(int hrs, int min, int seg){
		label_hrs.setText(Integer.toString(hrs));
		label_min.setText(Integer.toString(min));
		label_seg.setText(Integer.toString(seg));
	}
	public void setInfo(String info){
		label_info.setText(info);
	}
	
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    label_name = new javax.swing.JLabel();
    label_hrs = new javax.swing.JLabel();
    label_min = new javax.swing.JLabel();
    label_seg = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    label_info = new javax.swing.JLabel();
    button_pedircarta = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    label_name.setText("jLabel1");

    label_hrs.setText("jLabel1");

    label_min.setText("jLabel1");

    label_seg.setText("jLabel1");

    jLabel1.setText("Información de Tirada:");

    label_info.setText("Información");

    button_pedircarta.setText("Pedir Carta");
    button_pedircarta.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        button_pedircartaActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(label_hrs)
            .addGap(18, 18, 18)
            .addComponent(label_min)
            .addGap(17, 17, 17)
            .addComponent(label_seg))
          .addGroup(layout.createSequentialGroup()
            .addComponent(label_name)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
        .addComponent(label_info)
        .addGap(80, 80, 80))
      .addGroup(layout.createSequentialGroup()
        .addGap(52, 52, 52)
        .addComponent(button_pedircarta)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(label_name)
        .addGap(38, 38, 38)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(label_info))
        .addGap(18, 18, 18)
        .addComponent(button_pedircarta)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(label_hrs)
          .addComponent(label_min)
          .addComponent(label_seg))
        .addGap(27, 27, 27))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void button_pedircartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_pedircartaActionPerformed
		String ip = label_hrs.getText()+":"+label_min.getText()+":"+label_seg.getText();
		Request rqs = new Request(2,label_name.getText(),ip,ip);
		SendRequest srqs = new SendRequest(8888,"127.0.0.1",this,rqs); //ip del servidor
		srqs.run();
  }//GEN-LAST:event_button_pedircartaActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton button_pedircarta;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel label_hrs;
  private javax.swing.JLabel label_info;
  private javax.swing.JLabel label_min;
  private javax.swing.JLabel label_name;
  private javax.swing.JLabel label_seg;
  // End of variables declaration//GEN-END:variables
}
