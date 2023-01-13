/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package feedbackform;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MJ
 */
public class feedbacklist extends JFrame implements ActionListener {
    
    JButton landing, showdata;
    
    feedbacklist(){
        
        setLayout(null);
        Font h1 = new Font("Serif", Font.BOLD, 60);
        
        JLabel heading = new JLabel("FeedBack List");
        heading.setBounds(180, 30, 1200, 60);
        heading.setFont(h1);
        add(heading);
        
        landing = new JButton("Back");
        landing.setBounds(300,100,200, 70);
        landing.setForeground(Color.BLACK);
        landing.setBackground(Color.WHITE);
        landing.addActionListener(this);
        add(landing);
        
        showdata = new JButton("Show Data");
        showdata.setBounds(300,150,200, 70);
        showdata.setForeground(Color.BLACK);
        showdata.setBackground(Color.WHITE);
        showdata.addActionListener(this);
        add(showdata);
        
        
        
        
        setSize(800, 1000);
        setLocation(200, 50);
        setVisible(true);
    
    }
    
        public void actionPerformed(ActionEvent ae){
            
           
            String column[]= {"Department", "Year", "Division", "Subject", "Review"};
            DefaultTableModel tableModel = new DefaultTableModel(column, 0);
            
            
            try{
            
            conn c = new conn();
            
            String query = "select * from feedback";
            
            if(ae.getSource() == showdata){
                
                ResultSet rs = c.s.executeQuery(query);
                
                while (rs.next()){
                    
                    
                    
    
                    
                    //JOptionPane.showMessageDialog(rootPane, rs.getString("dept")+""+ rs.getString("year") +""+ rs.getString("subject") +""+ rs.getString("review") +""+ rs.getString("division") );
                    
                     String data[] = {rs.getString("dept"), rs.getString("year"), rs.getString("subject"), rs.getString("division"), rs.getString("review")};
                     
                     
                     tableModel.addRow(data);
                     
                     
                    
                    
                    
                
                
                }
                
                
                JTable table = new JTable(tableModel);
                 table.setBounds(200,300,500,300); 
                 add(table);
            
            
            } else {
            
            setVisible(false);
            
           
            new landing();
            
            }
            
            } catch(Exception e){

            e.printStackTrace();


        }
            
            
               
        }
    
    public static void main(String args[]){
    
        new feedbacklist();
    
    }
    
}
