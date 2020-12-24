package emprestimo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Emprestimo extends JFrame {
   JList list;
    JComboBox item;
   String cid[]= {"O Cortiço","A Cabana","Laranja Mecânica","Dicionário Aurélio","Iracema","O Pequeno Príncipe","O Hobbit","Harry Potter"};
   JLabel login,pass, mes, alun;
    JTextField log,pas;
    JButton cancelar;
    public Emprestimo(){
     super("Tela de Inicialização - Paloma");
     Container tela = getContentPane();
		setLayout(null);
      item=new JComboBox(cid); 
      item.setMaximumRowCount(5);
      item.setBounds(310,50,150,30);
     cancelar = new JButton ("Emprestar");           
      login = new  JLabel ("Nome");
      pass = new JLabel ("Classe");
     mes = new JLabel ("Empréstimo");
      log = new JTextField (30);
      pas = new JTextField (10);
      alun = new JLabel("Aluno:");
      alun.setBounds(60,20,70,40);
      cancelar.setBounds(180,150,100,30);
      list = new JList(cid);
      list.setVisibleRowCount(5);
      list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
     login.setBounds(60, 50, 70, 40);
     pass.setBounds(55,85,70,90);
     mes.setBounds(150,20,100,10);
     log.setBounds(105,60,200,20);
     pas.setBounds(105,120,200,20);
     mes.setForeground(Color.red);
     cancelar.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
             Object selecionados[] = list.getSelectedValuesList().toArray();
              String resultados = "\nLivro Selecionado:\n"+selecionados;
              for(int i=0;i<selecionados.length;i++)
                  resultados += selecionados[i].toString()+"\n";
              String a,b;
              a=log.getText();
              b=pas.getText();
              JOptionPane.showMessageDialog(null,"Aluno:\n"+a+"\nClasse:\n"+b+"\nLivro:\n"+item.getSelectedItem());
             
          }});
     cancelar.setToolTipText("Clique aqui para exibir as informações recebidas");
     
 tela.add(alun);
     tela.add(item);
      tela.add(cancelar);
      tela.add(login);
      tela.add(pass);
      tela.add(mes);
      tela.add(log);
      tela.add(pas);
      setSize(480,250);
      setVisible(true);
        setLocationRelativeTo(null);
}
    public static void main(String[] args) {
        // TODO code application logic here
        Emprestimo app= new Emprestimo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}
