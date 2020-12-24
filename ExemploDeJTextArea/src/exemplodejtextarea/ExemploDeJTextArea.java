/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodejtextarea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploDeJTextArea extends JFrame{
JLabel rot;
JTextArea tex;
JScrollPane painelrol;
JPanel painel;
public ExemploDeJTextArea() {
    super("Exemplo com JTextField");
    Container tela = getContentPane();
    tela.setLayout(null);
    rot = new JLabel("Endereço");
    rot.setBounds(50,20,100,20);
    tex = new JTextArea(10,20);
    painelrol = new JScrollPane(tex);
    painelrol.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    painelrol.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    painel = new JPanel ();
    painel.add(painelrol);
    painel.setBounds(40,40,250,250);
    tela.add(rot);
    tela.add(painel);
    setSize(300,280);
    setVisible(true);
    setLocationRelativeTo(null);
}
    public static void main(String[] args) {
      ExemploDeJTextArea app = new ExemploDeJTextArea();
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
