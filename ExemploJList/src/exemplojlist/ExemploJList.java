package exemplojlist;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJList extends JFrame{
JList lista;
String cid[]= {"Rio de Janeiro","São Paulo","Acre","Minas Gerais","Espírito Santo","Rio Grande do Sul","Bahia","Pernambuco"};
JButton exib;
JLabel rot;
  public ExemploJList(){
      super("Lista de Estados");
      Container tela = getContentPane();
      setLayout(null);
      exib=new JButton("Exibir");
      rot=new JLabel("");
      lista=new JList(cid);
      lista.setVisibleRowCount(5);
      JScrollPane painelRolagem = new JScrollPane(lista);
      lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      painelRolagem.setBounds(40,50,100,90);
      rot.setBounds(50,150,200,30);
      exib.setBounds(270,50,100,30);
      exib.addActionListener(
      new ActionListener(){
          public void actionPerformed(ActionEvent e){
              rot.setText("O Estado é: "+lista.getSelectedValue().toString());
          }
      });
      tela.add(painelRolagem);
      tela.add(exib);
      tela.add(rot);
      setSize(400,250);
      setVisible(true);
  }
    public static void main(String[] args) {
        // TODO code application logic here
   ExemploJList app = new ExemploJList();
   app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    }
    
}
