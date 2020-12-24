/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojlist;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJList2 extends JFrame{
JList lista;
String cid[]= {"Rio de Janeiro","São Paulo","Acre","Minas Gerais","Espírito Santo","Rio Grande do Sul","Bahia","Pernambuco"};
JButton exib;
 public ExemploJList2(){
      super("Lista de Estados 2");
      Container tela = getContentPane();
      setLayout(null);
      exib=new JButton("Exibir");
      lista = new JList(cid);
      lista.setVisibleRowCount(5);
      JScrollPane painelRolagem = new JScrollPane(lista);
      lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      painelRolagem.setBounds(40,50,150,100);
      exib.setBounds(270,50,100,30);
exib.addActionListener(
      new ActionListener(){
          public void actionPerformed(ActionEvent e){
              Object selecionados[] = lista.getSelectedValues();
              String resultados = "Values selecionados:\n";
              for(int i=0;i<selecionados.length;i++)
                  resultados += selecionados[i].toString()+"\n";
              JOptionPane.showMessageDialog(null,resultados);
          }});
tela.add(painelRolagem);
tela.add(exib);
setSize(400,250);
setVisible(true);
 }
 public static void main(String[] args) {
 ExemploJList2 app = new ExemploJList2();
     app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}