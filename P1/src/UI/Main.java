
package UI;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

	public boolean mod_r1;
	public int hrs_mod_r1;
	public int min_mod_r1;
	public int seg_mod_r1;
	
	public boolean mod_r2;
	public int hrs_mod_r2;
	public int min_mod_r2;
	public int seg_mod_r2;
	
	public boolean mod_r3;
	public int hrs_mod_r3;
	public int min_mod_r3;
	public int seg_mod_r3;
	
	public boolean mod_r4;
	public int hrs_mod_r4;
	public int min_mod_r4;
	public int seg_mod_r4;
	
	public Main() {
		mod_r1 = false;
		initComponents();
	}
	
	public void setHrsR1(int hrs){
		label_hrs_r1.setText(Integer.toString(hrs)+":");
	}
	public void setMinR1(int min){
		label_min_r1.setText(Integer.toString(min)+":");
	}
	public void setSegR1(int seg){
		label_seg_r1.setText(Integer.toString(seg));
	}
	
	public void setHrsR2(int hrs){
		label_hrs_r2.setText(Integer.toString(hrs)+":");
	}
	public void setMinR2(int min){
		label_min_r2.setText(Integer.toString(min)+":");
	}
	public void setSegR2(int seg){
		label_seg_r2.setText(Integer.toString(seg));
	}
	
	public void setHrsR3(int hrs){
		label_hrs_r3.setText(Integer.toString(hrs)+":");
	}
	public void setMinR3(int min){
		label_min_r3.setText(Integer.toString(min)+":");
	}
	public void setSegR3(int seg){
		label_seg_r3.setText(Integer.toString(seg));
	}
	
	public void setHrsR4(int hrs){
		label_hrs_r4.setText(Integer.toString(hrs)+":");
	}
	public void setMinR4(int min){
		label_min_r4.setText(Integer.toString(min)+":");
	}
	public void setSegR4(int seg){
		label_seg_r4.setText(Integer.toString(seg));
	}

	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    label_hrs_r1 = new javax.swing.JLabel();
    label_min_r1 = new javax.swing.JLabel();
    label_seg_r1 = new javax.swing.JLabel();
    txtfield_hrs_r1 = new javax.swing.JTextField();
    txtfield_min_r1 = new javax.swing.JTextField();
    jButton_mod_r1 = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    label_hrs_r2 = new javax.swing.JLabel();
    label_min_r2 = new javax.swing.JLabel();
    label_seg_r2 = new javax.swing.JLabel();
    jButton_mod_r2 = new javax.swing.JButton();
    txtfield_hrs_r2 = new javax.swing.JTextField();
    txtfield_min_r2 = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    label_hrs_r3 = new javax.swing.JLabel();
    label_min_r3 = new javax.swing.JLabel();
    label_seg_r3 = new javax.swing.JLabel();
    txtfield_hrs_r3 = new javax.swing.JTextField();
    txtfield_min_r3 = new javax.swing.JTextField();
    jButton_mod_r3 = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    label_hrs_r4 = new javax.swing.JLabel();
    label_min_r4 = new javax.swing.JLabel();
    label_seg_r4 = new javax.swing.JLabel();
    jButton_mod_r4 = new javax.swing.JButton();
    txtfield_hrs_r4 = new javax.swing.JTextField();
    txtfield_min_r4 = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Reloj 1");

    label_hrs_r1.setText("hrs");

    label_min_r1.setText("min");

    label_seg_r1.setText("seg");

    txtfield_hrs_r1.setText("hrs");

    txtfield_min_r1.setText("min");

    jButton_mod_r1.setText("Modificar");
    jButton_mod_r1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton_mod_r1ActionPerformed(evt);
      }
    });

    jLabel2.setText("Reloj 2");

    label_hrs_r2.setText("hrs");

    label_min_r2.setText("min");

    label_seg_r2.setText("seg");

    jButton_mod_r2.setText("Modificar");
    jButton_mod_r2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton_mod_r2ActionPerformed(evt);
      }
    });

    txtfield_hrs_r2.setText("hrs");

    txtfield_min_r2.setText("min");

    jLabel3.setText("Reloj 3");

    label_hrs_r3.setText("hrs");

    label_min_r3.setText("min");

    label_seg_r3.setText("seg");

    txtfield_hrs_r3.setText("hrs");

    txtfield_min_r3.setText("min");

    jButton_mod_r3.setText("Modificar");
    jButton_mod_r3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton_mod_r3ActionPerformed(evt);
      }
    });

    jLabel4.setText("Reloj 4");

    label_hrs_r4.setText("hrs");

    label_min_r4.setText("min");

    label_seg_r4.setText("seg");

    jButton_mod_r4.setText("Modificar");
    jButton_mod_r4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton_mod_r4ActionPerformed(evt);
      }
    });

    txtfield_hrs_r4.setText("hrs");

    txtfield_min_r4.setText("min");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(38, 38, 38)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(label_min_r2))
          .addComponent(jLabel2))
        .addGap(18, 18, 18)
        .addComponent(label_seg_r2)
        .addGap(21, 21, 21))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(label_hrs_r1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtfield_hrs_r1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(label_min_r1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(txtfield_min_r1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(label_seg_r1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label_hrs_r2)
            .addGap(114, 114, 114))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButton_mod_r1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtfield_hrs_r2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtfield_min_r2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton_mod_r2))))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel3)
              .addGroup(layout.createSequentialGroup()
                .addComponent(label_hrs_r3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_min_r3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(label_seg_r3))
          .addGroup(layout.createSequentialGroup()
            .addComponent(txtfield_hrs_r3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(txtfield_min_r3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jButton_mod_r3)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(label_min_r4))
              .addComponent(jLabel4))
            .addGap(18, 18, 18)
            .addComponent(label_seg_r4)
            .addGap(21, 21, 21))
          .addGroup(layout.createSequentialGroup()
            .addGap(3, 3, 3)
            .addComponent(label_hrs_r4))
          .addGroup(layout.createSequentialGroup()
            .addComponent(txtfield_hrs_r4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtfield_min_r4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton_mod_r4)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(jLabel2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(label_hrs_r1)
          .addComponent(label_min_r1)
          .addComponent(label_seg_r1)
          .addComponent(label_hrs_r2)
          .addComponent(label_min_r2)
          .addComponent(label_seg_r2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtfield_hrs_r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtfield_min_r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton_mod_r1)
          .addComponent(jButton_mod_r2)
          .addComponent(txtfield_hrs_r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtfield_min_r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(45, 45, 45)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(label_hrs_r3)
              .addComponent(label_min_r3)
              .addComponent(label_seg_r3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtfield_hrs_r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtfield_min_r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButton_mod_r3)))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(label_hrs_r4)
              .addComponent(label_min_r4)
              .addComponent(label_seg_r4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jButton_mod_r4)
              .addComponent(txtfield_hrs_r4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtfield_min_r4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(52, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton_mod_r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mod_r1ActionPerformed
	try{
		hrs_mod_r1 = Integer.parseInt(txtfield_hrs_r1.getText());
		min_mod_r1 = Integer.parseInt(txtfield_min_r1.getText());
	
		if(hrs_mod_r1>=24 || hrs_mod_r1<0)
			JOptionPane.showMessageDialog(null, "Número de horas no válido reloj 1");
		else if(min_mod_r1>=60 || min_mod_r1<0)
			JOptionPane.showMessageDialog(null, "Número de minutos no válido reloj 1");
		else
			mod_r1 = true;
		
		try{Thread.currentThread().sleep(1000);}catch(InterruptedException ie){ie.printStackTrace();}
		mod_r1 = false;
	}catch(NumberFormatException nfe){
		JOptionPane.showMessageDialog(null, "Escribe números para editar el reloj 1");
	}
  }//GEN-LAST:event_jButton_mod_r1ActionPerformed

  private void jButton_mod_r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mod_r2ActionPerformed
	try{
		hrs_mod_r2 = Integer.parseInt(txtfield_hrs_r2.getText());
		min_mod_r2 = Integer.parseInt(txtfield_min_r2.getText());
	
		if(hrs_mod_r2>=24 || hrs_mod_r2<0)
			JOptionPane.showMessageDialog(null, "Número de horas no válido reloj 2");
		else if(min_mod_r2>=60 || min_mod_r2<0)
			JOptionPane.showMessageDialog(null, "Número de minutos no válido reloj 2");
		else
			mod_r2 = true;
		
		try{Thread.currentThread().sleep(1000);}catch(InterruptedException ie){ie.printStackTrace();}
		mod_r2 = false;
	}catch(NumberFormatException nfe){
		JOptionPane.showMessageDialog(null, "Escribe números para editar el reloj 2");
	}
  }//GEN-LAST:event_jButton_mod_r2ActionPerformed

  private void jButton_mod_r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mod_r3ActionPerformed
	try{
		 hrs_mod_r3 = Integer.parseInt(txtfield_hrs_r3.getText());
		 min_mod_r3 = Integer.parseInt(txtfield_min_r3.getText());

		 if(hrs_mod_r3>=24 || hrs_mod_r3<0)
			 JOptionPane.showMessageDialog(null, "Número de horas no válido reloj 3");
		 else if(min_mod_r3>=60 || min_mod_r3<0)
			 JOptionPane.showMessageDialog(null, "Número de minutos no válido reloj 3");
		 else
			 mod_r3 = true;

		 try{Thread.currentThread().sleep(1000);}catch(InterruptedException ie){ie.printStackTrace();}
		 mod_r3 = false;
	 }catch(NumberFormatException nfe){
		 JOptionPane.showMessageDialog(null, "Escribe números para editar el reloj 3");
	 }
  }//GEN-LAST:event_jButton_mod_r3ActionPerformed

  private void jButton_mod_r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mod_r4ActionPerformed
	try{
		 hrs_mod_r4 = Integer.parseInt(txtfield_hrs_r4.getText());
		 min_mod_r4 = Integer.parseInt(txtfield_min_r4.getText());

		 if(hrs_mod_r4>=24 || hrs_mod_r4<0)
			 JOptionPane.showMessageDialog(null, "Número de horas no válido reloj 4");
		 else if(min_mod_r4>=60 || min_mod_r4<0)
			 JOptionPane.showMessageDialog(null, "Número de minutos no válido reloj 4");
		 else
			 mod_r4 = true;

		 try{Thread.currentThread().sleep(1000);}catch(InterruptedException ie){ie.printStackTrace();}
		 mod_r4 = false;
	 }catch(NumberFormatException nfe){
		 JOptionPane.showMessageDialog(null, "Escribe números para editar el reloj 4");
	 }
  }//GEN-LAST:event_jButton_mod_r4ActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton_mod_r1;
  private javax.swing.JButton jButton_mod_r2;
  private javax.swing.JButton jButton_mod_r3;
  private javax.swing.JButton jButton_mod_r4;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel label_hrs_r1;
  private javax.swing.JLabel label_hrs_r2;
  private javax.swing.JLabel label_hrs_r3;
  private javax.swing.JLabel label_hrs_r4;
  private javax.swing.JLabel label_min_r1;
  private javax.swing.JLabel label_min_r2;
  private javax.swing.JLabel label_min_r3;
  private javax.swing.JLabel label_min_r4;
  private javax.swing.JLabel label_seg_r1;
  private javax.swing.JLabel label_seg_r2;
  private javax.swing.JLabel label_seg_r3;
  private javax.swing.JLabel label_seg_r4;
  private javax.swing.JTextField txtfield_hrs_r1;
  private javax.swing.JTextField txtfield_hrs_r2;
  private javax.swing.JTextField txtfield_hrs_r3;
  private javax.swing.JTextField txtfield_hrs_r4;
  private javax.swing.JTextField txtfield_min_r1;
  private javax.swing.JTextField txtfield_min_r2;
  private javax.swing.JTextField txtfield_min_r3;
  private javax.swing.JTextField txtfield_min_r4;
  // End of variables declaration//GEN-END:variables
}
