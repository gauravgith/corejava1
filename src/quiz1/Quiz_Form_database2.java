/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import static quiz1.Form_Menu.subject1;

/**
 *
 * @author Administrator
 */
public class Quiz_Form_database2 extends javax.swing.JFrame {

    Connection con = null;
    int correct = 0;
    int counter = 1;
    PreparedStatement pst = null;
    ResultSet rs = null;
    ResultSet ra = null;
    Statement stmt = null;
    static int totalq = 0;
    ButtonGroup bg = new ButtonGroup();
    static String subject1;
    String option5 = null;
    static String num1=null;
    static int attempt=1;
    static int question_id_;
    static int user_id_;
    static String subject99;

    public Quiz_Form_database2() {
        initComponents();
        file5();
        file6();

    }
    
      public void file6(){
    
        try{
        
            File fe = new File("C:/Users/SUJATA/Documents/NetBeansProjects/NewPage/src/quiz1/user_id_file.txt");
            BufferedReader br = new BufferedReader(new FileReader(fe));
            String str3;
            while((str3 = br.readLine()) != null){
                String subject0 = str3;
                user_id_ = Integer.parseInt(subject0);
                
            }
            br.close();
        }
        catch(IOException | NumberFormatException er){
            System.out.println("ErrrrrO"+er.getMessage());
        }
    
    }
      public void file5(){
    
        try{
        
            File f1 = new File("C:/Users/SUJATA/Documents/NetBeansProjects/NewPage/src/quiz1/mylogin.txt");
            BufferedReader br = new BufferedReader(new FileReader(f1));
            String str;
            while((str = br.readLine()) != null){
                subject99 = str;
                
            }
            br.close();
            jLabel4.setText(subject99);
        }
        catch(Exception er){
            System.out.println("ErrrrrO"+er.getMessage());
        }
    
    }

    public void displayquestion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            countA();
            file2();
            
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345");
            stmt = (Statement) con.createStatement();
            ResultSet rs1 = (ResultSet) stmt.executeQuery("select * from question1 where subjectNo=" + counter + " and subject='" + subject1 + "';");

            rs1.next();
             question_id_ = rs1.getInt(1);   
            text1.setText(Integer.toString(question_id_));
            
            text3.setText(rs1.getString(3));
            opt1.setText(rs1.getString(4));
            opt2.setText(rs1.getString(5));
            opt3.setText(rs1.getString(6));
            opt4.setText(rs1.getString(7));
            

