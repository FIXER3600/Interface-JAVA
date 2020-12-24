/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojcombobox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJComboBox extends JFrame{
JComboBox lista;
String cid[]= {"Rio de Janeiro","São Paulo","Acre","Minas Gerais","Espírito Santo","Rio Grande do Sul","Bahia","Pernambuco"};
JButton exib;
JLabel rot;
public ExemploJComboBox(){
super("Lista de Estados");
      Container tela = getContentPane();
      setLayout(null);
      exib=new JButton("Exibir");
      rot=new JLabel("");
      lista=new JComboBox(cid);
      lista.setEditable(true);
      lista.setMaximumRowCount(5);
      lista.setBounds(50,50,150,30);
      exib.setBounds(270,50,100,30);
      exib.setBounds(50,150,200,30);
      exib.addActionListener(
              new ActionListener(){
                   public void actionPerformed(ActionEvent e){
                       rot.setText("O estado é:"+lista.getSelectedItem().toString());}});
      tela.add(lista);
      tela.add(exib);
      tela.add(rot);
      setSize(400,250);
      setVisible(true);
              }
    public static void main(String[] args) {
        // TODO code application logic here
       ExemploJComboBox app = new ExemploJComboBox();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    
}
