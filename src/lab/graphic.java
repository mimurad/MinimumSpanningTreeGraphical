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
public class graphic extends javax.swing.JFrame {

    /**
     * Creates new form graph
     */
    static int x, y, z, w;
    int xyz = 1;
    int i2, n2 = 8, j2, k2, d2, m2 = 0, s2 = 0, min;

    graphic() {
        System.out.println("in grapic");
        setTitle("Nodes");
        setBounds(870, 200, 500, 400);

        JPanel panel = new JPanel();

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
        a.drawOval(130, 90, 20, 20);
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
        System.out.println("" + a);
        if (NEW.a > 0) {
            a.drawLine(50, 190, 136, 110);
            a.drawString(String.valueOf(NEW.a), 85, 145);
        }
        if (NEW.b > 0) {
            a.drawLine(50, 190, 236, 105);
            a.drawString(String.valueOf(NEW.b), 85, 170);
        }
        if (NEW.c >0) {
            a.drawLine(50, 190, 336, 110);
            a.drawString(String.valueOf(NEW.c), 110, 172);
        }
        if (NEW.d >0) {
            a.drawLine(50, 190, 430, 190);
            a.drawString(String.valueOf(NEW.d), 95, 200);
        }
        if (NEW.e> 0) {
            a.drawLine(50, 190, 136, 270);
            a.drawString(String.valueOf(NEW.e), 85, 245);
        }
        if (NEW.f >0) {
            a.drawLine(50, 190, 236, 275);
            a.drawString(String.valueOf(NEW.f), 85, 220);
        }
        if (NEW.g > 0) {
            a.drawLine(50, 190, 336, 270);
            a.drawString(String.valueOf(NEW.g), 110,218);
        }
        if (NEW.j >0) {
            a.drawLine(140, 110, 430, 190);
            a.drawString(String.valueOf(NEW.j), 190, 137);
        }
        if (NEW.k > 0) {
            a.drawLine(140, 110, 140, 270);
            a.drawString(String.valueOf(NEW.k), 130, 150);
        }
        if (NEW.l > 0) {
            a.drawLine(140, 110, 240, 275);
            a.drawString(String.valueOf(NEW.l), 150, 150);
        }
        if (NEW.i > 0) {
            a.drawLine(140, 110, 340, 110);
            a.drawString(String.valueOf(NEW.o), 202, 122);
        }
        if (NEW.h > 0) {
            a.drawLine(150, 100, 230, 100);
            a.drawString(String.valueOf(NEW.h), 185, 95);
        }
        if (NEW.m >0) {
            a.drawLine(140, 110, 340, 270);
            a.drawString(String.valueOf(NEW.m), 170, 150);
        }
        if (NEW.s > 0) {
            a.drawLine(340, 110, 430, 190);
            a.drawString(String.valueOf(NEW.s), 385, 145);
        }
        if (NEW.t > 0) {
            a.drawLine(340, 110, 140, 270);
            a.drawString(String.valueOf(NEW.t), 235, 185);
        }
        if (NEW.u > 0) {
            a.drawLine(340, 110, 240, 275);
        }
        if (NEW.v > 0) {
            a.drawLine(340, 110, 340, 270);
        }
        if (NEW.n == 0) {
            a.drawLine(250, 100, 330, 100);
        }
        if (NEW.o == 0) {
            a.drawLine(240, 105, 430, 190);
        }
        if (NEW.p == 0) {
            a.drawLine(240, 105, 140, 270);
        }
        if (NEW.q == 0) {
            a.drawLine(240, 105, 240, 275);
        }
        if (NEW.r == 0) {
            a.drawLine(240, 105, 340, 270);
        }
        if (NEW.w > 0) {
            a.drawLine(430, 190, 140, 270);
        }
        if (NEW.x > 0) {
            a.drawLine(430, 190, 240, 275);
        }
        if (NEW.y > 0) {
            a.drawLine(430, 190, 340, 270);
        }
        if (NEW.z2 > 0) {
            a.drawLine(140, 270, 340, 270);
        }
        if (NEW.z1 > 0) {
            a.drawLine(150, 280, 230, 280);
        }
        if (NEW.z3 > 0) {
            a.drawLine(250, 280, 330, 280);
        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        if (NEW.xoy == 7) {
            System.exit(0);
        }
        NEW.xoy++;

        sdf asdf = new sdf();

        this.setVisible(true);

    }

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
