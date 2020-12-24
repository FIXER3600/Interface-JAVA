/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Media extends JFrame {
JLabel rot1,rot2,rot3,rot4,exib;
JTextField tex1,tex2,tex3,tex4;
JButton med;
   public Media(){
    super("Media");
Container tela = getContentPane();
setLayout(null);
rot1 = new JLabel("1º Número");
rot2 = new JLabel("2º Número");
rot3 = new JLabel("3º Número");
rot4 = new JLabel("4º Número");
tex1 = new JTextField(5);
tex2 = new JTextField(5);
tex3 = new JTextField(5);
tex4 = new JTextField(5);
exib = new JLabel("");
med = new JButton("Media");
rot1.setBounds(50,20,100,20);
        rot2.setBounds(50,60,100,20);
        tex1.setBounds(120,20,200,20);
        tex2.setBounds(120,60,200,20);
        rot3.setBounds(50,100,100,20);
        rot4.setBounds(50,140,100,20);
        tex3.setBounds(120,100,200,20);
        tex4.setBounds(120,140,200,20);
    med.setBounds(50,200,300,20);
     exib.setBounds(50,220,300,20);
        med.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double num1,num2,num3,num4,med;
                med=0;
                num1 = Integer.parseInt(tex1.getText());
                num2 = Integer.parseInt(tex2.getText());
                num3 = Integer.parseInt(tex3.getText());
                num4 = Integer.parseInt(tex4.getText());
                
                med = (num1 + num2 + num3 + num4)/4;
                exib.setVisible(true);
                exib.setText("O Resultado da Média é de: "+med);
            }
            
        });
    
exib.setVisible(false);
        
        tela.add(rot1);
        tela.add(rot2);
        tela.add(rot3);
        tela.add(rot4);
        tela.add(tex1);
        tela.add(tex2);
        tela.add(tex3);
        tela.add(tex4);
        tela.add(exib);
        tela.add(med);
        setSize(400,300);
        setVisible(true);
        setResizable(false);
   }
public static void main(String[] args) {
       Media app = new Media();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
    
}
