/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telainicializacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TelaInicializacao extends JFrame {
    JLabel login,pass, mes;
    JTextField log,pas;
    JButton ok,cancelar;
    public TelaInicializacao(){
     super("Tela de Inicialização");
     Container tela = getContentPane();
		setLayout(null);
      ok = new JButton ("OK");
     cancelar = new JButton ("Cancelar");           
      login = new  JLabel ("Login:");
      pass = new JLabel ("Password:");
     mes = new JLabel ("Entre com seus dados:");
      log = new JTextField (30);
      pas = new JTextField (10);
      
      ok.setBounds(100,150,60,30);
      cancelar.setBounds(210,150,100,30);
     login.setBounds(65, 20, 70, 40);
     pass.setBounds(40,50,70,90);
     mes.setBounds(100,10,300,10);
     log.setBounds(105,30,200,20);
     pas.setBounds(105,88,200,20);
     mes.setForeground(Color.red);
     
     tela.add(ok);
      tela.add(cancelar);
      tela.add(login);
      tela.add(pass);
      tela.add(mes);
      tela.add(log);
      tela.add(pas);
      setSize(450,250);
      setVisible(true);
        setLocationRelativeTo(null);
        cancelar.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
          }
            
        });
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        TelaInicializacao app= new TelaInicializacao();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
}
