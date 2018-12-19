/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author MURAD
 */
public class graphic1 extends javax.swing.JFrame {

    /**
     * Creates new form graph
     * 
     */
    static int x, y, z, w;
    int xyz=1;
    int AA,BB;
    int i2, n2 = 8, j2, k2, d2, m2 = 0, s2 = 0, min;
    graphic1(int A ,int B){
        AA=A;
        BB=B;
    }
    void graphic1(){
        System.out.println("in grapic");
        setTitle("Nodes");
        setBounds(870,200, 500, 400);
        setBackground(Color.yellow);
        JPanel panel=new JPanel(); 
        
        add(panel);
//        panel.setLayout(null);
//        jButton1 = new javax.swing.JButton();
//        
//         jButton1.setText("NEXT");
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton1ActionPerformed(evt);
//            }
//        });
//        panel.add(jButton1);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
    }   
    
   
    public void paint(Graphics a) {

        
        char b = 'A';
        System.out.println(""+a);
        
        a.drawOval(30, 180, 20, 20);
        a.drawOval(130, 90,20,20);
        a.drawOval(230, 85, 20, 20);
        a.drawOval(330, 90, 20, 20);
        a.drawOval(430, 180, 20, 20);
        a.drawOval(130, 270, 20, 20);
        a.drawOval(230, 275, 20, 20);
        a.drawOval(330, 270, 20, 20);
        a.drawString(String.valueOf(b++), 36, 195);
        a.drawString(String.valueOf(b++), 136, 105);
        a.drawString(String.valueOf(b++), 236, 100);
        a.drawString(String.valueOf(b++), 336, 105);
        a.drawString(String.valueOf(b++), 436, 195);
        a.drawString(String.valueOf(b++), 136, 285);
        a.drawString(String.valueOf(b++), 236, 290);
        a.drawString(String.valueOf(b++), 336, 285);
        if(AA==0&&BB==1)
        a.drawLine(50, 190, 136, 110);
        if(AA==0&&BB==2)
        a.drawLine(50, 190, 236, 105);
        if(AA==0&&BB==3)
        a.drawLine(50, 190, 336, 110);
        if(AA==0&&BB==4)
        a.drawLine(50, 190, 430, 190);
        if(AA==0&&BB==5)
        a.drawLine(50, 190, 136, 270);
        if(AA==0&&BB==6)
        a.drawLine(50, 190, 236, 275);
        if(AA==0&&BB==7)
        a.drawLine(50, 190, 336, 270);
        if(AA==1&&BB==4)
        a.drawLine(140, 110, 430, 190);
        if(AA==1&&BB==5)
        a.drawLine(140, 110, 140, 270);
        if(AA==1&&BB==6)
        a.drawLine(140, 110, 240, 275);
        if(AA==1&&BB==3)
        a.drawLine(140, 110, 340, 110);
        if(AA==1&&BB==2)
        a.drawLine(150, 100, 230, 100);
        if(AA==1&&BB==7)
        a.drawLine(140, 110, 340, 270);
        if(AA==3&&BB==4)
        a.drawLine(340, 110, 430, 190);
        if(AA==3&&BB==5)
        a.drawLine(340, 110, 140, 270);
        if(AA==3&&BB==6)
        a.drawLine(340, 110, 240, 275);
        if(AA==3&&BB==7)
        a.drawLine(340, 110, 340, 270);
        if(AA==2&&BB==3)
        a.drawLine(250, 100, 330, 100);
        if(AA==2&&BB==4)
        a.drawLine(240, 105, 430, 190);
        if(AA==2&&BB==5)
        a.drawLine(240, 105, 140, 270);
        if(AA==2&&BB==6)
        a.drawLine(240, 105, 240,275 );
        if(AA==2&&BB==7)
        a.drawLine(240, 105, 340, 270);
        if(AA==4&&BB==5)
        a.drawLine(430, 190, 140, 270);
        if(AA==4&&BB==6)
        a.drawLine(430, 190, 240, 275);
        if(AA==4&&BB==7)
        a.drawLine(430, 190, 340, 270);
        if(AA==5&&BB==7)
        a.drawLine(140, 270, 340, 270);
        if(AA==5&&BB==6)
        a.drawLine(150, 280, 230, 280);
        if(AA==6&&BB==7)
        a.drawLine(250, 280, 330, 280);

    }


    
    
//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
//       
//        
//         if(NEW.xoy==7)
//          System.exit(0);
//         NEW.xoy++;
//        
//            sdf asdf=new sdf();
//              
//            
//            
//
//
//        this.setVisible(false);

//    }
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graphic().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify                     
     private javax.swing.JButton jButton1;
    }
    

