/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author SUJATA
 */
public class load1 extends javax.swing.JFrame {

    /**
     * Creates new form load1
     */
    public load1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loading = new javax.swing.JProgressBar();
        loadinglabel = new javax.swing.JLabel();
        loadingvalue = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1046, 594));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1046, 594));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 960, -1));

        loadinglabel.setForeground(new java.awt.Color(255, 255, 255));
        loadinglabel.setText("Loading.....");
        jPanel1.add(loadinglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        loadingvalue.setBackground(new java.awt.Color(0, 0, 0));
        loadingvalue.setForeground(new java.awt.Color(255, 255, 255));
        loadingvalue.setText("1%");
        jPanel1.add(loadingvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/neo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(load1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(load1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(load1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(load1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        load1 a=new load1();
        a.setVisible(true);

        try {
                    for(int i=0;i<=100;i++){
                        Thread.sleep(50);
                        a.loadingvalue.setText(i +"%");
                        a.loading.setValue(i);
                        if(i==10){
                            a.loadinglabel.setText("Turning On Modules...");
                        }
                        if(i==20){
                            a.loadinglabel.setText("Loading Modules...");
                        }
                        if(i==50){
                            a.loadinglabel.setText("Connecting To Database...");
                        }
                        if(i==70){
                            a.loadinglabel.setText("Connection Successful...");
                        }
                        if(i==80){
                            a.loadinglabel.setText("Launching Application...");
                        }
                }
                }
        catch(Exception e){}
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                Login_page1 ddd = new Login_page1();
                
                ddd.setVisible(true);
                a.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar loading;
    private javax.swing.JLabel loadinglabel;
    private javax.swing.JTextField loadingvalue;
    // End of variables declaration//GEN-END:variables
}
