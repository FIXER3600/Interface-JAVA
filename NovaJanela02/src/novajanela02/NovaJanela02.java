/*package novajanela02;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
public class NovaJanela02 extends JFrame{
JButton abrir;
Inicial segundajanela; 
public NovaJanela02(){
super ("Abrir uma nova janela");
Container tela = getContentPane();
tela.setLayout(null);
abrir = new JButton("Abrir");
abrir.setBounds(100,50,80,20);
abrir.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
segundajanela = new Inicial ();
segundajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
segundajanela.setVisible(true);
setVisible(false);
dispose();}});
tela.add(abrir);
setSize(300,150);
setVisible (true);
setLocationRelativeTo(null);}
public static void main(String args[]) {
NovaJanela02 app = new NovaJanela02 ();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
private class Inicial extends JFrame{ 
    JButton sair;
private Inicial(){ 
    super("Menu Principal...");
Container tela1 = getContentPane(); 
tela1.setLayout(null);
sair = new JButton("Sair");
sair.setBounds(50,50,100,20); 
TBsair tsair = new TBsair();
sair.addActionListener(tsair); 
tela.add(sair); 
setSize (200,200); 
setLocationRelativeTo(null);
}}
private class TBsair implements ActionListener{
public void actionPerformed(ActionEvent evento){
int status = JOptionPane.showConfirmDialog(null,"Deseja realmente fechar" + "o programa?","Mensagem de saída",JOptionPane.YES_NO_OPTION); 
if (status == JOptionPane.YES_OPTION)
{segundajanela.setVisible (false); 
segundajanela.dispose();
}}
}}*/
package novajanela02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NovaJanela02 extends JFrame{
	JButton abrir;
	Inicial segundajanela;
	public NovaJanela02() {
		super("Abrir uma nova janela");
		Container tela = getContentPane();
		tela.setLayout(null);
		abrir = new JButton("Abrir");
		abrir.setBounds(100,50,80,20);
		abrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundajanela = new Inicial();
				segundajanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				segundajanela.setVisible(true);
				setVisible(false);
				dispose();
			}
		});
		tela.add(abrir);
		setSize(300,150);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String args[]) {
		NovaJanela02 app = new NovaJanela02();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class Inicial extends JFrame{
		JButton sair;
		private Inicial(){
			super("Menu Principal...");
			Container tela = getContentPane();
			tela.setLayout(null);

			sair= new JButton("Sair");
			sair.setBounds(50,50,100,20);
			TBsair tsair = new TBsair();
			sair.addActionListener(tsair);
			tela.add(sair);
			setSize(200,200);
			setLocationRelativeTo(null);
		}
	}

	private class TBsair implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int status = JOptionPane.showConfirmDialog(null,"Deseja realmente fechar"+
					" o programa?","Mensagem de saida",JOptionPane.YES_NO_OPTION);
			if(status == JOptionPane.YES_OPTION) {
				segundajanela.setVisible(false);
				segundajanela.dispose();
			}
		}
	}
}
