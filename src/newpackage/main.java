/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JFrame;

/**
 *
 * @author Zuriel PC
 */
public class main {
    public static void main(String[]args) throws InterruptedException{
        JFrame frm= new JFrame("bola-Rebote UTN v0.1");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.add(new panel());
        frm.pack();
       // frm.setSize(800,600);
       frm.setLocationRelativeTo(null);
       frm.setVisible(true);
       while(true){
           frm.repaint();
           Thread.sleep(20);
       }
        
        
        
    
}
}