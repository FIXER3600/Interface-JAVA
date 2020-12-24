/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojformattedtextfield;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
public class ExemploJFormattedTextField extends JFrame{
    JList list;
JLabel rotcep,rottel,rotcpf,rotdat;
JFormattedTextField cep,tel,cpf,data;
MaskFormatter masccep,masctel,masccpf,mascdata;

   public ExemploJFormattedTextField(){
       super("Cadastro de Clientes");
       Container tela = getContentPane();
       setLayout(null);
       
       rotcep = new JLabel("CEP:");
       rottel = new JLabel("Telefone:");
       rotcpf = new JLabel("CPF:");
       rotdat = new JLabel("Data:");
       rotcep = new JLabel("CEP:");
       list = new JList();
      list.setVisibleRowCount(5);
    
      list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
       rotcep.setBounds(50,40,100,20);
       rottel.setBounds(50,80,100,20);
       rotcpf.setBounds(50,120,100,20);
       rotdat.setBounds(50,160,100,20);
       
  
       try{
            masccep = new MaskFormatter("#####-###");
           masctel = new MaskFormatter("(##)#####-####");
           masccpf = new MaskFormatter("#########-##"); 
           mascdata = new MaskFormatter("##/##/####");
           masccep.setPlaceholderCharacter('_');
           masctel.setPlaceholderCharacter('_');
           masccpf.setPlaceholderCharacter('_');
           mascdata.setPlaceholderCharacter('_');
       }
       catch(ParseException excp){}
       cep = new JFormattedTextField(masccep);
tel = new JFormattedTextField(masctel);
cpf = new JFormattedTextField(masccpf);
data = new JFormattedTextField(mascdata);
cep.setBounds(150,40,70,20);
tel.setBounds(150,80,100,20);
cpf.setBounds(150,120,90,20);
data.setBounds(150,160,70,20);

/*exib.addActionListener(
      new ActionListener(){
          public void actionPerformed(ActionEvent e){
           double cp,cf,te,dat = 0;
              
          }});*/
data.addKeyListener(new KeyListener() {
           @Override
           public void keyTyped(KeyEvent e) {
              // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void keyPressed(KeyEvent e) {           
               if(e.getKeyCode()==e.VK_ENTER){
               String a,b,c,d;
              a=cep.getText();
              b=tel.getText();
              c=cpf.getText();
              d=data.getText();
               JOptionPane.showMessageDialog(null,"CEP:\n"+a+"\nTelefone:\n"+b+"\nCpf:\n"+c+"\nData:\n"+d);
           }
               
            //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void keyReleased(KeyEvent e) {
              // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

           }
       });
tela.add(rotcep);
tela.add(rottel);
tela.add(rotcpf);
tela.add(rotdat);
tela.add(cep);
tela.add(tel);
tela.add(cpf);
tela.add(data);

setSize(400,250);
setVisible(true);
   }
    public static void main(String[] args) {
        // TODO code application logic here
    ExemploJFormattedTextField app = new ExemploJFormattedTextField();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
