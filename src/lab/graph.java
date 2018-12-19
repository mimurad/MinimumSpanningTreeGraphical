package lab;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static lab.NEW.a1;

/**
 *
 * @author MURAD
 */
public class graph extends javax.swing.JFrame {

    /**
     * Creates new form graph
     */
    static int x, y, z, w;
    int xyz=1;
    int i2, n2 = 8, j2, k2, d2, m2 = 0, s2 = 0, min;
    graph(){
        System.out.println("here");
        setTitle("Nodes");
        setBounds(300,200, 500, 400);
        setBackground(Color.yellow);
        JPanel panel=new JPanel(); 
        
        add(panel);
//        panel.setLayout(null);
        
        jButton1 = new javax.swing.JButton();
        
         jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
    }   
    
   
    public void paint(Graphics a) {

        
        char b = 'A';
        
        
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
        if(NEW.a1[0][1]==1000&&NEW.a1[1][0]==1000)
        a.drawLine(50, 190, 136, 110);
        if(NEW.a1[0][2]==1000&&NEW.a1[2][0]==1000)
        a.drawLine(50, 190, 236, 105);
        if(NEW.a1[0][3]==1000&&NEW.a1[3][0]==1000)
        a.drawLine(50, 190, 336, 110);
        if(NEW.a1[0][4]==1000&&NEW.a1[4][0]==1000)
        a.drawLine(50, 190, 430, 190);
        if(NEW.a1[0][5]==1000&&NEW.a1[5][0]==1000)
        a.drawLine(50, 190, 136, 270);
        if(NEW.a1[0][6]==1000&&NEW.a1[6][0]==1000)
        a.drawLine(50, 190, 236, 275);
        if(NEW.a1[0][7]==1000&&NEW.a1[7][0]==1000)
        a.drawLine(50, 190, 336, 270);
        if(NEW.a1[1][4]==1000&&NEW.a1[4][1]==1000)
        a.drawLine(140, 110, 430, 190);
        if(NEW.a1[1][5]==1000&&NEW.a1[5][1]==1000)
        a.drawLine(140, 110, 140, 270);
        if(NEW.a1[1][6]==1000&&NEW.a1[6][1]==1000)
        a.drawLine(140, 110, 240, 275);
        if(NEW.a1[1][3]==1000&&NEW.a1[3][1]==1000)
        a.drawLine(140, 110, 340, 110);
        if(NEW.a1[1][2]==1000&&NEW.a1[2][1]==1000)
        a.drawLine(150, 100, 230, 100);
        if(NEW.a1[1][7]==1000&&NEW.a1[7][1]==1000)
        a.drawLine(140, 110, 340, 270);
        if(NEW.a1[3][4]==1000&&NEW.a1[4][3]==1000)
        a.drawLine(340, 110, 430, 190);
        if(NEW.a1[3][5]==1000&&NEW.a1[5][3]==1000)
        a.drawLine(340, 110, 140, 270);
        if(NEW.a1[3][6]==1000&&NEW.a1[6][3]==1000)
        a.drawLine(340, 110, 240, 275);
        if(NEW.a1[3][7]==1000&&NEW.a1[7][3]==1000)
        a.drawLine(340, 110, 340, 270);
        if(NEW.a1[2][3]==1000&&NEW.a1[3][2]==1000)
        a.drawLine(250, 100, 330, 100);
        if(NEW.a1[2][4]==1000&&NEW.a1[4][2]==1000)
        a.drawLine(240, 105, 430, 190);
        if(NEW.a1[2][5]==1000&&NEW.a1[5][2]==1000)
        a.drawLine(240, 105, 140, 270);
        if(NEW.a1[2][6]==1000&&NEW.a1[6][2]==1000)
        a.drawLine(240, 105, 240,275 );
        if(NEW.a1[2][7]==1000&&NEW.a1[7][2]==1000)
        a.drawLine(240, 105, 340, 270);
        if(NEW.a1[4][5]==1000&&NEW.a1[5][4]==1000)
        a.drawLine(430, 190, 140, 270);
        if(NEW.a1[4][6]==1000&&NEW.a1[6][4]==1000)
        a.drawLine(430, 190, 240, 275);
        if(NEW.a1[4][7]==1000&&NEW.a1[7][4]==1000)
        a.drawLine(430, 190, 340, 270);
        if(NEW.a1[5][7]==1000&&NEW.a1[7][5]==1000)
        a.drawLine(140, 270, 340, 270);
        if(NEW.a1[5][6]==1000&&NEW.a1[6][5]==1000)
        a.drawLine(150, 280, 230, 280);
        if(NEW.a1[6][7]==1000&&NEW.a1[7][6]==1000)
        a.drawLine(250, 280, 330, 280);

    }

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
       
        
         if(NEW.xoy==8)
          System.exit(0);
         NEW.xoy++;
        
            sdf asd=new sdf();
//            graph adf=new graph();
          
            
//       
        


        this.setVisible(false);

    }

    public static void main(String args[]) {

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graph().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify                     
     private javax.swing.JButton jButton1;
    // End of variables declaration                   
}
