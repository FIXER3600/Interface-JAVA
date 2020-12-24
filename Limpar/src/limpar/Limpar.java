/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package limpar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Limpar extends JFrame {
JLabel rot,rot2;
JTextField tex,tex2;
JButton limpar;
public Limpar(){
    super("Exemplo Limpar");
    Container tela = getContentPane();
    setLayout(null);
    rot = new JLabel("1º número:");
    rot2 = new JLabel("2º número:");
    tex = new JTextField(5);
    tex2 = new JTextField(5);
    limpar = new JButton("Limpar");
    rot.setBounds(50,20,100,20);
    rot2.setBounds(50,60,100,20);
    tex.setBounds(120,20,200,20);
    tex2.setBounds(120,60,200,20);
    limpar.setBounds(150,100,80,20);
    limpar.addActionListener(
    new ActionListener(){
        public void actionPerformed(ActionEvent e){
            tex.setText(null);
            tex2.setText(null);
            tex.requestFocus();
        }
    });
    tela.add(rot);
    tela.add(rot2);
    tela.add(tex);
    tela.add(tex2);
    tela.add(limpar);
    setSize(400,250);
    setVisible(true);
}
    public static void main(String[] args) {
    Limpar app = new Limpar();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // TODO code application logic here
    }
    
}
