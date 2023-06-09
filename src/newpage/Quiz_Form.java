/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpage;
import java.awt.*;
import javax.swing.*;


//this project to work we need JFRAME IN java 
/**
 *
 * @author Administrator
 */
public class Quiz_Form extends javax.swing.JFrame {

    String[] questions = {"2+3= ? ","3*3= ?"," 11+10= ?","55/11= ?","0*0= ?"};
    
    //create the array of options
    //the last item in array is the correct answer it is 5 in {"34","05","32","4","05"} 
    //we will check the selected from the user with the last item
    String[][] options = {{"34","5","32","4","5"},{"34","9","32","4","9"},
        {"34","05","21","4","21"},{"11","5","32","4","5"},{"0","9","21","4","0"}};
    int index = 0,correct = 0;
    
    ButtonGroup bg = new ButtonGroup();
    
    public Quiz_Form() {
        initComponents();
        
        bg.add(jRadioButton1_);
        bg.add(jRadioButton2_);
        bg.add(jRadioButton3_);
        bg.add(jRadioButton4_);
        
        
        jButton_Next_QActionPerformed(null);
    }
    
    public void getSelectedOption(JRadioButton rbtn)
    {
        //get the value from the radiobutton
        //increment the index
        //disable the radiobuttons
        //check if the user selected the rigtht answer
        
        System.out.println(rbtn.getText());
        System.out.println(options[index][4]);
        if(rbtn.getText().equals(options[index][4]))
        {
        
            correct++;
        }
        
        index++;
        enableRbuttons(false);
    }
    
    public void enableRbuttons(boolean yes_or_no)
    {
        jRadioButton1_.setEnabled(yes_or_no);
        jRadioButton2_.setEnabled(yes_or_no);
        jRadioButton3_.setEnabled(yes_or_no);
        jRadioButton4_.setEnabled(yes_or_no);
        
        //clear the selection
        
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
        jPanel_Q_Container = new javax.swing.JPanel();
        Lbl_Question = new javax.swing.JLabel();
        jRadioButton1_ = new javax.swing.JRadioButton();
        jRadioButton2_ = new javax.swing.JRadioButton();
        jRadioButton3_ = new javax.swing.JRadioButton();
        jRadioButton4_ = new javax.swing.JRadioButton();
        jButton_Next_Q = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jPanel_Q_Container.setBackground(new java.awt.Color(204, 204, 204));

        Lbl_Question.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Lbl_Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbl_Question.setText("Questions ???");
        Lbl_Question.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));

        javax.swing.GroupLayout jPanel_Q_ContainerLayout = new javax.swing.GroupLayout(jPanel_Q_Container);
        jPanel_Q_Container.setLayout(jPanel_Q_ContainerLayout);
        jPanel_Q_ContainerLayout.setHorizontalGroup(
            jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel_Q_ContainerLayout.setVerticalGroup(
            jPanel_Q_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Q_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbl_Question, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRadioButton1_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1_.setText("jRadioButton1");
        jRadioButton1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_ActionPerformed(evt);
            }
        });

        jRadioButton2_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2_.setText("jRadioButton2");
        jRadioButton2_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_ActionPerformed(evt);
            }
        });

        jRadioButton3_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton3_.setText("jRadioButton3");
        jRadioButton3_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3_ActionPerformed(evt);
            }
        });

        jRadioButton4_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton4_.setText("jRadioButton4");
        jRadioButton4_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_ActionPerformed(evt);
            }
        });

        jButton_Next_Q.setBackground(new java.awt.Color(153, 153, 0));
        jButton_Next_Q.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Next_Q.setText("Next");
        jButton_Next_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Next_QActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jPanel_Q_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton2_, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton4_, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1_, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton3_, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Q_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1_)
                    .addComponent(jRadioButton3_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2_, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4_))
                .addGap(50, 50, 50)
                .addComponent(jButton_Next_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Next_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Next_QActionPerformed

        if(jButton_Next_Q.getText().equals("Restart the quiz")) 
        {
        
            //restart the quiz
            index=0;
            correct=0;
            jButton_Next_Q.setText("Next");
        }
        
        if(index == questions.length)
        {
        
            //display the user score
            Lbl_Question.setText("Your Score: "+ correct+"/"+questions.length);
            if(correct >=(float) questions.length/2 )
            {
            jPanel_Q_Container.setBackground(Color.green);
            }
            else
            {
            jPanel_Q_Container.setBackground(Color.red);
            }
            jButton_Next_Q.setText("Restart the quiz");
            
        }
       
        else{
            
            
            enableRbuttons(true);
        
        //display the next question
        Lbl_Question.setText(questions[index]);
        jRadioButton1_.setText(options[index][0]);
        jRadioButton2_.setText(options[index][1]);
        jRadioButton3_.setText(options[index][2]);
        jRadioButton4_.setText(options[index][3]);
        
        if(index == questions.length)
        {
          jButton_Next_Q.setText("Finish and see the result");
        }
           
        }
        //clear the selection
        
        bg.clearSelection();
        
    }//GEN-LAST:event_jButton_Next_QActionPerformed

    private void jRadioButton1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_ActionPerformed
        // increment to go to next questions
        getSelectedOption(jRadioButton1_);
    }//GEN-LAST:event_jRadioButton1_ActionPerformed

    private void jRadioButton2_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jRadioButton2_);
    }//GEN-LAST:event_jRadioButton2_ActionPerformed

    private void jRadioButton3_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3_ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jRadioButton3_);
    }//GEN-LAST:event_jRadioButton3_ActionPerformed

    private void jRadioButton4_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4_ActionPerformed
        // TODO add your handling code here:
        getSelectedOption(jRadioButton4_);
    }//GEN-LAST:event_jRadioButton4_ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_Question;
    private javax.swing.JButton jButton_Next_Q;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Q_Container;
    private javax.swing.JRadioButton jRadioButton1_;
    private javax.swing.JRadioButton jRadioButton2_;
    private javax.swing.JRadioButton jRadioButton3_;
    private javax.swing.JRadioButton jRadioButton4_;
    // End of variables declaration//GEN-END:variables
}
