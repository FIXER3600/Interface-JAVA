/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhaskara;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Bhaskara extends JFrame{
    JLabel rot1,rot2,rot3,rot4,rot5;
JTextField tex1,tex2,tex3,tex4,tex5,exib1,exib2;
JButton Calcular;
public Bhaskara(){
super("Bhaskara");
Container tela = getContentPane();
setLayout(null);
rot1 = new JLabel("Valor de a:");
rot2 = new JLabel("Valor de b: ");
rot3 = new JLabel("Valor de C: ");
rot4 = new JLabel("X¹: ");
rot5 = new JLabel("X²: ");
tex1 = new JTextField(5);
tex2 = new JTextField(5);
tex3 = new JTextField(5);
tex4 = new JTextField(5);
tex5 = new JTextField(5);
Calcular = new JButton ("Calcular");
exib1 = new JTextField(5);
exib2 = new JTextField(5);
rot1.setBounds(50,20,100,20);
        rot2.setBounds(50,60,100,20);
        tex1.setBounds(120,20,200,20);
        tex2.setBounds(120,60,200,20);
        rot3.setBounds(50,100,100,20);
        rot4.setBounds(30,220,100,20);
        rot5.setBounds(30,240,100,20);
        tex3.setBounds(120,100,200,20);
        
       
    Calcular.setBounds(50,200,300,20);
     exib1.setBounds(50,220,300,20);
     exib2.setBounds(50,240,300,20);
        Calcular.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double num1,num2,num3,del,x1,x2;
                del=0;
                x1=0;
                x2=0;
                num1 = Double.parseDouble(tex1.getText());
                num2 = Double.parseDouble(tex2.getText());
                num3 = Double.parseDouble(tex3.getText());
                del = (num2 * num2) + (-4 * (num1 * num3));
                x1 = (double) ((-(num2) + Math.sqrt(del)) / 2 * num1);
                x2 = (double) ((-(num2) - Math.sqrt(del)) / 2 * num1);
                
                exib1.setText(""+x1);
                exib2.setText(""+x2);
            }
            
        });
        
        
        tela.add(rot1);
        tela.add(rot2);
        tela.add(rot3);
        tela.add(rot4);
        tela.add(rot5);
        tela.add(tex1);
        tela.add(tex2);
        tela.add(tex3);
        tela.add(tex4);
        tela.add(tex5);
        tela.add(exib1);
        tela.add(exib2);
        tela.add(Calcular);
        setSize(400,300);
        setVisible(true);
   }

    public static void main(String[] args) {
    Bhaskara app = new Bhaskara();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // TODO code application logic here
    }
    
}
