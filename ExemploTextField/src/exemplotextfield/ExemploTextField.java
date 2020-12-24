/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplotextfield;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploTextField extends JFrame {
	JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7,rotulo8;
	JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7,texto8;
	JButton botão;
	public ExemploTextField() {
		super("Exemplo com label");
		Container tela = getContentPane();
		setLayout(null);
		botão = new JButton("Fechar");
		rotulo1 = new JLabel ("Nome");
		rotulo2 = new JLabel ("Cidade");
		rotulo3 = new JLabel ("CPF");
		rotulo4 = new JLabel ("Sexo");
		rotulo5 = new JLabel ("Idade");
		rotulo6 = new JLabel ("Estado");
		rotulo7 = new JLabel ("RG");
		rotulo8 = new JLabel ("Cor");
		texto1 = new JTextField(50);
		texto2 = new JTextField(3);
		texto3 = new JTextField(10);
		texto4 = new JTextField(10);
		texto5 = new JTextField(2);
		texto6 = new JTextField(20);
		texto7 = new JTextField(10);
		texto8 = new JTextField(8);
		
		botão.setBounds(250,180,80,20);
		rotulo1.setBounds(50,20,80,20);
		rotulo2.setBounds(50,60,80,20);
		rotulo3.setBounds(50,100,90,20);
		rotulo4.setBounds(50,140,80,20);
		rotulo5.setBounds(350,20,80,20);
		rotulo6.setBounds(350,60,80,20);
		rotulo7.setBounds(350,100,90,20);
		rotulo8.setBounds(350,140,80,20);
		
		texto1.setBounds(110,20,200,20);
		texto2.setBounds(110,60,50,20);
		texto3.setBounds(110,100,80,20);
		texto4.setBounds(110,140,80,20);
		texto5.setBounds(400,20,20,20);
		texto6.setBounds(400,60,20,20);
		texto7.setBounds(400,100,80,20);
		texto8.setBounds(400,140,80,20);
		rotulo1.setForeground(Color.red);
		rotulo2.setForeground(Color.blue);
		rotulo3.setForeground(new Color(190,152,142));
		rotulo4.setForeground(new Color(190,152,142));
		rotulo5.setForeground(new Color(190,152,142));
		rotulo6.setForeground(new Color(190,152,142));
		rotulo7.setForeground(new Color(190,152,142));
		rotulo8.setForeground(new Color(190,152,142));
		
		rotulo1.setFont(new Font("Arial",Font.BOLD,14));
		rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		rotulo3.setFont(new Font("Courier New",Font.BOLD,12));
		rotulo4.setFont(new Font("Times New Roman",Font.BOLD,14));
		
		rotulo5.setFont(new Font("Arial",Font.BOLD,14));
		rotulo6.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		rotulo7.setFont(new Font("Courier New",Font.BOLD,12));
		rotulo8.setFont(new Font("Times New Roman",Font.BOLD,14));
		
                botão.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
          }
            
        });
                
		tela.add(botão);
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(rotulo3);
		tela.add(rotulo4);
		tela.add(rotulo5);
		tela.add(rotulo6);
		tela.add(rotulo7);
		tela.add(rotulo8);
		tela.add(texto1);
		tela.add(texto2);
		tela.add(texto3);
		tela.add(texto4);
		tela.add(texto5);
		tela.add(texto6);
		tela.add(texto7);
		tela.add(texto8);
		setSize(650,250);
		//setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		}

	public static void main(String[] args) {
		ExemploTextField app = new ExemploTextField();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
