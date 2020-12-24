/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class Filmes extends JFrame{
 JCheckBox ac,com,comrom,fic,rom,sus,terr;
 JLabel tit;
 JButton ok,canc;
 ButtonGroup grupo;
 public Filmes (){
 super("Locadora");
        Container tela = getContentPane ();
        setLayout (null);
        
        tit = new JLabel("Seleção de Filmes");
        ac = new JCheckBox ("Ação");
        com = new JCheckBox ("Comédia");
        comrom = new JCheckBox ("Comédia Romântica");
        fic = new JCheckBox ("Ficção");
        rom = new JCheckBox ("Romance");
        sus = new JCheckBox ("Suspense");
        terr = new JCheckBox ("Terror");
        ok = new JButton ("Ok");
        canc = new JButton ("Cancelar");
        
        tit.setBounds(150,10,200,20);
        tit.setFont(new Font ("TAHOMA",Font.ITALIC|Font.BOLD,18));
        ac.setBounds(40,30,70,20);
        com.setBounds(40,60,80,20);
        comrom.setBounds(40,90,300,20);
        fic.setBounds(40,120,100,20);
        rom.setBounds(40,150,100,20);
        sus.setBounds(40,180,100,20);
        terr.setBounds(40,210,90,20);
        ok.setBounds(120,240,70,20);
        canc.setBounds(250,240,100,20);
        
         ImageIcon ic1 = new ImageIcon("parabellum.jpg");ImageIcon ic2 = new ImageIcon("Deadpool.jpg");ImageIcon ic3 = new ImageIcon("AdorEx.jpg");
        ImageIcon ic4 = new ImageIcon("interstellar.jpg");ImageIcon ic5 = new ImageIcon("titanic.jpg");ImageIcon ic6 = new ImageIcon("Joker.jpg");
        ImageIcon ic7 = new ImageIcon("halloween.jpg");

        grupo = new ButtonGroup();
        grupo.add(ac);
        grupo.add(com);
        grupo.add(comrom);
        grupo.add(fic);
        grupo.add(rom);
        grupo.add(sus);
        grupo.add(terr);
        
canc.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.exit(0);
            }});
ok.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ac.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic1); }
                        if(com.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic2); }
                        if(comrom.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic3); }
                        if(fic.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic4); }
                        if(rom.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic5); }
                        if(sus.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic6); }
                        if(terr.getModel().isSelected()) { JOptionPane.showMessageDialog(null,ic7); }

            }
            });
        
   tela.add(ac);
tela.add(com);
tela.add(comrom);
tela.add(fic);
tela.add(rom);
tela.add(sus);
tela.add(terr);
tela.add(ok);
tela.add(canc);
tela.add(tit);
setSize(500,350);
setLocationRelativeTo(null);
setVisible(true);
 }
    public static void main(String[] args) {
     Filmes app = new Filmes();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // TODO code application logic here
    }
    
}
