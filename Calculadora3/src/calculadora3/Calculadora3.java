/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculadora3 extends JFrame{
JLabel rot1,rot2,exib;
JTextField tex1,tex2;
JButton somar,subt,div,multi;
public Calculadora3(){
super("Calculadora");
Container tela = getContentPane();
setLayout(null);
rot1 = new JLabel("1º Número");
rot2 = new JLabel("2º Número");
tex1 = new JTextField(5);
tex2 = new JTextField(5);
exib = new JLabel("");
        somar = new JButton("+");
        subt = new JButton("-");
        div = new JButton("/");
        multi = new JButton("x");
        rot1.setBounds(50,20,100,20);
        rot2.setBounds(50,60,100,20);
        tex1.setBounds(120,20,200,20);
        tex2.setBounds(120,60,200,20);
        exib.setBounds(50,220,300,20);
                somar.setBounds(150,100,80,20);
                subt.setBounds(150,130,80,20);
                div.setBounds(150,160,80,20);
                multi.setBounds(150,190,80,20);
        subt.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int num1,num2,subt;
                subt=0;
                num1 = Integer.parseInt(tex1.getText());
                num2 = Integer.parseInt(tex2.getText());
                subt = num1 - num2;
                exib.setVisible(true);
                exib.setText("O Resultado da Subtração é de: "+subt);
            }
            
        });
                somar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num1,num2,soma;
                soma=0;
                num1 = Integer.parseInt(tex1.getText());
                num2 = Integer.parseInt(tex2.getText());
                soma = num1 + num2;
                exib.setVisible(true);
                exib.setText("O Resultado da Soma é de: "+soma);
            }  
            }
        );
                multi.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int num1,num2,multi;
                multi=0;
                num1 = Integer.parseInt(tex1.getText());
                num2 = Integer.parseInt(tex2.getText());
                multi = num1 * num2;
                exib.setVisible(true);
                exib.setText("O Resultado da Multiplicação é de: "+multi);
            }  
            }
        );
                 div.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int num1,num2,div;
                div=0;
                num1 = Integer.parseInt(tex1.getText());
                num2 = Integer.parseInt(tex2.getText());
                div = num1 / num2;
                exib.setVisible(true);
                exib.setText("O Resultado da Divisão é de: "+div);
            }
            
        });
        exib.setVisible(false);
        
        tela.add(rot1);
        tela.add(rot2);
        tela.add(tex1);
        tela.add(tex2);
        tela.add(exib);
        tela.add(somar);
        tela.add(subt);
        tela.add(div);
        tela.add(multi);
        setSize(400,300);
        setVisible(true);
        setResizable(false);
}
        public static void main(String[] args) {
        Calculadora3 app = new Calculadora3();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// TODO code application logic here
    }
    
}
