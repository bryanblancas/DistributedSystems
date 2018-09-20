
package Cliente.UI;

public class ui_cliente extends javax.swing.JFrame {
	
	public ui_cliente() {
		initComponents();
	}
	
	public void setHora(int hrs, int min, int seg){
		label_hrs.setText(Integer.toString(hrs));
		label_min.setText(Integer.toString(min));
		label_seg.setText(Integer.toString(seg));
	}

	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    label_hrs = new javax.swing.JLabel();
    label_min = new javax.swing.JLabel();
    label_seg = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("RELOJ");

    label_hrs.setText("HRS");

    label_min.setText("MIN");

    label_seg.setText("SEG");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addComponent(label_hrs)
            .addGap(60, 60, 60)
            .addComponent(label_min)
            .addGap(64, 64, 64)
            .addComponent(label_seg))
          .addGroup(layout.createSequentialGroup()
            .addGap(101, 101, 101)
            .addComponent(jLabel1)))
        .addContainerGap(47, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(jLabel1)
        .addGap(33, 33, 33)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(label_hrs)
          .addComponent(label_min)
          .addComponent(label_seg))
        .addContainerGap(27, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
	
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel label_hrs;
  private javax.swing.JLabel label_min;
  private javax.swing.JLabel label_seg;
  // End of variables declaration//GEN-END:variables
}
