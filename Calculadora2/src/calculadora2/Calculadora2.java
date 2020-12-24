/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;


import javax.swing.*;
import java.awt.*;
public class Calculadora2 extends JFrame{
JLabel calculadora;
    JTextField dig;
    JButton bot1,bot2,bot3,bot4,bot5,bot6,bot7,bot8,bot9,bot0,botmenos,botvezes,botdiv,botponto,botigual,botce,botback,botmais;
    public Calculadora2(){
    super("Calculadora");
    Container tela = getContentPane();
		setLayout(null);
                calculadora = new JLabel("Calculadora");
               bot1 = new JButton("1"); 
               bot2 = new JButton("2");
               bot3 = new JButton("3");
               bot4 = new JButton("4");
               bot5 = new JButton("5");
               bot6 = new JButton("6");
               bot7 = new JButton("7");
               bot8 = new JButton("8");
               bot9 = new JButton("9");
               bot0 = new JButton("0");
        
               botmenos = new JButton("-");
               botmais = new JButton("+");
               botponto = new JButton(".");
               botigual = new JButton("=");
               botce = new JButton("ce");
               botback = new JButton("Backspace");
               botvezes = new JButton("*");
               botdiv = new JButton("/");
               dig = new JTextField(999);
               dig.setForeground(Color.gray);
               bot1.setBounds(20, 140, 50, 30);
               bot7.setBounds(20, 70, 50, 30);
               bot4.setBounds(20, 105, 50, 30);
               bot0.setBounds(20, 175, 50, 30);
              bot8.setBounds(80, 70, 50, 30);
              bot5.setBounds(80, 140, 50, 30);
              bot2.setBounds(80, 105, 50,30);
              botponto.setBounds(80, 175, 50, 30);
               bot9.setBounds(140, 70, 50, 30);
              bot6.setBounds(140, 105, 50, 30);
              bot3.setBounds(140, 140, 50, 30);
              botigual.setBounds(140, 175, 50, 30);
               botdiv.setBounds(200, 70, 50, 30);
              botmenos.setBounds(200, 140, 50, 30);
              botvezes.setBounds(200, 105, 50, 30);
              botmais.setBounds(200, 175, 50, 30);
               dig.setBounds(20,5,230,20);
               botback.setBounds(20, 35, 110, 30);
               botce.setBounds(140, 35, 110, 30);
               
               botback.setForeground(Color.red);
               botponto.setForeground(Color.red);
               botmais.setForeground(Color.red);
               botmenos.setForeground(Color.red);
               botce.setForeground(Color.red);
               botdiv.setForeground(Color.red);
               botigual.setForeground(Color.red);
               botvezes.setForeground(Color.red);
      tela.add(bot1);
      tela.add(bot2);
      tela.add(bot3);
      tela.add(bot4);
      tela.add(bot5);
      tela.add(bot6);
        tela.add(bot7);
      tela.add(bot8);
      tela.add(bot9);
      tela.add(bot0);
      tela.add(botmais);
      tela.add(botmenos);
      tela.add(botvezes);
        tela.add(botback);
      tela.add(botce);
      tela.add(botigual);
      tela.add(botdiv);
      tela.add(botponto);
     tela.add(dig);
     tela.add(calculadora);
      setResizable(false);
     setSize(285,250);
      setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora2 app = new Calculadora2();
         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}