            con.close();

        } catch (ClassNotFoundException | SQLException e1) {
            System.out.println("Error" + e1.getMessage());

        }

    }

    public void countA() {
        int number = 0;
        try {

            file2();
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345");
            Statement stmtt = (Statement) con.createStatement();

            ResultSet rs1 = (ResultSet) stmtt.executeQuery("SELECT COUNT(questions) from question1 where subject='" + subject1 + "' group by subject ;");
            rs1.next();
            number = rs1.getInt(1);

            con.close();

        } catch (NumberFormatException | SQLException ww) {

            System.out.println("error" + ww.getMessage());
        }

        totalq = number;
    }

    public void file2() {

        try {
            File fl = new File("C:/Users/SUJATA/Documents/NetBeansProjects/NewPage/src/quiz1/myfile.txt");
            BufferedReader br = new BufferedReader(new FileReader(fl));
            String str;
            while ((str = br.readLine()) != null) {
                subject1 = str;
            }
            br.close();
            l1.setText(subject1);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //update method 
    public void getSelectedOption(JRadioButton rbtn) throws SQLException, ClassNotFoundException {
        //get the value from the radiobutton
        //increment the index
        //disable the radiobuttons
        //check if the user selected the rigtht answer
        //need to add counter in response

       
        if (opt1.isSelected()) {
            option5 = "opt1";
        } else if (opt2.isSelected()) {
            option5 = "opt2";
        } else if (opt3.isSelected()) {
            option5 = "opt3";
        } else if (opt4.isSelected()) {
            option5 = "opt4";
        } else {
            JOptionPane.showMessageDialog(this, "Select and Option");
        }
        
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "12345");
            Statement stmt2 = (Statement) con2.createStatement();
            System.out.println(rbtn.getText());

            ResultSet rs1 = (ResultSet) stmt2.executeQuery("select answer from question1 where subjectNo=" + counter + " and subject='" + subject1 + "';");

            rs1.next();
               num1 = rs1.getString(1);        
            if (option5.equals(num1)) 
            {
                correct++;
            }
            System.out.println("User Option"+option5);
            System.out.println("Database option"+num1);
            System.out.println("Correct Counter"+correct);
            System.out.println("Number of attempt"+attempt);
            counter++;
           // enableRbuttons(false);

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error 177" + ex.getMessage());
            System.out.println(correct);
        }
    }

    public void enableRbuttons(boolean yes_or_no) {
        opt1.setEnabled(yes_or_no);
        opt2.setEnabled(yes_or_no);
        opt3.setEnabled(yes_or_no);
        opt4.setEnabled(yes_or_no);

        //clear the selection
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        opt3 = new javax.swing.JRadioButton();
        opt4 = new javax.swing.JRadioButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        text1.setForeground(new java.awt.Color(204, 255, 51));
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("Q.No");
        jPanel1.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 112, -1, 50));

        text3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        text3.setForeground(new java.awt.Color(204, 255, 51));
        text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text3.setText("Question's ???");
        jPanel1.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 112, 671, 50));

        buttonGroup1.add(opt1);
        opt1.setForeground(new java.awt.Color(204, 255, 51));
        opt1.setToolTipText("");
        opt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt1ActionPerformed(evt);
            }
        });
        jPanel1.add(opt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 212, -1, -1));

        buttonGroup1.add(opt2);
        opt2.setForeground(new java.awt.Color(204, 255, 51));
        opt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt2ActionPerformed(evt);
            }
        });
        jPanel1.add(opt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 285, -1, -1));

        buttonGroup1.add(opt3);
        opt3.setForeground(new java.awt.Color(204, 255, 51));
        opt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt3ActionPerformed(evt);
            }
        });
        jPanel1.add(opt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 212, -1, -1));

        buttonGroup1.add(opt4);
        opt4.setForeground(new java.awt.Color(204, 255, 51));
        opt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt4ActionPerformed(evt);
            }
        });
        jPanel1.add(opt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 285, -1, -1));

        btn1.setBackground(new java.awt.Color(255, 204, 0));
        btn1.setText("submit1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 398, 127, 51));

        btn2.setBackground(new java.awt.Color(255, 204, 0));
        btn2.setText("Next");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 400, 143, 46));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 51));
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, 49));

        l1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(204, 255, 51));
        l1.setText("s");
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 140, 30));

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setText("Start ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 400, 115, 46));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("u");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 160, 45));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 51));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 29));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 51));
        jLabel2.setText("Quiz Of Subject:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 24, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt1ActionPerformed
        try {
            getSelectedOption(opt1);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Quiz_Form_database2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opt1ActionPerformed

    private void opt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt2ActionPerformed
        try {
            getSelectedOption(opt2);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Quiz_Form_database2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opt2ActionPerformed

    private void opt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt3ActionPerformed
        try {
            getSelectedOption(opt3);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Quiz_Form_database2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opt3ActionPerformed

    private void opt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt4ActionPerformed
        try {
            getSelectedOption(opt4);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Quiz_Form_database2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_opt4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        int marks1=1;
        int marks0=0;
        
        try
        {
            
            Connection con4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345");
            PreparedStatement psg = con4.prepareStatement("insert into response(user_id,question1_id,response_user_ans,ANS,marks,subject,subjectNo,attempt)values(?,?,?,?,?,?,?,?);");
            
            psg.setInt(1, user_id_);
            psg.setInt(2,question_id_);
            psg.setString(3,option5 );
            psg.setString(4, num1);
            
            if(option5.equals(num1))
            { 
            psg.setInt(5, marks1);
            }
            else{
            psg.setInt(5, marks0);
            }
            
            psg.setString(6, subject1);
            psg.setInt(7,counter);
            psg.setInt(8,attempt);
            
            
            int row = psg.executeUpdate();
            if(row>0){
                System.out.println("Record Inserted");
            }
               
   
      
        
        }
        catch(SQLException r)
        {
            System.out.println("Record Not inserted "+r.getMessage());
        }
        
        
       buttonGroup1.clearSelection();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

       

            if (counter == totalq + 1) {
                attempt++;
                btn2.setText("end");
                JOptionPane.showMessageDialog(this,"Your Score is:"+correct+"/"+(counter-1));
                
                
            }
         
        
           

            if (btn2.getText().equals("end")) {

                total jj = new total();
                this.setVisible(false);
                jj.setVisible(true);
            }

            if (btn2.getText().equals("Next")) {
                displayquestion();
                                
            }

            
           
//        else 
//            {
//            rs3.last();
//            btn2.setText("Last");
//            
//            
//            }
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Form_Menu h = new Form_Menu();
        this.setVisible(false);
        h.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        displayquestion();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Quiz_Form_database2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form_database2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form_database2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz_Form_database2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Quiz_Form_database2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private javax.swing.JRadioButton opt3;
    private javax.swing.JRadioButton opt4;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text3;
    // End of variables declaration//GEN-END:variables

    private void btn1ActionPerformed(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
