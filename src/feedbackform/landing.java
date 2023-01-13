/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feedbackform;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author MJ
 */
public class landing extends JFrame implements ActionListener {
    
    JButton admin, fbbtn;
    
    landing(){
        
        setLayout(null);
        Font h1 = new Font("Serif", Font.BOLD, 60);
        
        JLabel heading = new JLabel("FeedBack Form");
        heading.setBounds(180, 30, 1200, 60);
        heading.setFont(h1);
        add(heading);
        
        admin = new JButton("Login");
        admin.setBounds(300,100,200, 70);
        admin.setForeground(Color.BLACK);
        admin.setBackground(Color.WHITE);
        admin.addActionListener(this);
        add(admin);
        
        fbbtn = new JButton("Give Feedback");
        fbbtn.setBounds(300,180,200, 70);
        fbbtn.setForeground(Color.BLACK);
        fbbtn.setBackground(Color.WHITE);
        fbbtn.addActionListener(this);
        add(fbbtn);
        
        
        setSize(800, 350);
        setLocation(200, 50);
        setVisible(true);
    
    }
    
        public void actionPerformed(ActionEvent ae){
            
            setVisible(false);
            
            if(ae.getSource() == admin ){
                new login();
    
            }
            else{
            new feedback();
            }        
        }
    
    public static void main(String args[]){
    
        new landing();
    
    }
    
}
