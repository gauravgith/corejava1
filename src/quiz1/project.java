package quiz1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrator
 */


        import javax.swing.*;
import java.awt.event.*;



class loginform extends JFrame implements ActionListener{

    

    JButton b;
    JPanel newPanel;
    JLabel  l1,l2;
     JTextField text1;
    final JPasswordField value1;
    
    
        //create a constuctor
        public loginform()
        {
                   
       
        final JLabel label = new JLabel();
        label.setBounds(20,150,200,50);//output label
        
       value1 = new JPasswordField();
        value1.setBounds(100,75,100,30);//textbox of password
        
        JLabel l1 = new JLabel("username");
        l1.setBounds(20,20,80,30);//label of username
        
        JLabel l2 = new JLabel("Password");
        l2.setBounds(20,75,80,30);//label of Password
        
        JButton b = new JButton("Login");
        b.setBounds(100,120,80,30); //button
         b.addActionListener(this);
        
        
         text1 = new JTextField();
        text1.setBounds(100,20,100,30);//username textbox
        
        add(value1);
        add(l1);
        add(label);
        add(l2);
        add(b);
        add(text1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
       setSize(300,300);
        setLayout(null);
        setVisible(true);
       
        }
    
        public void actionPerformed(ActionEvent ae)
        {
            String userValue = text1.getText();
            String passValue = value1.getText();
            
          
             //check credentials
          
             if(userValue.equals("admin")&& passValue.equals("demo"))
            {
            //create a instance of NewPage
                Form_Menu page = new Form_Menu();
                
                //make page visible to user                
                page.setVisible(true);
                
                //create welcome label and send to new page
                JLabel wel_label= new JLabel("Welcome:"+userValue);
                page.getContentPane().add(wel_label);
            
            }
            else{
            
                //show error msg
                System.out.println("Please enter valid username & password");
            }
            
        }
        
        }
        

public class project{
    public static void main(String[] args) {
        
        try{
        
            //create instance of loginform
            loginform form1 = new loginform();
            form1.setSize(600,600);
            form1.setVisible(true);
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
        
    }
}
        
  
        
    
    

