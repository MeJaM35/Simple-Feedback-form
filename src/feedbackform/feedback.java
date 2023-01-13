/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feedbackform;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.sql.*;

/**
 *
 * @author MJ
 */
public class feedback extends JFrame implements ActionListener {
    
    JTextField deptt, divt, subt;
    JComboBox yeart, typet;
    JTextArea revt;
    String[] years = {"FE", "SE", "DSE", "TE", "BE"};
    String[] types = {"Event", "Lecture", "Project", "Exam"};
    
    feedback(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        Font heading = new Font("Default", Font.BOLD, 60);
        //Font subheading = new Font("Default", Font.BOLD, 40);
        Font lbls = new Font("Default", Font.BOLD, 20);
    
        JLabel h1 = new JLabel("Feedback Form");
        h1.setBounds(80, 30, 1200, 60);
        h1.setFont(heading);
        add(h1);
        
        
        JLabel deptl = new JLabel("Department:");
        deptl.setBounds(80, 140, 1200, 60);
        deptl.setFont(lbls);
        add(deptl);
        
        JLabel yearl = new JLabel("Year:");
        yearl.setBounds(80, 200, 1200, 60);
        yearl.setFont(lbls);
        add(yearl);
        
        JLabel divl = new JLabel("Division:");
        divl.setBounds(80, 260, 1200, 60);
        divl.setFont(lbls);
        add(divl);
        
        JLabel subl = new JLabel("Subject");
        subl.setBounds(80, 320, 1200, 60);
        subl.setFont(lbls);
        add(subl);

        JLabel tchrl = new JLabel("Review Type:");
        tchrl.setBounds(80, 380, 1200, 60);
        tchrl.setFont(lbls);
        add(tchrl);
        
        JLabel revl = new JLabel("Review:");
        revl.setBounds(80, 440, 1200, 60);
        revl.setFont(lbls);
        add(revl);
        
            deptt = new JTextField("Data Science");
        deptt.setBounds(280, 140, 350, 60);
        deptt.setFont(lbls);
        add(deptt);
        
        yeart = new JComboBox(years);
        yeart.setBounds(280, 200, 350, 60);
        yeart.setFont(lbls);
        add(yeart);
        
        divt = new JTextField("Data Structures");
        divt.setBounds(280, 320, 350, 60);
        divt.setFont(lbls);
        add(divt);
        
        subt = new JTextField("C");
        subt.setBounds(280, 260, 350, 60);
        subt.setFont(lbls);
        add(subt);

        typet = new JComboBox(types);
        typet.setBounds(280, 380, 350, 60);
        typet.setFont(lbls);
        add(typet);
        
        revt = new JTextArea("This is a review");
        revt.setBounds(280, 440, 350, 60);
        revt.setFont(lbls);
        add(revt);
        
        JButton btn1 = new JButton("Submit");
        btn1.setBounds(280, 550, 150, 50);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        btn1.addActionListener(this);
        add(btn1);
        
        
        
        
        setSize(700, 700);
        setLocation(500, 500);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {

        try{
            
            new landing();
            setVisible(false);
            

            String dept = deptt.getText();
            String year = (String) yeart.getSelectedItem();
            String subject = subt.getText();
            String div = divt.getText();
            String type = (String) typet.getSelectedItem();
            String review = revt.getText();
            
            

            String query = "insert into feedback values('"+ dept + "' , '" + year + "' , '" + subject + "' , '" + type + "' , '" +review+ "' , '" + div +  "');" ;
            
            conn c = new conn();

            c.s.executeUpdate(query);
            
            


        }catch(Exception e){

            e.printStackTrace();


        }
    }
    
    public static void main(String args[]){
        
        new feedback();
    }
    
}
