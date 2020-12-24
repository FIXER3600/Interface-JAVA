/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitagoras;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Pitagoras extends JFrame {
JLabel rot1,rot2,rot3,exib;
JTextField tex1,tex2,tex3;
JButton med;
   public Pitagoras(){
    super("Teorema de Pitágoras");
Container tela = getContentPane();
setLayout(null);
rot1 = new JLabel("Digite o valor de A: ");
rot2 = new JLabel("Digite o valor de B: ");

med = new JButton("Clique aqui para Calcular");
tex1 = new JTextField(5);
tex2 = new JTextField(5);
tex3 = new JTextField(5);
exib = new JLabel("");
rot1.setBounds(50,20,150,20);
        rot2.setBounds(50,60,150,20);
        tex1.setBounds(180,20,200,20);
        tex2.setBounds(180,60,200,20);
        
        
        exib.setBounds(50,120,300,20);
        med.setBounds(50,100,300,20);
        med.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double num1,num2,num3,med;
                med=0;
                num1 = Double.parseDouble(tex1.getText());
                num2 = Double.parseDouble(tex2.getText());
                
              
                med =((num1*num1))+((num2*num2));
                
                num3 = Math.sqrt(med);
                
                exib.setVisible(true);
                exib.setText("A Hipotenusa vale: "+num3);
            }
            
        });
        exib.setVisible(false);
        
        tela.add(rot1);
        tela.add(rot2);
        
        
        tela.add(tex1);
        tela.add(tex2);
        
       
        tela.add(exib);
        tela.add(med);
        setSize(410,200);
        setVisible(true);
   }
    public static void main(String[] args) {
    Pitagoras app = new Pitagoras();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // TODO code application logic here
    }
    
}
